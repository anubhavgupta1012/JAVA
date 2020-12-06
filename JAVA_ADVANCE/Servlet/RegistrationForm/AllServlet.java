import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class AllServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
		{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("<html><body>");
		
		Enumeration e=req.getParameterNames();
		while(e.hasMoreElements())
		{
			String name=(String)e.nextElement();
			String value=req.getParameter(name);
			pw.println(name+"="+value);
			pw.println("</br>");
			
		}
		
	pw.println("</body></html>");
	
		}
}