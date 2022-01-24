<%@page import="java.util.List"%>
<%@page import="com.lms.model.LeaveRes"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.ResultSet"
 import ="com.lms.daoimpl.*" %>     
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>LMS PROJECT</title>
<style>
body{
background: linear-gradient(#DAD299, #b0dab9);}
.btn
{
margin-top:-10px;
margin-left:800px;
}
.btn1
{
margin-top:-40px;
margin-left:1070px;
}
.p{
margin-top:12px;}
table{
margin-top: 10px ;
    margin-left: 20px;
    text-align: center;
}
</style>

</head>
<body>
<center><h1>LEAVE MANAGEMENT SYSTEM</h1></center>
<p><h3> Show Leave Request Form</h3></p>

<%
LeaveResDaoImpl levres=new LeaveResDaoImpl();
%>
<% 
List<LeaveRes> showLevres=levres.showLevres();
  
%>
<br>
 <div class="btn">
 <form action="AdminUpdateLeaveRequest.jsp">
 <button type = "submit" >Update Leave Request</button>
 </form>
</div>
<div class="btn1">
<a href="AdminDeleteLeaveRequest.jsp"><button type = "submit"  >Delete Leave Request</button></a>
</div>
<div class="container">
<table class="table table-bordered">
<tr>
<th>Request id</th>
<th>Employee id</th>
<th>Reason</th>
<th>From date</th>
<th>To date</th>
<th>No of days</th>
<th>Status</th>

</tr>

<% 

int count=0;
for(LeaveRes lv:showLevres){
%>



 <tbody>
             
          <tr>
            <td><%=lv.getRequest_id()%></td>
            <td><%=lv.getEmp_id()%></td>
            <td><%=lv.getReason()%></td>
            <td><%=lv.getFrom_date()%></td>
            <td><%=lv.getTo_date()%></td>
            <td><%=lv.getNo_ofdays()%></td>
            <td><%=lv.getStatus()%></td>
            
           </tr>
           
     </tbody>
     
      <%} %>
       </table>
       </div>
      
 




</body>
</html>