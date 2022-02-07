<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


<style>
body {
	
	background: linear-gradient(#DAD299, #b0dab9);
	
}
.bar{
            margin-top: 40px;
        }
        ul{
float:left;
display:inline;
}
        @import url('https://fonts.googleapis.com/css2?family=Ubuntu:ital,wght@1,300&display=swap');
      #p1{
            position: absolute;left: 80px;top: 250px; text-align: justify;
            border: 5px solid white;
            border-radius: 40px;
            width: 280px;
            background-color: rgb(58, 112, 212);
            letter-spacing: 1px;
            text-align: center;
             margin-top: -30px;
              margin-left: 170px;
            font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
        }
        #p2{
            position: absolute;left: 80px;top: 250px; text-align: justify;
            border: 5px solid white;
            border-radius: 40px;
            width: 280px;
            background-color: rgb(58, 112, 212);
            letter-spacing: 1px;
            text-align: center;
            margin-top: 120px;
              margin-left: 170px;
            font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
        }
        #p3{
            position: absolute;left: 80px;top: 250px; text-align: justify;
            border: 5px solid white;
            border-radius: 40px;
            width: 280px;
            background-color: rgb(58, 112, 212);
            letter-spacing: 1px;
            text-align: center;
            margin-top: 280px;
              margin-left: 170px;
            font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
        }
        div.a{
            text-align:  justify;
            margin-top: 80px;
            font-size: 21px;
            margin-left: 590px;
} 


div.b{
            text-align: justify;
            margin-top: 65px;
            font-size: 21px;
          position: relative;left: 13px;
          margin-left: 590px;
} 
div.c{
            text-align:  justify;
            margin-top: 30px;
            font-size: 21px;
          position: relative;left: 13px;
          margin-left: 590px;
} 
h1{
text-align:center;
}
ul{
float:right;
display:inline;
}
ul {
  list-style-type: none;
  margin: 0px;
  	margin-top: 20px;
  padding: 0;
  overflow: hidden;
  background-color: #333;
  width:100%;
}

li {
  float: right;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 5px 130px;
  text-decoration: none;
  
}

li a:hover {
  background-color: #111;
}

.sin{
margin-top:10px;
margin-left:80px;
}
</style>
</head>
<body>
<h1>LEAVE MANAGEMENT SYSTEM </h1>



<div class="bar">
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
          
          <ul class="nav navbar-nav">
           <li><a href="employeeprofile">User Profile</a></li>
           <li class="active"><a href="employee">Balance leave</a></li>
           <li><a href="insertLeaveRequest.jsp">Leave form</a></li>
            
            <li><a href="updateLeaveRequest.jsp">Update leave</a></li>
            
        <div class="sin">
           <li><a href="index.jsp"> Sign Up</a></li>
            </div>
            </ul>
            </div>
            </nav>
             </div>
 <div class="container">

  
    <div id="p1">
<h2 style="color:white">Fully Customizable
    <br> Leave Policies</h2>
    </div>

    <div id="p2">
        <h3 style="color:white">Let Employees and Managers
            <br>Handle Leave Requests</h3>
            </div>

            <div id="p3">
                <h2 style="color:white">Create Location
                    <br> -based Holidays</h2>
                    </div>

            

                    <div class="a">
                        <p>Create unlimited leave types and define leave policies for 
                            <br>each type exclusively: earned leave, sick leave, casual<br>leave, maternity leave, etc.</p>
                        </div>
                        
                    <div class="b">
                        <p>You can create multiple shifts, rotation policies, attendance 
                            <br>exception policies and weekend policies to create an<br> attendance scheme..</p>
                        </div>
                        <div class="c">
                            <p>You can create different location-based holiday lists for 
                                <br>different locations, if your organization is geographically<br> distributed across states or countries.</p>
                            </div>

                        </div>
</body>
</html>
