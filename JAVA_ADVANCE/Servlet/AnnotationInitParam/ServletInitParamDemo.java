import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(
urlPatterns={"/nowebxml"},
initParams={
@WebInitParam(name="email",value="anubhavgupta1012@gmail.com"),
@WebInitParam(name="phone",value="9044648866")	
	}
)
public class ServletInitParamDemo extends HttpServlet
{
	private String email="",phone="";
	public ServletInitParamDemo ()
			{
			super();			
			}
	
	public void init(ServletConfig config)throws ServletException
		{
		super.init(config);
		email=config.getInitParameter("email");
		phone=config.getInitParameter("phone");
		
		}
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
		{
		res.setContentType("text/html");
		String str="<h2> Access data using @WebInitParam</h2>";
		
		PrintWriter pw=res.getWriter();
		str+="<h3>Email:"+email+"<br>PhoneNo:"+phone+"</h3></body></html>";

		pw.println(str);
		}


}

