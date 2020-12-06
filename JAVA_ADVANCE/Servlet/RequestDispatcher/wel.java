import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class wel extends HttpServlet
	{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
		{
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			pw.println("<html><body>");
			
			
			pw.println("Welcome From Welcome Servlet");
			pw.println("</body></html>");

			pw.println("WEl "+req.getAttribute("A1"));
			pw.println("WEl "+req.getAttribute("A2"));
			
			
		}
	}