<html>
	<body>
		<%
		Cookie ck=new Cookie("name","Anubhav");
		Cookie ck1=new Cookie("name1","Anubhav1");
		response.addCookie(ck);
		response.addCookie(ck1);
		out.println("Cookie Added<br>");
		%>

		<a href="printcookie.jsp"> Click Here</a>		

	</body>
</html>