import my.*;
import java.rmi.*;
import java.rmi.server.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class DemoServlet extends GenericServlet{

		public void service(ServletRequest req,ServletResponse res)throws IOException, ServletException
				{
				PrintWriter out=res.getWriter();
				res.setContentType("text/html");
				out.println("<html><body>");
				try
					{
					my.MyRemote m=(my.MyRemote)Naming.lookup("rmi://192.168.1.8:1099/ANUBHAV");
					out.println(m.add(15,13));	
					}


				catch(Exception e)
					{
					out.println(e);
					}

				out.println("</body></html>");
				}


						}