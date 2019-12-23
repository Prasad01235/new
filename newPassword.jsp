<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Forget Password</title>
<script>
function validpassword(){
	var password=document.myform.NPW.value;
	var cppassword=document.myform.CNPW.value;
    if(password==cppassword)
    	{
    	return true;
    	}
    else{
    	alert("password and confirm pasword must be same");
    	return false;
    }
    }
function generate(){
	document.myform.action='welcome.html';
	document.myform.cancel();
}
 </script>
<link rel="stylesheet" href="./css/style.css">
</head>
<style>
input[type=password]
{
  
  textallign:centre;
  padding: 16px;
  width:300px;
  display: inline-block;
  color:red;
 border:double;
  background: #aec8bd;
}
input[type=text]{
  textallign:centre;
  padding: 16px;
  width:300px;
  display: inline-block;
  color:red;
 border:double;
  background: #aec8bd;
}
.submit{
  background-color:none;
  padding: 10px;
  cursor: pointer;
  width:200px;
  border:inset;
  opacity: 0.9;
  font-weight:bold;
  overflow:hidden;
  color:black;
  background: #aec8bd;
  font-size:20px;
}
}
</style>
<body>
<form name="myform" onsubmit="return validpassword()" 
action="http://localhost:8091/OurDoctor/newPasswordd">
<section id="forget">
<table>
<tr>
<td><b><label>Enter your Registerd phonenumber</label></b></td>
<td><input type="text" name="PHNW" required/></td>
</tr>
<tr>
<td><b><label>Enter new password</label></b></td>
<td><input type="password" name="NPW" required/></td>
</tr>
<tr>
<td><b><label>Confirm new password</label></b></td>
<td><input type="password" name="CNPW" required/></td>
</tr>
<tr>
<td><input type="Submit" class="submit" value="SUBMIT"></td>
<td><input type="submit" class="submit" value="CANCEL" name="cancel" onclick="generate();"/></td>
</tr>
</table>
</section>
</form>
</body>
</html>