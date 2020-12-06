<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<%@ page isErrorPage="true"%>
	
	
	<html>
		<body>	1::<b>Error :</b>${pageContext.exception}<br>
			2::<b>URI:</b>${pageContext.errorData.requestURI}<br>
			3::<b>StatusCode:</b>${pageContext.errorData.statusCode}<br>
			4::<c:forEach var="abc" items='${pageContext.exception.stackTrace}'>
					<p>${abc}</p>
			</c:forEach>

		</body>
	</html>