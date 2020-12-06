<%@ page isThreadSafe="true" %>
		
	
<html>
		
	<body>
	<%	
	out.println(Thread.currentThread().getName());
	%>

	<%
	out.println("<br>"+this);

		try{
			Thread.sleep(10000);
		
		}
		catch(Exception e)
			{
			
			}
	%>
	</body>

</html>