<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LMS PROJECT</title>
<style>

body {

	background: linear-gradient(#DAD299, #b0dab9);
}
body {font-family: Arial, Helvetica, sans-serif;}


input[type=text], input[type=password] {
  width: 21%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

button {
  background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 21%;
}

button:hover {
  opacity: 0.8;
}

.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}




.container {
  padding: 16px;
}
p {
  margin: 100px 50px;
}







</style>
</head>
<body>
<p>
<div style="text-align: center;">
<h3>EMPLOYEE LOGIN</h3>


<form action="EmployeeLogin" method="get">


  <div class="container">
    <label for="uname"><b>Username</b></label><br>
    <input type="text" placeholder="Enter Your Username" name="empname" required><br>

    <label for="psw"><b>Password</b></label><br>
    <input type="password" placeholder="Enter Your Password" name="password" required><br>
        
    <button type="submit">Login</button>
    
  </div>
 

  
</form>
</div>
 </p>

</body>
</html>