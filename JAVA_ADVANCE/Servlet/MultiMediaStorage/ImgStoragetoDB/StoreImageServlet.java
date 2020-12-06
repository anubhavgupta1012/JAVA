import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.oreilly.servlet.*;
import java.sql.*;

public class StoreImageServlet extends HttpServlet{

	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
		{ 
		PrintWriter out=res.getWriter();
		
		String path=getServletContext().getRealPath("image");
		MultipartRequest mpr=new MultipartRequest(req,path,500*1024*1024);
		
		String path1=mpr.getOriginalFileName("file");

		String path2=path+"/"+path1;
		FileInputStream fin=new FileInputStream(path2);

		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");  
  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","10121996");  
		
		PreparedStatement ps=con.prepareStatement("insert into img values(?,?)");
		ps.setBinaryStream(2,fin,fin.available());
		ps.setString(1,"101");
		ps.executeUpdate();
		con.close();
			}
		catch(Exception e){}

	
		
		out.println("<html><body>");
		out.println("File Uploaded Successfully ");
		out.println("</body></html>");
		
		
		}

						


						}