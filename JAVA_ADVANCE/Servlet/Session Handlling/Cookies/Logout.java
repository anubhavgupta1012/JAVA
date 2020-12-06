import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Logout extends HttpServlet{
		
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
		{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
			
		HttpSession s=req.getSession(false);
		if(s!=null){
		
		s.invalidate();
			
		pw.println("<html><body>");
		pw.println("You have Successfully LogOut<br>");
		pw.println("<a href='login.html'>LogIn</a>");
			pw.println("</body></html>");
				}
		else{
			pw.println("Please LoginFirst");
			}
					
				

		}
			
		}
