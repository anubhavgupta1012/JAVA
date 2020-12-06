import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
 
public class RefreshServlet extends HttpServlet{
		static int c=0;
	public void service(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
		{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		res.setHeader("Refresh","1");		
		pw.println(new Date().toString()+"<br><br><br>"+c+++" hiii");
		}
						
	}  