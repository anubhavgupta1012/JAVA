import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class SendRedirectTest extends HttpServlet
	{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
		{
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			pw.println("<html><body>");
			pw.println("Before");
		
			String name=req.getParameter("name");
			String pass=req.getParameter("pass");
			
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","10121996");
			
				Statement s=c.createStatement();
				String s1="select * from emp101 where name='"+name+"' and password='"+pass+"'";

				ResultSet rs=s.executeQuery(s1);
				if(rs.next())
				{
				
				//res.sendRedirect("welcome.html");
				res.sendRedirect("wel");
				//res.sendRedirect("http://www.google.com");
				//res.sendRedirect("http://localhost:8090/TestServlet/form.html");
				}
				else
				{
				res.sendRedirect("err");
				}
				
		
			}
			catch(Exception e)
			{
			pw.println(e+"<br>");
			}
			pw.println("after");
			pw.println("</body></html>");
			
			
		}
	}