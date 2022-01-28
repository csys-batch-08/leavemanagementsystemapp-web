<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<style>
body {
	
	background: linear-gradient(#DAD299, #b0dab9);
	
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
            margin-top: 190px;
            font-size: 21px;
            margin-left: 590px;
} 


div.b{
            text-align: justify;
            margin-top: 70px;
            font-size: 21px;
          position: relative;left: 13px;
          margin-left: 590px;
} 
div.c{
            text-align:  justify;
            margin-top: 80px;
            font-size: 21px;
          position: relative;left: 13px;
          margin-left: 590px;
} 
h1{
text-align:center;
}
ul{
float:left;
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
.one{
position:absolute;
top:99px;
left:20px
color:white
}
</style>
</head>
<body>
<h1>LEAVE MANAGEMENT SYSTEM </h1>

<ul>
  
  
<li><a href="index.jsp">Logout</a></li>
  
  <li><a href="showLeaveBalanceEmployee.jsp">Balance leave</a></li>
    <li><a href="updateLeaveRequest.jsp">Update leave</a></li>
    
    <div class="one">
      <li><a href="insertLeaveRequest.jsp">Leave form</a></li>
      </div>
</ul>
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
                        <p>Create unlimted leave types and define leave policies for 
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
