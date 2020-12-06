<html>
	<body>
	
	<%@	page import="java.sql.*" %>
	<%@	page import="java.util.*" %>
	<%
	
	String  name=request.getParameter("name");
	String  pass=request.getParameter("pass");
	
	try{
		out.println("45567");
	Class.forName("oracle.jdbc.driver.OracleDriver");  
  	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","10121996");  
  	Statement stmt=con.createStatement();  
    	ResultSet rs=stmt.executeQuery("select * from emp101 where name='"+name+"' and pass='"+pass+"'");  
	
	if(rs.next())  	
		out.println("VAlid User");
		
		else 
			out.println("Invalid  USer");
		}

		catch(Exception e)
			{	}
		
		
		

	%>


	</body>
</html>