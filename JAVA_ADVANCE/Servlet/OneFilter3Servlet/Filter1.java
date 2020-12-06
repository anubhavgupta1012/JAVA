import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Filter1 implements Filter{
	FilterConfig config;
	public void init(FilterConfig config)
		{
		config=config;
		}
		
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain fc)throws ServletException,IOException
		{
		res.getWriter().println("MyFilter 1<br>");
		fc.doFilter(req,res);
		}

	public void destroy()
		{
		}

					}
		