import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.servlet.annotation.*;


@WebListener
public class MyContextListener implements ServletContextListener{
Connection c;

	public void contextInitialized(ServletContextEvent e)
		{
		try{
			ServletContext ctx=e.getServletContext();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","10121996");

			ctx.setAttribute("con",c);
			System.out.println("Context created\n\n");
				
			}
		catch(Exception e2)
				{
				}
		}
	
	public void contextDestroyed(ServletContextEvent e){
		    
		try{
		c.close();	
	
		}
		catch(Exception e1){}
				}



							}