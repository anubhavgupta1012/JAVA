<html>
	<body>
		
	
	<jsp:useBean id="t1" class="my.MyBean"  scope="session"/>
	<jsp:setProperty name="t1" property="*" />
	<%
	out.println("Data set Successfully");
		
	%>		
	</body>
</html>