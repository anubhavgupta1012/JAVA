import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class LoginFilter implements Filter{
		FilterConfig config;
	public void init(FilterConfig config)
		{
		this.config=config;
		}
	
	public void doFilter(ServletRequest req,ServletResponse res, FilterChain fc)throws IOException,ServletException
		{
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		PrintWriter pw=res.getWriter();
	
		try	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","10121996");
		Statement s=c.createStatement();
		
		ResultSet rs=s.executeQuery("select * from emp101 where name='"+name+"' and password='"+pass+"'");
		
	
		if(rs.next())
			{config.getServletContext().setAttribute("credentials",rs);
			pw.println("LoginFilter Got Results !!<br>");
			fc.doFilter(req,res);
			}
		else
		pw.println("LoginFilter");
			}
		catch(Exception e)
			{}
		
		}
		public void destroy(){}
		


						}