import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;


public class RequestServlet extends HttpServlet
	{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
			{
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			pw.println("<html><body></br>");
			String s=req.getMethod();
			pw.println(s);
			if(s.equals("POST"))
				doPost(req,res);
			
			else if(s.equals("GET"))
				doGet(req,res);
	
			}

/*	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
			{
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			pw.println("<html><body></br>");
			String name=req.getParameter("name");
			String pass=req.getParameter("pass");

			if(name.equals(pass))
				pw.println("user is valid through Service()");
			else
				pw.println("user isn't valid through Service()");
			pw.println("</body></html>");
	
			}
*/

	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
			{
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			pw.println("<html><body></br>");
			String name=req.getParameter("name");
			String pass=req.getParameter("pass");
			try
				{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","10121996");
				Statement s=c.createStatement();
				int x=s.executeUpdate("insert into emp101 values('"+name+"' ,'"+pass+"')");
				ResultSet rs=s.executeQuery("select * from emp101");
				ResultSetMetaData rsmd=rs.getMetaData();
				pw.println("<table bg-color='yellow' border='1' width='200'>");
				pw.println("<tr");

				for(int i=1;i<rsmd.getColumnCount();i++)
					pw.println("<th>"+rsmd.getColumnName(i)+"</th>");
				while(rs.next())		
					{
					pw.println("<tr>");
					pw.println("<td>"+rs.getString(1)+"</td>");
					pw.println("<td>"+rs.getString(2)+"</td>");
					pw.println("<tr>");
					
					}

				}
				
			catch(Exception e){}
			
			pw.println("</table>");
			if(name.equals(pass))
			pw.println("USer is Post VAlid");
			
			else
				pw.println("USer is Post INVAlid");


			pw.println("</body></html>");

		}


	
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
			{
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			pw.println("<html><body></br>");
			String name=req.getParameter("name");
			String pass=req.getParameter("pass");
			if(name.equals(pass))
			pw.println("USer is GEt VAlid");
			
			else
			pw.println("USer is GEt INVAlid");

			pw.println("</body></html>");
			}	



	}
