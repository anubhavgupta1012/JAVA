import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SessionListenerServlet extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException 
		{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		HttpSession hs=req.getSession();
		String s1=(String)hs.getAttribute("name");
		pw.println(s1+"\t"+hs.isNew());
		
			
		}
	
									



							}
