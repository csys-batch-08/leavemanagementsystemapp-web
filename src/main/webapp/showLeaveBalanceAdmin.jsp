<%@page import="com.lms.model.ShowLevBal"%>
<%@page import="java.util.List"%>
<%@page import="com.lms.daoimpl.ShowLevDaoImpl"%>
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
<div class="search">
<form action="checkLeaveEmployee.jsp">
<div class="p"><input type="text" name="emp_id" pattern="[0-9]{4,8}" requried style="width:100px;" placeholder="search......" ></div>
<div class="btn"><button type="submit" class="btn btn-success" >search</button></div>
</form>
</div>
<form action="show" method="get">
<% 
ShowLevDaoImpl showlevbalancead= new ShowLevDaoImpl();
List<ShowLevBal> showbal=showlevbalancead.showbal() ;

%>
<br>
<div class="container">
 <table class="table table-bordered">
          <tr>
            
            <th>Employee id</th>
            <th>Casual leave</th>
            <th>Medical leave</th>
            <th>Casual balance</th>
            <th>Medical balance</th>
            <th>Paid leave</th>
            
          </tr>
 <% 

int count=0;
for(ShowLevBal sh:showbal){
	
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
           <%} %>
     
      </table>
      </div>
      
      
</form>      

<!-- <a href="CheckLeaveEmployee.jsp"><button type="sumbit">CheckLeaveEmployee</button></a> -->
</body>
</html>