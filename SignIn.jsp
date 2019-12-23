<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>SignIn</title>
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
  input[type=text]
{
  
  textallign:centre;
  padding: 16px;
  width:300px;
  display: inline-block;
  color:red;
 border:double;
  background: #aec8bd;

}
</style>
  <body>
    <header>
      <div class="container">
        <div id="branding">
          <h1><span class="highlight">Our</span>Doctor</h1>
        </div>
        <nav>
          <ul>
            <li><b><a href="welcome.html">Home</a></b></li>
            <li><b><a href="about.html">About</a></b></li>
         	<li><b><a href="Contact.jsp">Contact</a></b></li>
           </ul>
        </nav>
              </div>
    </header>
    <form action ="http://localhost:8091/OurDoctor/LOGIN">
  <section id="SignIn">
  <div class="container">
 <section id="signin"> 
<table>

<tr>
<td><b><label>PhoneNumber</label></b></td>
<td><input type="text" name="Phn" required/></td>
</tr>

<tr>
<td><b><label>Password</label></b></td>
<td><input type="Password" name="PW" required/></td>
</tr>

<tr>
<td><input type="submit" class="loginbutn" value="LOGIN"/></td>
<td><a href="forgetPassword.jsp">Forget Password</a></td>
</tr>
</table>
</section>
</div>
</section>
</form>
</html>
    