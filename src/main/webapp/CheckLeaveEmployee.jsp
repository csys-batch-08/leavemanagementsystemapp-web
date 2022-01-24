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
<style>
table,th,td{
text-align:center;}
body{
background:#F4A460;
}
.table{
margin-top:150px;}

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h2>Leave Balance Table </h2></center>

<form action="checklev" method="get">
<% 
int empId=Integer.parseInt (request.getParameter("emp_id"));
ShowLevBal sh=new ShowLevBal(empId);
ShowLevDaoImpl checklevbalance= new ShowLevDaoImpl();
List<ShowLevBal> checkbal=checklevbalance.checkbalance(sh);


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
for(ShowLevBal ck:checkbal){
	
 %>
 <tbody>
          <tr>
            
            <td><%=ck.getEmp_id()%></td>
            <td><%=ck.getCausal_lev()%></td>
            <td><%=ck.getMedical_lev()%></td>
            <td><%=ck.getCausal_lev_bal()%></td>
            <td><%=ck.getMedi_lev_bal()%></td>
            <td><%=ck.getPaid_lev()%></td>
            
           </tr>
           </tbody>
           <%} %>
     
      </table>
    
      </div>
</form>
<!-- <a href="AdminCheckLeave.jsp"><button type="sumbit">Check Leave</button></a>   -->

</body>
</html>