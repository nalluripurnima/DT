 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css"
	media="all" />
<title>Shopping Zone</title>
<style>
ul {
    list-style-type: none;
   margin: 0;
    padding: 0;
    overflow: hidden;
   background-color:#333;
}
li {
    float: left;
}
li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}
li a:hover:not(.active) {
    background-color: #FFFFFF;
}
.active {
    background-color: #FFFFFF;
}
.header
{
text-align:center;
background-color:white;
}
.navbar-fixed-left {
  width: 165px;
  position: absolute;
  border-radius: 0;
  height: 80%;
}
.navbar-fixed-left .navbar-nav > li {
  float: none;  /* Cancel default li float: left */
 width: 170px;
}
.navbar-fixed-left + .container {
  padding-left: 140px;
}
body img{
   	padding-left:0px;
 	padding-right:0px;
 	padding-top:0px;
 	size:cover;
 	position:fixed;
 	height:100%;
 	width:100%;
 }
</style>
</head>
<body>
	<div class="header">
		<%@include file="header.jsp"%>
	</div>
	<c:if test="${not empty Welcome}">
		
		
	</c:if>
	
	    <c:if test="${userRole=='isAdmin'}">
			<%@include file="adminpg.jsp" %>
		</c:if>
		<c:if test="${userRole=='isSupplier'}">
			<%@include file="confirm.jsp" %>
		</c:if>
	 <c:if test="${login==true}">
		<%@include file="login.jsp" %>
	</c:if> 
	<c:if test="${register==true}">
		<%@include file="register.jsp" %>
	</c:if>
	<c:forEach var="c" items="${Categorys}">
					<a href="Products?c=${c.cid}" class="list-group-item"> ${c.cname}</a> 
	  </c:forEach>
	
 	<div class="footer">
		<%@include file="footer.jsp"%>
	</div>
</body>
</head>
</html>