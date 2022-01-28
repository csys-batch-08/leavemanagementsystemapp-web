<%@page import="com.lms.model.ShowLevBal"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.sql.ResultSet"
 import ="com.lms.daoimpl.*" %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LMS PROJECT</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
<style>
body{
background: linear-gradient(#DAD299, #b0dab9);}
.but
{
margin-top:-70px;
margin-left:480px;
}
.table
{

margin-top:35px;
}
table,th,td{
text-align:center;}
.h3{
margin-top:59px;
margin-left:40px;}

.h1{
margin-top:500px;
}

</style>
</head>

<body>
 <center><h1 class="bg-dark text-white"> LEAVE MANAGEMENT SYSTEM </h1></center>

<!--  <center><h1 > LEAVE MANAGEMENT SYSTEM </h1></center>-->
<div class="h3">
<h3>Show Leave Balance :</h3>
</div>
<form>
<% 
ShowLevDaoImpl showlevbalance= new ShowLevDaoImpl();
List<ShowLevBal> showbal=showlevbalance.showbal() ;
int empid=(int)session.getAttribute("empid");
%>
<br>
<div class="table">
 <center><table border="1" cellspacing=0px; cellpadding=20px; style="width: 600px; height:5px;">
          <tr>
            
            <th>Employee_Id</th>
            <th>Casual_Leave</th>
            <th>Medical_Leave</th>
            <th>Casual_Leave_Balance</th>
            <th>Medical_Leave_Balance</th>
            <th>Paid_Leave</th>
            
          </tr>
 <% 

int count=0;
for(ShowLevBal sh:showbal){
	if(sh.getEmp_id()==empid){
 %>
 <tbody>
          <tr>
            
            <td><%=sh.getEmp_id()%></td>
            <td><%=sh.getCausal_lev()%></td>
            <td><%=sh.getMedical_lev()%></td>
            <td><%=sh.getCausal_lev_bal()%></td>
            <td><%=sh.getMedi_lev_bal()%></td>
            <td><%=sh.getPaid_lev()%></td>
            
           </tr>
           </tbody>
           <%} }%>
     
      </table></center><br><br><br><br><br><br>
      </div>
      <div class="but">
<a href="showLeaveUpdate.jsp"><button type="button" class="btn btn-primary"> Casual Leave </button></a>
<a href="showLeaveUpdate1.jsp"><button type="button" class="btn btn-primary"> Medical Leave </button></a>
<a href="showLeaveUpdate2.jsp"><button type="button" class="btn btn-primary"> Paid Leave </button></a>
<a href="showLeaveUpdate3.jsp"><button type="button" class="btn btn-primary">Add Id </button></a>
     </div>
</form>      

</body>
</html>