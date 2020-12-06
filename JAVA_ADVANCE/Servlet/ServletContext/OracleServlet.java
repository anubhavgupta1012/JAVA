import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;


public class OracleServlet extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
		{
		res.setContentType("text/html");
		ServletContext ctx=getServletContext();
		PrintWriter pw=res.getWriter();
		pw.println("<html><body>");
		
		String driver=ctx.getInitParameter("driver");
		String url=ctx.getInitParameter("url");
		String user=ctx.getInitParameter("user");
		String pass=ctx.getInitParameter("pass");
		
		try{
			Class.forName(driver);
			Connection c=DriverManager.getConnection(url,user,pass);
			
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("select * from emp101");
			
			while(rs.next())
				{	
				pw.println(rs.getString(1));
				pw.println(rs.getString(2)+"<br>");
				
				}
			
			}
		catch(Exception e)
			{
			}
		pw.println("</body></html>");
		
		
		
		}

}
