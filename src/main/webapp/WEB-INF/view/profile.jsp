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
<style>

wrapper {    
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
	 <form:form action="profile" method="post">
	 
	 
		<div class="input-group margin-bottom-20">
			<span class="input-group-addon"><i class="glyphicon glyphicon-user mycolor"></i></span>
			<form:input path='firstname' id="Firstname" class="form-control" placeholder="Firstname" readonly="true"/>
			    </div>
				<br>
	<div class="input-group margin-bottom-20">
			<span class="input-group-addon"><i	class="glyphicon glyphicon-lock mycolor"></i></span>
			<form:input path='lastname' id="Lastname" class="form-control"	placeholder="lastname" readonly="true"/>
		</div>
		<br>
		<div class="input-group margin-bottom-20">
			<span class="input-group-addon"><i class="glyphicon glyphicon-user mycolor"></i></span>
			<form:input path='mail' id="Mail" class="form-control"	placeholder="Enter mail id" readonly="true" title="valid mail is required"/>
			</div>
		<br>
		<div class="input-group margin-bottom-20">
			<span class="input-group-addon"><i class="glyphicon glyphicon-user mycolor"></i></span>
			<form:input path='pwd' id="pwd" class="form-control" type="password" placeholder="Enter your password" />
		</div>
		<br>
		<div class="input-group margin-bottom-20">
			<span class="input-group-addon"><i class="glyphicon glyphicon-phone mycolor"></i></span>
			<form:input path='ph' id="contact" class="form-control"	placeholder="contact" />
			
		</div>
		<br>

		<div style="margin-top: 10px" class="form-group">
		<center>
			<div class="col-sm-12 controls">
			<a href="User/edit?u=${command.uid}">Update</a>
			<%-- <a href="<c:url  value='User/delete?u=${User.uid} class="btn btn-primary"'/>">Delete</a> --%>
				
			</div>
			</center>
		</div>
	
</form:form>
</body>
</html>