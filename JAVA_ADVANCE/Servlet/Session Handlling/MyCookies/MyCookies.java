import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class MyCookies extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{

		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();

		Cookie []c=null;
		c=req.getCookies();
		
		if(c==null)
		{
		Cookie ck1=new Cookie("name","Anubhav");
		Cookie ck2=new Cookie("pass","10121996");
		
		res.addCookie(ck1);
		res.addCookie(ck2);
		pw.println("Cookies Added");
		}
		
		else
		{
		for(int i=0;i<c.length;i++)
			{	
			pw.println(c[i].getName()+"::"+c[i].getValue()+"<br>");
			}
		}

				
}
	




}