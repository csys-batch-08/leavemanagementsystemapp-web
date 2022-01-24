<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>TYPE OF LEAVE INSERT</h3>
<form action="typeinsert" method="get">
Enter the employee id<input type="number" name="emplid"><br>
<br>
Enter the casual leave<input type="number" name="caslev"><br>
<br>
Enter the medical leave<input type="number" name="medlev"><br>
<br>
Enter the paid leave<input type="number" name="lev"><br>
<br>
 <button>submit</button>
 <button>reset</button>
<a href="TypeOfLeaveInsert.jsp"><li>Type Of Leave Insert</li></a>
<a href="BalanceOfleave.jsp"><li>Balance Of Leave</li></a>


</form>

</body>
</html>