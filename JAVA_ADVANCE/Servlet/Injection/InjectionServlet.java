
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;
import javax.inject.*;


@WebServlet(name="InjectionServlet",urlPatterns={"/"})
public class InjectionServlet extends HttpServlet{


	@Inject MyBean mb;
	//MyBean mb=new MyBean();
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
				
				res.setContentType("text/html");
				PrintWriter pw=res.getWriter();
				pw.println(mb.getMessege());
									}



						}