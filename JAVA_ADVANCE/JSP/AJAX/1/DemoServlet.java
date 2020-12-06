 import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class DemoServlet extends GenericServlet{

	public void service(ServletRequest req, ServletResponse res)throws ServletException,IOException
			{

			PrintWriter out=res.getWriter();
			String s=(String)req.getParameter("name1");
			String s1=(String)req.getParameter("name2");
			out.println("<html><body>HELLO WITH AJAX "+s+"<br>");
			out.println("HELLO WITH AJAX "+s1);
			out.println("</body></html>");
				
			}
	
}
