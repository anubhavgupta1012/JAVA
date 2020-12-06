import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

 public class DemoServlet1 implements Servlet{
		public void init(ServletConfig con)
			{
			}

		public void service(ServletRequest req,ServletResponse res)throws ServletException, IOException
			{
				res.setContentType("text/html");
				PrintWriter p=res.getWriter();
				p.println("<html><body>");
				p.println("Hello!! via servlet Interface</br>");
				p.println("Reference ID::"+this);
				p.println("Thread Name::"+Thread.currentThread().getName());
				

			try{
				Thread.sleep(10000);

				}
			catch(Exception e){
				System.out.println("Exception from Thread Sleeping");
					}
				p.println("</body></html>");			
			}

			public void destroy()
				{
				}	

			public ServletConfig getServletConfig(){
				
				return null;				
					}
			
			public String getServletInfo()
				{
				
				return null;
				}
			


}
