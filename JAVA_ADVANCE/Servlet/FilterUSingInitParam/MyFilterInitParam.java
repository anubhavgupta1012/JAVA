import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyFilterInitParam implements Filter{
		FilterConfig config;
		public void init(FilterConfig config)
			{
			this.config=config;
			}

		public void doFilter(ServletRequest req, ServletResponse res,FilterChain fc)throws IOException,ServletException{
			
				String s=(String)config.getInitParameter("driver");
				config.getServletContext().setAttribute("name",s);
				res.getWriter().println("MyFilter1 ::"+s+"<br>");
				
				fc.doFilter(req,res);
				}
		public void destroy(){
						}


							}