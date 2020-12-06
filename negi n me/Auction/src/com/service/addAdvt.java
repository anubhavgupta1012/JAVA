package com.service;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import com.dao.addAdvtDao;

@WebServlet("/addAdvt")
public class addAdvt extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = null;
		String minBid= null;
		String buyNow = null;
		String desc = null;
		String fileName = null;
		String date = null;
		HttpSession session = request.getSession();
		
		addAdvtDao dao = new addAdvtDao();

		String seller = (String) session.getAttribute("username");
		
	ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
		try {
			List<FileItem> multifiles = sf.parseRequest(request);
			for(FileItem item: multifiles) {
				
				item.write(new File("C:\\Users\\Abhishek\\eclipse-workspace_1\\Auction\\WebContent\\images\\"+ item.getName()));
				
			}
			Iterator iter = multifiles.iterator();
			while (iter.hasNext()) {
			    FileItem item = (FileItem) iter.next();
			    if(item.getFieldName().equals("name"))
		        {   
		          name=item.getString();
		        }			
			    
			    if(item.getFieldName().equals("Mbid"))
		        {   
		          minBid=item.getString();
		        }
			    
			    if(item.getFieldName().equals("Bnow"))
		        {   
		          buyNow=item.getString();
		        }
			    
			    if(item.getFieldName().equals("describe"))
		        {   
		          desc=item.getString();
		        }
			    if(item.getFieldName().equals("date"))
		        {   
		          date=item.getString();
		        }
			    if (!item.isFormField()) 
			         fileName = item.getName();
			}
			
			SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
			Date dt = d.parse(date);
			java.sql.Date sqlDate = new java.sql.Date(dt.getTime());
			
			System.out.println("Done");
	
		//	String image= fileName;
		
		
	
		
		System.out.println(name + " "+fileName+ " "+ minBid+ " "+ buyNow+ " "+ desc+ " "+ seller+ " ");
		
			dao.connect();
			dao.addAdvt(name, fileName, minBid, buyNow, desc, seller, sqlDate);
			response.sendRedirect("welcome.jsp");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		
	}

}
