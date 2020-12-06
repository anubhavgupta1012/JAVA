import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class LoginServlet extends HttpServlet{
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
			String s1="select * from emp101 where name='"+name+"' and password='"+pass+"'";
			 ResultSet rs=s.executeQuery(s1);
				
			
			if(rs.next())
				{
				
				HttpSession se=req.getSession();
				se.setAttribute("name",name);
				se.setAttribute("pass",pass);
				
				pw.println("User is Valid "+se.isNew());
				pw.println("<br>");
				
				}
			
			else{	
				pw.println("User is not Valid");
				}
			}
			catch(Exception e){}
		
			pw.println("</body></html>");
		}		

							}
