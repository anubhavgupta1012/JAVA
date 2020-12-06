import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;  

public class LoginServlet extends HttpServlet{
		PrintWriter pw;
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
		{
		res.setContentType("text/html");
		pw=res.getWriter();		
		pw.println("<html><body>");
		String name=req.getParameter("name");
		String password=req.getParameter("pass");
		
		try{
		
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","10121996");
			
			Statement s=c.createStatement();
			String s1="select * from emp101 where name='"+name+"' and password='"+password+"'";

			ResultSet rs=s.executeQuery(s1);
			if(rs.next())
			pw.println("User is valid");
			
			else
			pw.println("Not Valid");			


		}
		catch(Exception e)
		{
		pw.println("Exception Generated</br>");
		pw.println(e);
		
		}	


		}


}