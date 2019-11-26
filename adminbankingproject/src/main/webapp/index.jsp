<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="c"%>
<%@taglib prefix="u" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<u:url value="/resources/css/Admin.css" />" rel="stylesheet">  </head>

</head>
<body>
<div class="csslogin">
<center><h2><em>Hi Admin, provide me with your credentials below... </em></h2>


<button onclick="document.getElementById('id01').style.display='block'" style="width:auto;">Login</button>

<div id="id01" class="modal">
  
  <form class="modal-content animate" method="post">
    <div class="imgcontainer">
      <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
      <img src="<u:url value="/resources/img/avatar.png " />" alt="Avatar" class="avatar">
    </div>

    <div class="container">
      <label for="uname"><b>Admin Name</b></label>
      <input type="text" placeholder="Enter Username" id="username" name="uname" path="uname"/>

      <label for="psw"><b>Admin Password</b></label>
      <input type="password" placeholder="Enter Password" id="password" name="psw" path="psw"/>
        <div>
      <input type="button" class="loginb" onclick="return validate()" value="Login"/>
      
        </div>
    </div>

    
  </form>
</div>

<script>
// Get the modal
var modal = document.getElementById('id01');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}


var attempt = 3; // Variable to count number of attempts.
// Below function Executes on click of login button.
function validate(){
var username = document.getElementById("username").value;
var password = document.getElementById("password").value;
if ( username == "admin" && password == "jarvis"){
alert ("Login successfully");
window.location = "admin/list"; // Redirecting to other page.
return false;
}
else{
attempt --;// Decrementing by one.
alert("You have left "+attempt+" attempt;");
// Disabling fields after 3 attempts.
if( attempt == 0){
document.getElementById("username").disabled = true;
document.getElementById("password").disabled = true;
document.getElementById("submit").disabled = true;
return false;
}
}
}
</script>
</center>
</div>
</body>
</html>




