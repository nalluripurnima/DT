<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css"
	media="all" />
<title>Shopping Zone</title>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#"><I><B>KIDS STORE</B></I></a>
    </div>
    <ul class="nav navbar-nav">
    <li><a href="home" >Home</a> </li>
      <li><a href="about" >About Us</a> </li>
      <li> <a href="contact" >Contact Us</a></li>
      <li> <c:forEach var="c" items="${Categorys}">
					<a href="products?c=${c.cid}" class="list-group-item"> ${c.cdesc}</a> 
				</c:forEach>
</li>
      </ul>
    <ul class="nav navbar-nav navbar-right">
      <div style="color:white";><li><c:if test="${not empty Welcome}">
		Welcome ${Welcome.firstname} ${Welcome.lastname}!!
	</c:if></li></div>
      <li><a href="logout"><span class="glyphicon glyphicon-user"></span>logout</a></li>
    </ul>
  </div>
</nav>
	 <div class="footer">
		<%@include file="footer.jsp"%>
	</div>
</body>
</html>