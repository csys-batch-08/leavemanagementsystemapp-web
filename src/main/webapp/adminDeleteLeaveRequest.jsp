<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style >
body{
background :#FFDB58;}
.container{
margin-top:90px;
margin-left:550px;}
.in{
width:230px;}

.btn{
margin-top:15px;
margin-left:29px;}
.h2{
margin-top:60px;
margin-left:50px;}

</style>
</head>
<body>



<div class="h2">
 <h2>Leave Request Form</h2>
 </div>

<div class="container">
 
  <form action="dellev" method="get">
    <div class="form-group">
      <label for="resid"><h4>Enter the request id:</h4></label>
      <div class="in"><input type="text" class="form-control" id="resid" placeholder="Enter the request id" name="resqsid"></div>
    </div>
   
  <div class="btn">
    <button type="submit" class="btn btn-success">Submit</button>
    </div>
  </form>
</div>



</body>
</html>