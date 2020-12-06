import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;


@WebServlet(name="RequestListenerServlet",
	    urlPatterns={"/request"}			
	)
public class RequestListenerServlet extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException 
		{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		System.out.println("after");
		String s1=(String)req.getAttribute("name");
		pw.println(s1);
		
			
		}
	
									



							}
