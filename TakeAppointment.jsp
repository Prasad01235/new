<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Appointment</title>
<script>
function generate1(){
	document.myform.action='Successlogin.jsp';
	document.myform.cancel();
}
function generate(){
	document.myform.action='TakeAppointment.jsp';
	document.myform.cancel();
}
</script>
</head>
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
 
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
input[type=text] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus{
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
  color: black;
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

.cancelbtn{
background-color: red;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;

}
.cancelbtn{
opacity: 1;
}

</style>
<body>
<form name="myform"  action="http://localhost:8091/OurDoctor/Appointment">

    <div class="container">
    <h1>APPOINTMENT</h1>
    <p>Please fill in this form to create an Appointment.</p>
    <hr>

	<label><b>Patient Name</b></label>
    <input type="text" placeholder="Enter Name" name="name2" required>
	
	<label><b>Phone number</b></label>
	<input type="text" placeholder="Enter phone number"name="phone2"required>
	
	<label><b>Age</b></label>
	<input type="text" placeholder="Enter age"name="age"required>
	
	<label><b>Sex</b></label>
	<input type="text" placeholder="Enter sex"name="sex"required>
	
	<label><b>Address</b></label>
	<input type="text" placeholder="Enter Address"name="add"required>
	
    <hr>
   <input type="submit" value="CONFIRM" class="registerbtn"/>
   <input type="submit" value="BACK" class="registerbtn1"name="back" onclick="generate1();"/>
   <input type="submit" value="CANCEL" class="cancelbtn"name="cancel" onclick="generate();"/>
   
   </div>
  </form>
</body>
</html>