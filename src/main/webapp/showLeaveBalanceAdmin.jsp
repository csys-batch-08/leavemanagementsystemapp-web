<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<%@page import="java.util.List"%>
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
<link rel="style"
	href="//cdn.datatables.net/1.11.4/css/jquery.dataTables.min.css">
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script type="text/javascript"
	src="https://cdn.datatables.net/1.11.4/js/jquery.dataTables.min.js"></script>

<style>
.btn{
height:28px;

margin-top:-27px;
margin-left:553px;
}
.p{
margin-top:30px;
margin-left:1190px;
}
table,th,td{
text-align:center;}
body{
background:#DAD299;

}

</style>
</head>
<body>

<center><h1> LEAVE MANAGEMENT SYSTEM </h1></center>

<form action="show" method="get">

<br>
<div class="container">
 <table class="table table-bordered" id="myTable">
 <thead>
          <tr>
            
            <th>Employee id</th>
            <th>Casual leave</th>
            <th>Medical leave</th>
            <th>Casual balance</th>
            <th>Medical balance</th>
            <th>Paid leave</th>
            
          </tr>
          </thead>

 
 <tbody>
 <c:forEach items="${admin}" var="leave">
          <tr>
            
            <td>${leave.emp_id}</td>
            <td>${leave.causal_lev}</td>
            <td>${leave.medical_lev}</td>
            <td>${leave.causal_lev_bal}</td>
            <td>${leave.medi_lev_bal}</td>
            <td>${leave.paid_lev}</td>
            
           </tr>
           
           </c:forEach>
          </tbody>
     
      </table>
      </div>
      
      
</form>      
</body>
<script>
	$(document).ready(function() {
		$('#myTable').DataTable();
	});
	</script>

</html>