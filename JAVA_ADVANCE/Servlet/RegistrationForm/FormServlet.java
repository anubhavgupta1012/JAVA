import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class FormServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
		{
		ServletOutputStream out=res.getOutputStream();
		res.setContentType("text/html");
		
		out.println("<html><head><title>Basic From Proceessor Output</title></head><body>");
		out.println("<h1>Here is Your Form Data</h1>");

		String title=req.getParameter("title");
		String name=req.getParameter("name");
		String city=req.getParameter("city");
		String country=req.getParameter("country");
		String tel=req.getParameter("tel");
		String age=req.getParameter("age");

		String[] interests=req.getParameterValues("Interest");
	
		out.println("Your Title is::"+title);
		out.println("</br>Your Name is::"+name);
		out.println("</br>Your city is::"+city);
		out.println("</br>Your country is::"+country);
		out.println("</br>Your tel is::"+tel);
		out.println("</br>Your interests are ::<ul>");
		
		for(int i=0;i<interests.length;i++)
		out.println("<li>"+interests[i]+"</li></ul>");
	
		out.println("</br>Your age is::"+age );
		out.println("</body></html>");
		
		


}
}