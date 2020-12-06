import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;


@WebServlet(name="MyAnnotationServlet",urlPatterns={"/hello"})

public class MyAnnotationServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
		{

		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("<h2>Hello World Servlet Annotation</h2>");
		}
		
	}