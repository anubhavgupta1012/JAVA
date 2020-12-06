import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class DemoServlet extends HttpServlet{
		
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
		{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
			
		HttpSession s=req.getSession(false);

		if(s!=null){
			String name=(String)s.getAttribute("name");
			String pass=(String)s.getAttribute("pass");
			
			pw.println("<html><body>");
			pw.println("This is Demo Page</br>");
			pw.println(name+"\t"+pass+"\t"+s.isNew()+"<br>");
		
			String url=res.encodeURL("log");
		
			pw.println("<a href='"+url+"'>Logout</a>");
			pw.println("</body></html>");
				}
			
		else{
			pw.println("You Must Login First for Demo page");
			}
					
				

		}
			
		}
