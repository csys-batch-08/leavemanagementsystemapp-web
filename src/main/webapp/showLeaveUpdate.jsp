<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style >
body{
background :linear-gradient(#649173,#dbd5a4);}
.container{
margin-top:90px;
margin-left:550px;}
.in{
width:230px;}

.btn{
margin-left:39px;}
.h2{
margin-top:60px;
margin-left:50px;}

</style>
</head>
<body>

<%int empid=(int)session.getAttribute("empid"); %>
<div class="h2">
 <h1>Enter casual leave:</h1>
 </div>
<form action="caslev1" method="get">
  <div class="container">
  
  <div class="forms">
    <div class="form-group">
      <label for="paid"><h2>Enter casual leave:</h2></label>
      <div class="in"><input type="number" class="form-control" id="paid" placeholder="Enter the leave" name="casual"></div>
    </div>
  <input style="visibility: hidden;" type="number" name="id" value="<%=empid%>"><br> 
  <div class="btn">
    <button type="submit" class="btn btn-success">Submit</button>
    </div>
    </div>
      </div>
  </form>




 
</body>
</html>