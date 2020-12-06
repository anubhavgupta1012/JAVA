import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class MyCookies1 extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{

		res.setContentType("text/html");
		PrintWriter out=res.getWriter();

		Cookie []c=req.getCookies();
		
		if(c==null)
		{
		Cookie ck1=new Cookie("name","Anubhav");
		Cookie ck2=new Cookie("pass","10121996");
		
		res.addCookie(ck1);
		res.addCookie(ck2);
		
		ck1.setMaxAge(30*60);
		ck2.setMaxAge(30*60);
		out.println("Cookies Added");
		
		}
		
		else
		{
		out.println("<form>");
		out.println("<input type='text' value="+c[0].getValue()+">");
		out.println("<input type='password'value="+c[1].getValue()+">");
		out.println("<br>");
		out.println("</form>");
		}

				
}
	




}