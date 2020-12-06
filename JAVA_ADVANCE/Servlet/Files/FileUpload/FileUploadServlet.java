
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

///I have Included the class File of MultiPart;
//*****************************
import com.oreilly.servlet.*;
//******************************

 public class FileUploadServlet extends HttpServlet{
		
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
		{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String path=getServletContext().getRealPath("/file");
		MultipartRequest mpr=new MultipartRequest(req,path,1024*1024*512);
		String str=mpr.getOriginalFileName("file");
		
		pw.println("<html><body>");
		pw.println("File Uploaded SuccessFully :"+str);
		pw.println("</body></html>");
		
		}

						
	

}