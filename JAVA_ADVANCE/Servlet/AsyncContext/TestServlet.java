
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

//@WebServlet(urlPatterns={"/test"})
public class TestServlet extends HttpServlet{


public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
		{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();

		pw.println("Test Servlet Started");

		try{
			
			Thread.sleep(10000);
			}
		catch(Exception e)
			{
			pw.println(e);
			}		
		}							
						}