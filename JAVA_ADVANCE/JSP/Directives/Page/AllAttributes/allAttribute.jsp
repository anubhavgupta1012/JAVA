<html>
	<body>
	<%@	page contentType="application/vnd.ms-excel" session="true" buffer="100kb" autoFlush="true" errorPage="err.jsp"
		isErrorPage="true" isThreadSafe="false" extends="my.Temp" isELIgnored="true" info="Hi to all"
	%>

	<% 	
	out.println("name\tHINDI\tENGLISH");
	out.println("ABC\t10\t20");
	%>
			
	</body>

</html>