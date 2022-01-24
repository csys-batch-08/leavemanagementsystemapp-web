<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>LMS PROJECT</title>
<style >
body{
background :#F0F8FF;}
.container{
margin-top:10px;
margin-left:550px;}
.name{
width:230px;}
.dept{
width:230px;}
.gmail{
width:230px;
}
.pwd{
width:230px;
}
.h2{
margin-top:30px;
margin-left:50px;}
.btn{
margin-left:8px;}
.btn1{
margin-top:-40px;
margin-left:139px;}


</style>
</head>
<body>
<div class="h2">
 <h2>Add New Employee</h2>
 </div>

<div class="container">
 
  <form action="addnewemp" method="get">
    <div class="form-group">
      <label for="name">Name:</label>
      <div class="name"><input type="text" class="form-control" name="name" id="name" pattern="[A-Za-z]{3,}"					
            title="minimum 3 characters should be there."placeholder="Enter your name" required ></div>
    </div>
    <div class="form-group">
      <label for="dept">Department:</label>
      <div class="dept"><input type="text" class="form-control" name="dept" id="dept" pattern="[A-Za-z]{4,}"					
            title="minimum 4 characters should be there."placeholder="Enter your department" required ></div>
    </div>
    <div class="form-group">
      <label for="gmail">Gmail:</label>
      <div class="gmail"><input type="text" class="form-control" name="gmail" id="gmail" pattern="[a-z0-9]+[@][a-zA-Z]+[.][a-z]+"					
            title="You have to insert @ and . in the username ex.abc@gmail.com"placeholder="xyz@gmail.com" required ></div>
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <div class="pwd"><input type="text" class="form-control" name="password" id="pwd" pattern="[A-Za-z0-9]+[@][A-za-z0-9]*"					
            placeholder="Enter your password" required ></div>
    </div>
    
  <div class="btn">
    <button type="submit" class="btn btn-success">Submit</button>
    </div>
    <div class="btn1">
    <button type="reset" class="btn btn-success">reset</button>
    </div>
  </form>
</div>










<!-- <h2>Add New Employee</h2>
<form action="addnewemp" method="get">
NAME: <input type="text" name="name"pattern="[A-Za-z]{3,}"					
            title="minimum 3 characters should be there."placeholder="Enter your nickname" required><br>
        <br>
DEPARTMENT:<input type="text" name ="dept" pattern="[A-Za-z]{4,}" title="minimum 4 characters should be there." ><br>
       <br>
GMAIL:  <input type="gmail" name="gmail" pattern="[a-z0-9]+[@][a-zA-Z]+[.][a-z]+"					
            title="You have to insert @ and . in the username ex.abc@gmail.com"placeholder="xyz@gmail.com"><br>
        <br>
PASSWORD: <input type="password" name="password"  pattern="[A-Za-z0-9]+[@][A-za-z0-9]*" title="must be provide 8 characters and use some special characters for safty purpose"><br>
        <br>
<button>submit</button>
<button>reset</button>
 -->
         
      
       
</form>

</body>
</html> --%>