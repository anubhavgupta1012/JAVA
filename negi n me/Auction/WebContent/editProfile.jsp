<%@ include file="view/partials/header.jsp"%>

<link rel="stylesheet" type="text/css" href="Stylesheets/login.css">
<div class="container-fluid bg">
	<div class="row">
		<div class="col-xs-12 col-md-4"></div>
		<div class="col-xs-12 col-md-4">

			<!--Form start -->

			<form class="form-container" action="signup" method="post">
				<h3>SignUp</h3>
				<div class="form-row">
					<div class="form-group col-md-6">
						<label for="inputUname">User Name</label> <input type="text"
							class="form-control" name="uname" id="inputUname"
							placeholder="User Name">
							<div id = "name_error" class="val_eror"></div>
					</div>

					<div class="form-group col-md-6">
						<label for="inputEmail4">Email</label> <input type="email"
							class="form-control" name="email" id="inputEmail4"
							placeholder="Email">
							<div id = "email_error" class="val_eror"></div>
					</div>
					<div class="form-group col-md-6">
						<label for="inputPassword4">Password</label> <input
							type="password" class="form-control" id="inputPassword4"
							name="pass1" placeholder="Password">
					</div>
					<div class="form-group col-md-6">
						<label for="inputPassword4"> Password</label> <input
							type="password" class="form-control" id="inputPassword4"
							name="pass2" placeholder="Password">
					</div>
					<div id = "password_error" class="val_eror"></div>
				</div>
				<div class="form-group">
					<label for="inputAddress">Address</label> <input type="text"
						class="form-control" id="inputAddress" name="add1"
						placeholder="1234 Main St">
				</div>
				<div class="form-group">
					<label for="inputAddress2">Address 2</label> <input type="text"
						class="form-control" id="inputAddress2" name="add2"
						placeholder="Apartment, studio, or floor">
				</div>
				<div class="form-row">
					<div class="form-group col-md-6">
						<label for="inputCity">City</label> <input type="text"
							class="form-control" name="city" id="inputCity">
					</div>
					<div class="form-group col-md-6">
						<label for="inputState">State</label> <select id="inputState"
							class="form-control" name="state">
							<option selected>Choose...</option>
							<option>Uttar Pradesh</option>
							<option>Uttarakhand</option>
							<option>Chandigarh</option>
							<option>Delhi</option>
						</select>
					</div>
				</div>
				<div class="form-row">
					<div class="form-group col-md-5">
						<label for="inputZip">Pin code</label> <input type="text"
							class="form-control" name="pin" id="inputZip">
					</div>
					<div class="form-group col-md-5">
						<label for="inputAge">Age</label> <input type="number"
							class="form-control" name="age" id="inputAge">
					</div>

				</div>
				
				<br>
				
				<button type="submit" class="btn btn-primary">Sign Up</button>
			</form>
		</div>
		<div class="col-xs-12 col-md-4"></div>
	</div>
</div>
</body>
</html>