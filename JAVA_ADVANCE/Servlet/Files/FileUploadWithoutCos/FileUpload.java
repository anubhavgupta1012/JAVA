import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns={"/file"})
@MultipartConfig(location="C:\\Users\\anubh\\OneDrive\\Documents\\JAVA\\JAVA_ADVANCE\\Servlet\\Files\\FileUploadWithoutCos\\f2",fileSizeThreshold=1024*1024,maxFileSize=1024*1024*5,maxRequestSize=1024*1024*5*5)
public class FileUpload extends HttpServlet{

		public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
				{
				String fileName=req.getParameter("filename");
				Part p=req.getPart("content");
				p.write(fileName+".txt");
				
				if(req.getPart("content")!=null)
					res.getWriter().println("<h3>File SucessFully Uploaded</h3>");
				
				}
						
					}