import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyFilter implements Filter{
			
FilterConfig config;

	public void init(FilterConfig config)throws ServletException
			{
			this.config=config;
			}					

	public void doFilter(ServletRequest req,ServletResponse res,FilterChain fc)throws IOException,ServletException
			{
		PrintWriter pw=res.getWriter();
		ServletContext con=config.getServletContext();
		Integer count=(Integer)con.getAttribute("count");
		
		if(count==null)
				{
				 count =new Integer(0);
				}
		count=new Integer(count.intValue()+1);
	
		con.setAttribute("count",count);
		pw.println("MyFilter Req Jaate hue</br></br>");
			
		fc.doFilter(req,res);
		pw.println("MyFilter res aate hue</br></br>");
		
		

			}
		
		public void destroy(){}

					}