import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class WelcomeServlet extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
			{res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
		
			ResultSet rs1=(ResultSet)getServletContext().getAttribute("credentials");
			
			String name=req.getParameter("name");
			pw.println("Welcome "+name+"<br>");
			
			try{
			
			
			if(rs1.next())
			{
			pw.println(rs1);
			pw.println(rs1.getString(1)+"::"+rs1.getString(2)+"<br>");
			}
			
			else 
			pw.println("rs1 is Empty <br>"+rs1);
	
					}
			catch(Exception e){pw.println(e);}
			
			}


						}