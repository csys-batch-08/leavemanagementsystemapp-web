<%@page import="com.lms.daoimpl.AdminDaoImpl"%>
<%@page import="com.lms.daoimpl.EmpDaoImpl"%>
<%@page import="java.util.List"%>
<%@page import="  com.lms.model.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
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
background:#DAD299;

}
/* .btn
{

 margin-left: 350px;
margin-top: -27px ;
} */
.btn1
{
margin-left: 840px;
margin-top: 10px ;
}
/* .btn2
{
margin-left: 1050px;
margin-top: -37px ; */
}
table{
margin-top: 17px ;
    margin-left: 20px;
    text-align: center;
}

</style>
</head>
<body>
<h3>Show All Employee</h3>
<form action="employee" method="get">
<%
AdminDaoImpl employ=new AdminDaoImpl ();
%>
<% 
List<EmpLogin> log=employ.showEmployee();
  
%>
<br>
<!-- <div class="btn">
    <a href="AdminAddEmployee.jsp"><button type="button" class="btn btn-primary"> Add Employee</button></a>
    </div> -->
   <div class="btn1">
    <a href="AdminUpdateEmployee.jsp"><button type="button" class="btn btn-primary">Update Employee</button></a>
</div>
   <!-- <div class="btn2">
    <a href="AdminDeleteEmployee.jsp"><button type="button" class="btn btn-primary"> Delete Employee</button></a>
    </div> -->
<div class="container">
<table class="table table-bordered">

<tr>

<th>Employee id</th>
<th>Employee name</th>
<th>Employee department</th>
<th>Employee email</th>
<th>Employee password</th>
<th>Users type</th>

</tr>

<% 

int count=0;
for(EmpLogin em:log){
%>



 <tbody>
             
          <tr>
             <td><%=em.getEmp_id()%></td>
            <td><%=em.getEmp_name()%></td>
            <td><%=em.getEmp_department()%></td>
            <td><%=em.getEmp_email()%></td>
            <td><%=em.getEmp_password()%></td>
            <td><%=em.getUsers_type() %></td>
            
           </tr>
           
     </tbody>
     
      <%} %>
       </table>
       </div>
       
</form>
<!-- <a href="AdminAddEmployee.jsp"><button type ="sumbit">Add New Employee</button></a>
<a href="AdminUpdateEmployee.jsp"><button type ="sumbit">Update New Employee</button></a>
<a href="AdminDeleteEmployee.jsp"><button type ="sumbit">Delete New Employee</button></a>
 -->

</body>
</html>