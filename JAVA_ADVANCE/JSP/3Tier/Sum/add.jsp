<html>
	<body>
		
	<%
	String firstno=request.getParameter("f");	
	String secondno=request.getParameter("s");	
	%>

	<jsp:useBean id="t1" class="my.MyBean" />
	<jsp:setProperty name="t1" property="first" value='<%= firstno %>'	/>
	<jsp:setProperty name="t1" property="second" value='<%= secondno %>'	/>

	<%
	int r=t1.add();
	out.println("Sum ::"+r);	
	%>
		
	</body>
</html>