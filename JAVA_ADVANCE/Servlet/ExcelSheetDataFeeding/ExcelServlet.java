import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ExcelServlet extends HttpServlet{
			PrintWriter pw;
		public void service(HttpServletRequest req,HttpServletResponse res)throws IOException{
				
				res.setContentType("application/vnd.ms-excel");
				pw= res.getWriter();
				
				pw.println("Name\tHindi\tEnglish\tMaths\tTotal");
				pw.println("Anubhav\t86\t71\t83\t=sum(b2:d2)");
					
					}

						}



