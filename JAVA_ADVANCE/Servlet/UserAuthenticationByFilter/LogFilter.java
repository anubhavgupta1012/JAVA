import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LogFilter implements Filter{
		FilterConfig config;
	public void init(FilterConfig config){
		this.config=config;
						}

	public void doFilter(ServletRequest req,ServletResponse res,FilterChain fc)throws ServletException,IOException
		{
		PrintWriter pw=res.getWriter();
		pw.println("LogFilter Above!!<br>");
		long start =System.currentTimeMillis();
		String address=req.getRemoteAddr();
		String file=((HttpServletRequest)req).getRequestURI();
		config.getServletContext().log("User Access!!"+
						"UserIP: "+address+
						"Resources "+file+
						"Millisec used"+(System.currentTimeMillis()-start));	
			
		fc.doFilter(req,res);
		
		
		pw.println("LogFilter below!!<br>");
		}
		
		public void destroy()
			{}

					}
					