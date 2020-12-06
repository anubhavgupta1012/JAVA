<%@ page isELIgnored="false"%>	

<html>
		<head>
			<title> Expression Language</title>

		</head>
		<body>

		<jsp:useBean id="t1" class="my.MyBean"/>
		<jsp:setProperty name="t1" property="name" value="Anubhav"/>
		<jsp:setProperty name="t1" property="college" value="ABES"/>

		${t1.name}
		<br>
		${t1.college}
		<br>

		${t1.add(100,200)}<br>
		${t1.validate()}
		</body> 

</html>
		
		