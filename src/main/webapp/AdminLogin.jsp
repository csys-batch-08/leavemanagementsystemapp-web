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
<h3> ADMIN LOGIN </h3>

<form action="AdminLogin" method="get">


  <div class="container">
    <label for="manid"><b>Admin Id</b></label><br>
    <input type="text" name="id" pattern="[0-9]{4}"  placeholder="Enter Your Id" title="minimum 4 characters should be there."  required><br>

    <label for="psw"><b> Admin Password</b></label><br>
    <input type= "password" name="password"  pattern="[A-Za-z0-9]+[@][A-za-z0-9]*" placeholder="Enter Your Password" title="must be provide 6 characters and use some special characters for safty purpose" required><br>
        
    <button type="submit">Login</button>
    
  </div>

  
</form>
</div>
</p>

</body>
</html>