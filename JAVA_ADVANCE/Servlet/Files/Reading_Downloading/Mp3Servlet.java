import java.io.*;
import java.util.*;
import java.text.DateFormat.*;
import javax.servlet.*;
import javax.servlet.http.*;

	public class Mp3Servlet extends HttpServlet{

	
		public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException		
			{
			String fileName="Rap God.mp3";
			ServletOutputStream stream=null;
			BufferedInputStream buf=null;
			
			stream=res.getOutputStream();

			//CheckBelow Line Again
			 String s1=getServletContext().getRealPath("/files/Rap God.mp3");
			
			File doc=new File(s1);
			res.setContentType("audio/mpeg");
			//res.addHeader("Content-Disposition","attachment;filename="+fileName);
			res.setContentLength((int)doc.length());
			
			
			buf=new BufferedInputStream(new FileInputStream(doc));
			int readBytes=0;
			
			while((readBytes=buf.read())!=-1)
				stream.write(readBytes);	
			
			
			
			}
}