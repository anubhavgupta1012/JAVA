<%@ include file="view/partials/header.jsp"%>
<link rel="stylesheet" type="text/css" href="Stylesheets/login.css">
<script src="public/javascripts/validate.js"></script>
<%

	response.setHeader("Cache-Control","no-cachee, no-store, must-revalidate");
	response.setHeader("pragma","no-cache");
	response.setHeader("Expires","0");
	if(session.getAttribute("username")!=null)
	{
		response.sendRedirect("welcome.jsp");	
	}
%>


<div class="container-fluid bg">
	<div class="row">
		<div class="col-xs-12 col-md-4"></div>
		<div class="col-xs-12 col-md-4">

			<!--Form start -->

			<form action="login"  method="post" class="form-container"  name="LoginForm">
				<h1>LogIn</h1>
				<div class="form-group">

					<label for="exampleInputEmail1">Username</label> <input type="text"
						class="form-control" name="uname" aria-describedby="emailHelp"
						placeholder="Enter username"> <small id="emailHelp"
						class="form-text text-muted">We'll never share your email
						with anyone else.</small>
						<div id = "name_error" class="val_eror"></div>
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Password</label> <input
						type="password" class="form-control" name="pass"
						placeholder="Password">
						<div id = "password_error" class="val_eror"></div>
				</div>
				<div class="form-check">
					<input type="checkbox" class="form-check-input" id="exampleCheck1">
					<label class="form-check-label" for="exampleCheck1">Remember
						Me</label>
				</div>
				<button type="submit" class="btn btn-success btn-block">Login</button>
			</form>
			<!-- Form End-->
		</div>
		<div class="col-xs-12 col-md-4"></div>
	</div>
</div>

</body>
</html>