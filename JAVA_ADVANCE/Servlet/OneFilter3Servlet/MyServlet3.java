import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyServlet3 extends HttpServlet{

	public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException
		{
		res.setContentType("text/html");
		res.getWriter().println("MyServlet3");
		}
		
					}
	