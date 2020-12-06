<html>
	<body>
		
	

	<jsp:useBean id="t1" class="my.MyBean"  scope="session" />
	<jsp:getProperty name="t1" property="first" />
	<jsp:getProperty name="t1" property="second" />

	<%
	
	out.println("Sum ::"+t1.add());	
	%>
		
	</body>
</html>