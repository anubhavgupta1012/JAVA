import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyFilterServlet extends HttpServlet{
					
		public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
			res.setContentType("text/html");
			String s=(String)getServletContext().getAttribute("name");
			// String s1=(String)getInitParameter("driver");
			res.getWriter().println("Driver::"+s+"<br>"+s1+"<br>");
			
			}
						}