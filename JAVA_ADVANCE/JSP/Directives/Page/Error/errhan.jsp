<%@ page isErrorPage="true" 
	import ="java.io.*"	
	%>

<html>
	<body>

	This is the Exception Page
	<%= exception +"<br><br><br><br>"%>
	
	<% 	exception.printStackTrace(new PrintWriter(out)); %>
	</body>
</html>