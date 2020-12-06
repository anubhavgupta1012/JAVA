import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class HiddenFormFieldServlet extends HttpServlet{
							
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	pw.println("<html><body>");
	
	String name=req.getParameter("name");
	String pass=req.getParameter("pass");
	
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","10121996");
		Statement s=c.createStatement();
		ResultSet rs=s.executeQuery("select 8 from emp101 where name='"+name+"' and password='"+pass+"'");
		
		if(rs.next())
			{
			HttpSession se=req.getSession();
			String id=se.getId();
			pw.println(id+"<br>***************************************************************<br>");
			se.setAttribute("name",name);
			se.setAttribute("pass",pass);
			
			pw.println("USer is Valid "+se.isNew()+"<br>");
			
			pw.println("<form action='demo' method='get'>");
			pw.println("<input type='hidden' name='jsessionid' value='"+id+"'>");
			pw.println("<input type='submit' value='Demo'><br>");
			pw.println("<a href='log'>LogOUT</a>");
			pw.println("</form>");
			}
		else
		pw.println("user is invalid");
		}
	catch(Exception e)
		{}
		pw.println("</body></html>");

			}

						}
