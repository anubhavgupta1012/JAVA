<html>
	<body>
		
	<%
	String firstno=request.getParameter("first");	
	String secondno=request.getParameter("second");	
	%>

	<jsp:useBean id="t1" class="my.MyBean" />
	<jsp:setProperty name="t1" property="*" />
	

	<%
	
	out.println("Sum ::"+t1.add());	
	%>
		
	</body>
</html>