<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style >
body{
background :#FFCBA4;}
.container{
margin-top:70px;
margin-left:550px;}
.in{
width:230px;}
.dpt{
width:230px;}
.btn{
margin-left:29px;}
.h2{
margin-top:60px;
margin-left:80px;}

</style>
</head>
<body>
<!-- <h2>Update Employee</h2>
<form action="updateemp" method="get">
Enter Employee id:<input type="number" name="empupid"><br>
<br>
Department:<input type="text" name ="depart"><br>
<br>

<button type="submit">submit</button>
<button>reset</button>
</form> -->
<div class="h2">
 <h2>Leave Request Form :</h2>
 </div>

<div class="container">
 
  <form action="updateemp" method="get">
    <div class="form-group">
      <label for="id">Enter Employee id:</label>
      <div class="in"><input type="number" class="form-control" id="id" placeholder="Enter the id" name="empupid"></div>
    </div>
    <div class="form-group">
      <label for="dept">Department:</label>
     <div class="dpt"> <input type="text" class="form-control" id="dept" placeholder="Enter the department" name="depart"></div>
    </div>
  <div class="btn">
    <button type="submit" class="btn btn-success">Submit</button>
    </div>
  </form>
</div>

   

</body>
</html>