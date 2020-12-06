import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

 public class DemoServlet2 extends GenericServlet{
			PrintWriter p;
			static int count=0;

		

		public void service(ServletRequest req,ServletResponse res)throws ServletException, IOException
			{
				res.setContentType("text/html");
				 p=res.getWriter();
				p.println("<html><body>");
				p.println("Hello!! via Generic Servlet Interface "+count+"</br>");
				p.println("Reference ID::"+this+"</br>");
				
				

			try{
				Thread.sleep(10000);

				}
			catch(Exception e){
				System.out.println("Exception from Thread Sleeping of Generic Servlet");
					}
				p.println("Thread Name::"+Thread.currentThread().getName()+"</br>");
				p.println("</body></html>");			
			}

			public void destroy()
				{
				p.println("method Destroyed");
				count++;
				}	

			
			


}
