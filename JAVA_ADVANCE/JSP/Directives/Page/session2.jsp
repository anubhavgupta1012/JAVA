<html>
	<body>
	<%@	page import="java.sql.*" %>
	<%@	page import="java.util.*" %>	
	
	<%
			out.println("Session 2<br>");
			out.println(session+"<br>");
			String name=(String)session.getAttribute("name");
			String pass =(String)session.getAttribute("pass");
			out.println("Welcome "+name+" "+pass+"<br>"+"\t"+session.isNew());
			
		
		
	
	%>

	</body>
</html>