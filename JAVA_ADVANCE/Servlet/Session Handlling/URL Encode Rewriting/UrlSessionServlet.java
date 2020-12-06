import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;


public  class UrlSessionServlet extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
	
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("<html><body>");
			
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");

		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");	
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","10121996");
		Statement s=c.createStatement();		
		ResultSet rs=s.executeQuery("select * from emp101 where name='"+name+"' and password='"+pass+"'");

		if(rs.next())
		{
			HttpSession se=req.getSession();
			se.setAttribute("name",name);
			se.setAttribute("password",pass);
		
			 pw.println("User is valid"+se.isNew()+"<br>");
	
			String url1=res.encodeURL("demo");
			String url2=res.encodeURL("log");
			
			pw.println(url1+"<br>"+url2+"<br>********************************************************<br>");

			pw.println("<a href='"+url1+"'>DEMO</a>");
			pw.println("<br>");
			pw.println("<a href='"+url2+"'>LOGOUT</a>");
		}
		
		else
		pw.println("User is Invalid");
		
			
			}
		catch(Exception e){pw.println(e);}

		
		pw.println("</body></html>");
			


				}




}