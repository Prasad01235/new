<%@ page language="java" contentType="text/html"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Register</title>
<script>
function validpassword(){
	var password=document.myform.psw.value;
	var cppassword=document.myform.cpw.value;
    if(password==cppassword)
    	{
    	return true;
    	}
    else{
    	alert("password and confirm pasword must be same");
    	return false;
    }
    }
function generate1(){
	document.myform.action='welcome.html';
	document.myform.cancel();
}
}
</script>
</head>
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background:url('../img/showcase.jpg') no-repeat 0 -400px;
}

* {
  box-sizing: border-box;
}

/* Add padding to containers */
.container {
  padding: 16px;
  background-color: #b0d0d0;
}

/* Full-width input fields */
input[type=text], input[type=password], input[type=number]{
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.registerbtn:hover {
  opacity: 1;
}
.registerbtn1 {
  background-color: blue;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}
.registerbtn1:hover {
  opacity: 1;
}

/* Add a blue text color to links */
a {
  color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
  background-color: #f1f1f1;
  text-align: center;
}
</style>
<body>
<form name="myform" onsubmit="return validpassword()" 
action="http://localhost:8091/OurDoctor/Register1">

    <div class="container">
    <h1>Register</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

	<label><b>Name</b></label>
    <input type="text" placeholder="Enter Name" name="name" required>
    
    <label><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" required>
	
	<label><b>Phone number</b></label>
	<input type="number"  placeholder="Enter phone number" name="phone"required>
	
    <label>
    <b>Password</b>
    <input type="password" placeholder="Enter Password" name="psw"required>
	</label>
	<label>
   <b>Confirm Password</b> 
   <input type="password" placeholder="Repeat Password" name="cpw"required>
   </label>
    <hr>
    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
   <input type="submit" value="REGISTER" class="registerbtn"/>
   <input type="submit" value="BACK" class="registerbtn1"name="back" onclick="generate1();"/>
   </div>
  </form>
  <div class="container signin">
    <p>Already have an account? <a href="http://localhost:9090/OurDoctor/SignIn.jsp">Sign in</a>.</p>
  </div>

</body>
</html>