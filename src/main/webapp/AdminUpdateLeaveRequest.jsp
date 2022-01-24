<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
background :#FFDB58;}
.container{
margin-top:90px;
margin-left:550px;}
.in{
width:230px;}
.an{
width:230px;}
.btn{
margin-left:29px;}
.h2{
margin-top:60px;
margin-left:50px;}

</style>
</head>
<body>
<!-- <h3>Leave Request Form</h3>
<form action="adulev" method="get">
Enter the status:<input type="text" name="status"><br>
<br>
Enter the request id:<input type="number" name="resid"><br>
<br>
<button type="submit">submit</button>
<button type="reset">reset</button> -->
<div class="h2">
 <h2>Leave Request Form</h2>
 </div>

<div class="container">
 
  <form action="adulev" method="get">
    <div class="form-group">
      <label for="status">Enter the status:</label>
      <div class="in"><input type="text" class="form-control" id="status" placeholder="Enter the status" name="status"></div>
    </div>
    <div class="form-group">
      <label for="id">Enter the request id:</label>
     <div class="an"> <input type="number" class="form-control" id="id" placeholder="Enter the  id" name="resid"></div>
    </div>
  <div class="btn">
    <button type="submit" class="btn btn-success">Submit</button>
    </div>
  </form>
</div>





</body>
</html>