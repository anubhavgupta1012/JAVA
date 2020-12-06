import java.io.*;
import java.util.*;
import java.text.DateFormat.*;
import javax.servlet.*;
import javax.servlet.http.*;

	public class DocxServlet extends HttpServlet{

	
		public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException		
			{
			String fileName="Dheeraj Resume.docx";
			ServletOutputStream stream=null;
			BufferedInputStream buf=null;
			
			stream=res.getOutputStream();

			//CheckBelow Line Again
			 String s1=getServletContext().getRealPath("/files/Dheeraj Resume.docx");
			
			File doc=new File(s1);
			res.setContentType("application/msword");
			res.addHeader("Content-Disposition","attachment;filename="+fileName);
			res.setContentLength((int)doc.length());
			
			
			buf=new BufferedInputStream(new FileInputStream(doc));
			int readBytes=0;
			
			while((readBytes=buf.read())!=-1)
				stream.write(readBytes);	
			
			
			
			}
}