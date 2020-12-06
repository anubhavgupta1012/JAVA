import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class err extends HttpServlet
	{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
		{
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			pw.println("<html><body>");
			
			
			pw.println(" Error From ERR Servlet");
			pw.println("</body></html>");
			
			
		}
	}