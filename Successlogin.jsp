<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>login success</title>
<link rel="stylesheet" href="./css/style.css">

<script>
function generate1(){
	document.myform.action='TakeAppointment.jsp';
	document.myform.apptnt();
}
function generate2(){
	document.myform.action='ShowHospitals.jsp';
	document.myform.shwhsptl();
}
function generate3(){
	document.myform.action='Myprofile.jsp';
	document.myform.prfle();
}
	</script>

</head>
<style>

.cancelbtn{
background-color:orange;
  color: black;
  padding: 16px 20px;
  margin: 8px 0;
  border:inset;
  cursor: pointer;
  width:200px;
  opacity: 0.9;
  overflow:hidden;
font-size:15px;
}
.cancelbtn{
opacity: 1;
}


</style>
<body>
<form name="myform" 
action="http://localhost:8091/OurDoctor/SignIn.jsp">

<section id="success">
<h2>
<%out.println("LOGIN SUCCESSFULL..."+"WELCOME" +" " +session.getAttribute("name")); %>
</h2>
<section id="success2">
<p>
<input type="submit" value="Make Appointment" class="cancelbtn"name="apptnt" onclick="generate1();"/>

</p>
<p>
<input type="submit" value="Show Hospitals" class="cancelbtn"name="shwhsptl" onclick="generate2();"/>

</p>
<p>
<input type="submit" value="My Profile" class="cancelbtn"name="prfle" onclick="generate3();"/>
</p>
<p>
<input type="submit" value="SignOut" class="cancelbtn"name="sgnout" onclick="generate4();"/>
</p>
</section>
</section>
</form>
</body>

</html>