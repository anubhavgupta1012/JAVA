<html>
	<body>
		<%
		
		String name =request.getParameter("name");
		String pass =request.getParameter("pass");
		
	RequestDispatcher rd=request.getRequestDispatcher("demo.jsp");
		rd.include(request,response);
		

		if(name.equals(pass))
			out.println("Valid User");
		
		else 
		out.println("Invalid User");
		
		%>

	</body>
</html>