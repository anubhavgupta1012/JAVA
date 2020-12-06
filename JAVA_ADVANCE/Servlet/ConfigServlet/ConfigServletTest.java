//ConfigServlet.java

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ConfigServletTest extends HttpServlet{
		ServletConfig con;
	public void service(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
		{
		con=getServletConfig();
		//Enumeration e=con.getInitParameter("image");
			
		//String image=con.getInitParameter("image");
		//String driver=con.getInitParameter("driver");	
	
		String image=getInitParameter("image");
		String driver=getInitParameter("driver");	
		
		res.setContentType("text/html");
		
		PrintWriter pw=res.getWriter();
		pw.println("<html><body background="+image+">");

		pw.println(driver);
		pw.println("</body></html>");

		}



}