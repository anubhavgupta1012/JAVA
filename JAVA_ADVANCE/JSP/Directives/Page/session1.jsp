<html>
	<body>
	<%@	page import="java.sql.*" %>
	<%@	page import="java.util.*" %>	
	
	<%
	HttpSession s=request.getSession(false);
		
	if(s!=null)
		{	out.println("Session 1");
			String name=(String)s.getAttribute("name");
			String pass =(String)s.getAttribute("pass");
		
			out.println("Welcome "+name+"<br>"+"\t"+s.isNew());
			
		}
		else
		out.println("ERROR");
	
	%>

	</body>
</html>