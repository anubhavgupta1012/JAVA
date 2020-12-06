	var username = document.forms["LoginForm"]["uname"];
	var pass1 = document.forms["LoginForm"]["pass1"];
	//var pass2 = document.myForm.pass2.value;
	//Getting all errors display object

	var name_error =document.getElementById("name_error");
	//var email_error = document.getElementById("email_error");
	var password_error = document.getElementById("password_error");

	//Setting all event listener

	//username.addEventListener("blur", nameVerify, true);
	//email.addEventListener("blur", emailVerify, true);
	//password.addEventListener("blur", passwordVerify, true);

//var username, pass1, name_error, password_error;

//Validate Function

function validate(){
	
	
	if(username.value = ""){
		username.style.border = "1px solid red";
		name_error.textContent = "Username is required";
		username.focus();
		return false;
	}
	
	if(pass1.value = ""){
		pass.style.border = "1px solid red";
		password_error.textContent = "Username is required";
		password.focus();
		return false;
	}	
	
}

function nameVerify(){
	if(username.value!=""){
	username.style.border = "1px solid #5E6E66";
	name_error.innerHTML = "";
	return true;
	}
	
}
function passwordVerify(){
	if(password.value!=""){
	password.style.border = "1px solid #5E6E66";
	password_error.innerHTML = "";
	return true;
	
}
}



