import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Enumeration;
	
	
public class HeaderServlet extends HttpServlet{
		PrintWriter out;
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
			res.setContentType("text/html");
			out=res.getWriter();
			
			Enumeration e=req.getHeaderNames();
			while(e.hasMoreElements())
				{
				String name=(String)e.nextElement();
				String value=req.getHeader(name);
				out.println(name+":"+value);
				out.println("<br>");
				
				}
			
			out.println("<br>");
			out.println("<br>");
			out.println("<br>");
			out.println("<br>");
			out.println("<br>");
			out.println("<br>");
			out.println("<br>");
			out.println("<br>");
			out.println("Protocol:"+req.getProtocol());
			out.println("<br>");
			
			out.println("Method:"+req.getMethod());
			out.println("<br>");

			
			out.println("URI:"+req.getRequestURI());
			out.println("<br>");
			
			out.println("Content Length:"+req.getContentLength());
			out.println("<br>");
		
			out.println("Content Type:"+req.getContentType());
			out.println("<br>");
										
										}		






						}