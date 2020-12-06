import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
 
public class RefreshServlet2 extends HttpServlet{
		static int c=0;
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
		{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("WELCOME TO ANUBHAV's SITE");
		res.setHeader("Refresh","5;https://warm-waters-96909.herokuapp.com");		
		
		}
						
	}  