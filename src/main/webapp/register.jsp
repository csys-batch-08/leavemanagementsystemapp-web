
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IMS PROJECT</title>
<style>

body {

	background: linear-gradient(#DAD299, #b0dab9);
}


body {font-family: Arial, Helvetica, sans-serif;}


input[type=text],input[type=text],input[type=text], input[type=password] {
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
  margin: 50px 50px;
}
.form-select{
width:274px;
height:40px;}





</style>

</head>
<body>
<p>
<div style="text-align: center;">
<h3> REGISTER</h3>
	
 <form action="Register" method="get">

    <div class="container">
    <label for="uname"><b>Name</b></label><br>
    <input type="text" name="fn" placeholder="Enter Your Name" pattern="[A-Za-z]{3,}" required><br>
    
    <label for="email"><b>Gmail</b></label><br>
    <input type="text" name="gmail" placeholder="Enter Your Gmail" pattern="[a-z]+[a-z0-9]*[@][a-z]+[.][a-z]{2,}" required><br>
    <label for="uname"><b>Department</b></label>
  <br><br>
 <select class="form-select" name="department" aria-label="Default select example">
  <option selected disable>Enter Your Department</option>
  <option value="java">Java</option>
  <option value="oracle">Oracle</option>
  <option value="full stack">Full stack</option>
</select>
<br><br>
    
    <label for="psw"><b> Password</b></label><br>
    <input type= "password" name="password" placeholder="Enter Your Password" pattern="[A-Za-z0-9]+[@][A-za-z0-9]*" title="must be provide 6 characters and use some special characters for safty purpose" required><br>

    

       
    <button type="submit">Register</button>
    
  </div>

  
</form>
</div>
</P>        
</body>
</html>