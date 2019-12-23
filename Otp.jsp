<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>OTP</title>
 <link rel="stylesheet" href="./css/style.css">
 </head>
<style>
body{
text-align:center;
font-size:30px;
height:650px;
background:url('../img/abc.jpg') no-repeat 0 -400px;
}
</style>
<body>
<form action="http://localhost:8091/OurDoctor/OTP">
<section id="showcase1">
<label>OTP</label>
<br>
 <input type ="text" name="OTP" required>
 <button type="submit"class="registerbtn1">Submit</button>
 </section>
 </form>
 </body>
</html>