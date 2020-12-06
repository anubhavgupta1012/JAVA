import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;
import javax.servlet.annotation.*;	

@WebServlet(name="ContextListenerServlet",
		urlPatterns={"/context"}
		)
public class ContextListenerServlet extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException{
		
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		pw.println("<html><body>");
		ServletContext ctx=getServletContext();
	
		Connection con=(Connection)ctx.getAttribute("con");
		
			try{
			
				Statement s =con.createStatement();
				
				ResultSet rs=s.executeQuery("select * from emp101");
				
				while(rs.next())
					{
					pw.println("name::"+rs.getString(1)+"<br>");
					pw.println("pass::"+rs.getString(2)+"<br>");
					pw.println("<br>");
					
					}


				}
			catch(Exception e1){}
			pw.println("</body></html>");
					

			}




						}