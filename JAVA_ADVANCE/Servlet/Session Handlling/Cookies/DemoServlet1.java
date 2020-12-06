import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class DemoServlet1 extends HttpServlet{
		
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
		{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
			
		HttpSession s=req.getSession();
		String name=(String)s.getAttribute("name");
		String pass=(String)s.getAttribute("pass");
			
		pw.println("<html><body>");
		pw.println("This is Demo Page</br>");
		pw.println(name+"\t"+pass+"\t"+s.isNew()+"<br>");
		
		pw.println("<a href='log'>Logout</a>");
		
			pw.println("</body></html>");
					
				

		}
			
		}
