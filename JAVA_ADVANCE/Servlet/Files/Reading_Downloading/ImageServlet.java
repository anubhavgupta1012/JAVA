import java.io.*;
import java.util.*;
import java.text.DateFormat.*;
import javax.servlet.*;
import javax.servlet.http.*;

	public class ImageServlet extends HttpServlet{

	
		public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException		
			{
			String fileName="wolverine.jpg";
			ServletOutputStream stream=null;
			BufferedInputStream buf=null;
			
			stream=res.getOutputStream();

			//CheckBelow Line Again
			 String s1=getServletContext().getRealPath("/files/wolverine.jpg");
			
			File doc=new File(s1);
			res.setContentType("image/jpeg");
			//res.addHeader("Content-Disposition","attachment;filename="+fileName);
			res.setContentLength((int)doc.length());
			
			
			buf=new BufferedInputStream(new FileInputStream(doc));
			int readBytes=0;
			
			while((readBytes=buf.read())!=-1)
				stream.write(readBytes);	
			
			
			
			}
}