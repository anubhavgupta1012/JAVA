
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;

@WebServlet(value="/acs",asyncSupported=true,loadOnStartup=1)
public class AsyncContextExample extends HttpServlet{

public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
		{
		doGet(req,res);	
		}

public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
		{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();

		AsyncContext ac=req.startAsync();
			ac.setTimeout(0);
		
		pw.println("Is Async Started::"+ac.getRequest().isAsyncStarted());
			
		ac.dispatch("/hello");
		pw.println("<br>Asynchronous task finished");
		
		
				
		}							
						}