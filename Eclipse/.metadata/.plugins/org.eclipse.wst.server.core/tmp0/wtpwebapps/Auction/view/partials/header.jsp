<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Auction</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="Stylesheets/main.css">
<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!-- Font AWESOME -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-migrate/3.0.1/jquery-migrate.js"></script>
</head>
<body>

	<nav class="nav navbar-default">
	<div class="container-fluid">
		<div class="navbar-header">
			<a href="welcome.jsp" class="nav navbar-nav navbar-brand">Auction</a>
		</div>
		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav navbar-right">
				<% %>
				<% if(session.getAttribute("username")==null)
            	{%>
				<li><a href="login.jsp">login</a></li>
				<li><a href="signup.jsp">sign-up</a></li>
				<%}else{ %>
				<li><a href="myadvt.jsp">My Advertisements</a></li>
				<li><a href="#">My Orders</a></li>
				<li><a href="#">Signined as ${username}</a></li>
				<li><a href="logout">log out</a></li>
				<%} %>
			</ul>
		</div>
	</div>
	</nav>

	<!--  NAVBAR ENDS HERE 	-->