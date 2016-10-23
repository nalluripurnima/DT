<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Shopping Zone</title>
<style type="text/css">


hr{
	width: 100%;
	color: #fff;
}
.wrapper {    
	margin-top: 80px;
	margin-bottom: 20px;
}

.form-signin {
  max-width: 420px;
  padding: 30px 38px 66px;
  margin: 0 auto;
  background-color: #eee;
  border: 3px dotted rgba(0,0,0,0.1);  
  }

.form-signin-heading {
  text-align:center;
  margin-bottom: 30px;
}

.form-control {
  position: relative;
  font-size: 16px;
  height: auto;
  padding: 10px;
}

input[type="text"] {
  margin-bottom: 0px;
  border-bottom-left-radius: 0;
  border-bottom-right-radius: 0;
}

input[type="password"] {
  margin-bottom: 20px;
  border-top-left-radius: 0;
  border-top-right-radius: 0;
}

.colorgraph {
  height: 7px;
  border-top: 0;
  background: #c4e17f;
  border-radius: 5px;
  background-image: -webkit-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
  background-image: -moz-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
  background-image: -o-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
  background-image: linear-gradient(to right, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
}
</style>
</head>
<body>
<form:form action="store" method="post">
<div class = "container">
	<div class="wrapper">
		<form  name="Login_Form" class="form-signin">     
		    <h3 class="form-signin-heading">Register Here......!</h3>
      
	               		<hr class="colorgraph"><br>
	               	 
	 
	 <c:forEach var="e" items="${errors}">
		<li>${e.getDefaultMessage()}" </li>
	</c:forEach>
	
	 <!-- <label for="firstName" class="sr-only">Your Name</label> -->
		<div class="input-group margin-bottom-20">
			<span class="input-group-addon"><i class="glyphicon glyphicon-user mycolor"></i></span>
			<form:input path='firstname' id="Firstname" class="form-control" placeholder="Firstname" required="true"/>
			    </div>
				<br>
				<br>
	    <div class="input-group margin-bottom-20">
			<span class="input-group-addon"><i class="glyphicon glyphicon-user mycolor"></i></span>
			<form:input path='lastname' id="Lastname" class="form-control"	placeholder="lastname" required="true"/>
		</div>
		<br>
		<br>
		<div class="input-group margin-bottom-20">
			<span class="input-group-addon"><i class="glyphicon glyphicon-envelope mycolor "></i></span>
			<form:input path='mail' id="Mail" class="form-control"	placeholder="Enter mail id" required="true" title="valid mail is required"/>
			</div>
		<br>
		<br>
		<div class="input-group margin-bottom-20">
			<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
			<form:input path='pwd' id="pwd" class="form-control" type="password" placeholder="Enter your password" required="true"/>
		</div>
		<br>
		<br>
		<div class="input-group margin-bottom-20">
			<span class="input-group-addon"><i class="glyphicon glyphicon-phone mycolor"></i></span>
			<form:input path='ph' id="contact" class="form-control"	placeholder="contact" required="true"/>
			
		</div>
		
		<br>
        <br>
		<div style="margin-top: 10px" class="form-group">
		<center>
			<div class="col-sm-12 controls">
							  <button class="btn btn-lg btn-primary btn-block"  name="Submit" value="Register" type="Submit">Register</button>  			

			</div>
			</center>
		</div>
	
   
    </form> 
   </div>
   </div>
   </form:form>
</body>
</html>