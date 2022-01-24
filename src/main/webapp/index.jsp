<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

body {
	height: 100vh;
	display: flex;
	justify-content: center;
	align-items: center;
	padding: 10px;
	background: linear-gradient(#DAD299, #b0dab9);
}

form .button1 {
	height: 45px;
	margin: 35px 0;
}

form .button1 input {
	height: 85%;
	width: 165%;
	border-radius: 10px;
	border: none;
	color: #fff;
	font-size: 18px;
	font-weight: 500;
	letter-spacing: 1px;
	cursor: pointer;
	transition: all 0.3s ease;
	background: #23272b;
	position: relative;
	left: 30px;
	top: -100px;
}

form .button1 input:hover {
	transform: scale(0.99);
	background: #5d5b6a;
}

form .button2 {
	height: 45px;
	margin: 35px 0;
}

form .button2 input {
	height: 85%;
	width: 184%;
	border-radius: 10px;
	border: none;
	color: #fff;
	font-size: 18px;
	font-weight: 500;
	letter-spacing: 1px;
	cursor: pointer;
	transition: all 0.3s ease;
	background: #23272b;
	position: relative;
	left: -100px;
	top: -10px;
}

form .button2 input:hover {
	transform: scale(0.99);
	background: #5d5b6a;
}

form .button3 {
	height: 45px;
	margin: 35px 0;
}

form .button3 input {
	height: 85%;
	width: 150%;
	border-radius: 10px;
	border: none;
	color: #fff;
	font-size: 18px;
	font-weight: 500;
	letter-spacing: 1px;
	cursor: pointer;
	transition: all 0.3s ease;
	background: #23272b;
	position: relative;
	left: -220px;
	top: 80px;
}

form .button3 input:hover {
	transform: scale(0.99);
	background: #5d5b6a;
}

h1 {
	margin-top: -400px;
	margin-right: -400px;
}

ul {
	float: left;
	display: inline;
}
</style>
</head>
<body>
	<h1>LEAVE MANAGEMENT SYSTEM</h1>
	<!-- <ul>
<li><a href="AdminLogin.jsp">Admin login</a></li>
<li><a href="Register.jsp">Employee register</a></li>
<li><a href="EmployeeLogin.jsp">Employee login</a></li>
</ul> -->

	<!-- <a href="AdminLogin.jsp"><li>admin login</li></a>
<a href="Register.jsp"><li>employee register</li></a>
<a href="EmployeeLogin.jsp"><li>employee login</li></a>		
</ul>
 -->
	<form action="Register.jsp">
		<div class="button1">
			<input type="submit" value="Register login">
		</div>
		</form>
		<form action="AdminLogin.jsp">
			<div class="button2">
				<input type="submit" value="Admin login">
			</div>
			</form>
			<form action="EmployeeLogin.jsp">
				<div class="button3">
					<input type="submit" value="Employee login">
				</div>
				</form>
</body>
</html>