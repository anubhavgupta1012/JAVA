<html>

	<body>
	<%!

	String s;
	
	public void jspInit(){
		ServletConfig con=getServletConfig();
		s=con.getInitParameter("name");
				}		
	%>
	<%
	String s1=config.getInitParameter("name1");
	String s2=application.getInitParameter("name");

	out.println(s+"<br>"+s1+"<br>"+s2);
	%>

		

	</body>
</html>