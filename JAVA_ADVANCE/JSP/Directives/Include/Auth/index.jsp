

<%	
	String name=request.getParameter("name");
	String password=request.getParameter("password");
%>

	<jsp:forward page="demo1.jsp">

	<jsp:param name='name' value='<%=name %>' />
	<jsp:param name='password' value='<%=password %>' />

	</jsp:forward>
	
<%="example of include action"%>
