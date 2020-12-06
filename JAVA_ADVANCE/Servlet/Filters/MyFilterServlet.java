import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyFilterServlet extends HttpServlet{
								
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
			{
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			ServletContext ctx=getServletContext();
			Integer count=(Integer)ctx.getAttribute("count");		
			
			pw.println("Before Count<br>");
			pw.println("Via Servlet::"+count.intValue());
			pw.println("After Count<br>");	
						
			}

						}