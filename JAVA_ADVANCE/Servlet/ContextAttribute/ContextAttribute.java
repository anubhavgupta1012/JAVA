import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class ContextAttribute extends HttpServlet{
		PrintWriter pw;
		//Integer count;
		public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
			{
			res.setContentType("text/html");
			pw=res.getWriter();
			ServletContext ctx=getServletContext();
			Integer count=(Integer) ctx.getAttribute("count");
			if(count==null)
				count=new Integer(0);
			
			count=new Integer(count.intValue()+1);
			ctx.setAttribute("count",count);
			pw.println(count.intValue()); 
				
			
			}
}
