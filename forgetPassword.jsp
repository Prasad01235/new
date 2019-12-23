<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Forget Password</title>
<link rel="stylesheet" href="./css/style.css">
</head>
<style>
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
<form action="http://localhost:8091/OurDoctor/Register1">

<tabel>
<tr>
<section id="forget">
<td><b><label>Enter Your Email</label></b></td>

<td><input type="text" name="email" required/></td>

<td><input type="Submit" class="submit" value="SUBMIT"></td>
</section>
</tr>
</tabel>
</form>
</body>
</html>