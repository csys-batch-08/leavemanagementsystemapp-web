<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
	integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>LMS PROJECT</title>
<style>
body {
	background: linear-gradient(#DAD299, #b0dab9);
}

.btn {
	margin-top: -17px;
	margin-left: 800px;
}

.btn1 {
	margin-top: -40px;
	margin-left: 1070px;
}

.p {
	margin-top: 12px;
}

table {
	margin-top: 17px;
	margin-left: 20px;
	text-align: center;
}

.btn2 {
	margin-top: -35px;
	margin-left: 1300px;
}
</style>

</head>
<body>
	<center>
		<h1>LEAVE MANAGEMENT SYSTEM</h1>
	</center>
	<p>
	<h3>Show Leave Request Form</h3>
	</p>

	<br>
	<div class="btn">
		<form action="adminUpdateLeaveRequest.jsp">
			<button type="submit">Update Leave Request</button>
		</form>
	</div>
	<div class="btn1">
		<a href="adminDeleteLeaveRequest.jsp"><button type="submit">Delete
				Leave Request</button></a>
	</div>
	<div class="btn2">
		<a href="requestForm.jsp"><button type="submit">Back</button></a>
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



			<c:forEach items="${request}" var="leave">
				<fmt:parseDate pattern="yyyy-MM-dd" value="${leave.fromDate}"
					var="parsedFromDate" />
				<fmt:parseDate pattern="yyyy-MM-dd" value="${leave.toDate}"
					var="parsedTodate" />


				<tbody>

					<tr>
						<td>${leave.requestId}</td>
						<td>${leave.empId}</td>
						<td>${leave.reason}</td>
						<td><fmt:formatDate pattern="dd-MM-yyyy"
								value="${parsedFromDate}" /></td>
						<td><fmt:formatDate pattern="dd-MM-yyyy"
								value="${parsedTodate}" /></td>
						<td>${leave.noOfdays}</td>
						<td>${leave.status}</td>

					</tr>

				</tbody>
			</c:forEach>

		</table>
	</div>






</body>
</html>