import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyFilter1 implements Filter{
			
FilterConfig config;

	public void init(FilterConfig config)throws ServletException
			{
			this.config=config;
			}					

	public void doFilter(ServletRequest req,ServletResponse res,FilterChain fc)throws IOException,ServletException
			{
		PrintWriter pw=res.getWriter();
		ServletContext con=config.getServletContext();
		
		pw.println("MyFilter1 Req Jaate hue</br></br>");
			
		fc.doFilter(req,res);
		pw.println("MyFilter1 res aate hue</br></br>");
		
		

			}
		
		public void destroy(){}

					}