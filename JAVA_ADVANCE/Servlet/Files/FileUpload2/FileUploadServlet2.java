
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;



 public class FileUploadServlet2 extends HttpServlet{
		PrintWriter pw;
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
		{
		
		try{
		res.setContentType("text/html");
		
		ServletOutputStream out=res.getOutputStream();
		ServletInputStream in=req.getInputStream();
		 pw=res.getWriter();
		FileOutputStream fout=new FileOutputStream("/file");
		
		int i=0;
		
			while((i=in.read())!=-1)
				fout.write(i);
		
		
		pw.println("File Uploaded SuccessFully");

		}

		catch(Exception e){
			
			pw.println(e);}	
	}					
	

}