<html>
	<body>
	<%@	page import="java.sql.*" %>
	<%@	page import="java.util.*" %>	
	
	<%
	String name=request.getParameter("name");
	String pass=request.getParameter("pass");
		
	try{	out.println(session);
		Class.forName("oracle.jdbc.driver.OracleDriver");  
  		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","10121996");  
  		Statement stmt=con.createStatement();  
    		ResultSet rs=stmt.executeQuery("select * from emp101 where name='"+name+"' and pass='"+pass+"'");  
	
		if(rs.next()){
		
		HttpSession s=request.getSession();
		s.setAttribute("name",name);
		s.setAttribute("pass",pass);
		out.println("Data Set SuccessFully	"+s.isNew()+"<br>");

		out.println("<a href='session2.jsp'>Session 2</a>");
		out.println("<a href='session1.jsp'>Session 1</a>");
				}

		else
			out.println("USer is Invalid");
			
		}

		catch(Exception e)
			{	}
	
	%>

	</body>
</html>