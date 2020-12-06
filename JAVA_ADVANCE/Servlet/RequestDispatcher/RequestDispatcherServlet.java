import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class RequestDispatcherServlet extends HttpServlet
	{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
		{
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			pw.println("<html><body>");
			pw.println("Before<br>");
		
			req.setAttribute("A1","123");
			req.setAttribute("A2","234");
			
			String name=req.getParameter("name");
			String pass=req.getParameter("pass");
			
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","10121996");
			
				Statement s=c.createStatement();
				String s1="select * from emp101 where name='"+name+"' and password='"+pass+"'";

				ResultSet rs=s.executeQuery(s1);
				pw.println("Before Dispatching<br> ");
				if(rs.next())
				{
				RequestDispatcher rd=req.getRequestDispatcher("/wel");
				rd.include(req,res);
				//rd.forward(req,res);
				
				}
				else
				{
				RequestDispatcher rd=req.getRequestDispatcher("/err");
				rd.include(req,res);
				//rd.forward(req,res);
				}
				
		
			}
			catch(Exception e)
			{
			pw.println(e+"<br>");
			}
			pw.println("<br>after<br>");
			pw.println("</body></html>");
			
			
		}
	}