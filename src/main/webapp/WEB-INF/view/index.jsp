<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<title>Shopping Zone</title>
<style>
.img-responsive, .thumbnail>img, .thumbnail a>img, .carousel-inner>.item>img,
	.carousel-inner>.item>a>img {
	display: block;
	width: 100%;
	height: 70%;
}
.carousel-indicators {
	position:relative;
	width: 80%;
	z-index: 15;
	margin: 0;
	
}
.container{
	margin: 10px auto;
	text-align: justify;
	
</style>
</head>
<body>
<%@include file="header.jsp" %>
<div class="container">

		<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
			<ol class="carousel-indicators">
				<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
				<li data-target="#carousel-example-generic" data-slide-to="1"></li>
				<li data-target="#carousel-example-generic" data-slide-to="2"></li>
				<li data-target="#carousel-example-generic" data-slide-to="3"></li>
				<li data-target="#carousel-example-generic" data-slide-to="4"></li>
				<li data-target="#carousel-example-generic" data-slide-to="5"></li>
			</ol>
			<div class="carousel-inner">
				<div class="item active">
					<img src="<c:url value="/resources/redfrock.jpg"/>">
				</div>
				<div class="item">
					<img src="<c:url value="/resources/yellowfrock.jpg"/>" >
				</div>
				<div class="item">
					<img  src="<c:url value="/resources/blackandredsuit.jpg"/>" >
				</div>
				<div class="item">
					<img src="<c:url value="/resources/reddress.jpg"/>" >
				</div>
				<div class="item">
					<img src="<c:url value="/resources/shadedjeans.jpg"/>" >
				</div>
				<div class="item">
					<img src="<c:url value="/resources/blackshirt.jpg"/>" >
				</div>
			</div>
			<a class="left carousel-control" href="#carousel-example-generic" data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"></span></a> 
			<a class="right carousel-control" href="#carousel-example-generic" data-slide="next"> <span class="glyphicon glyphicon-chevron-right"></span></a>
		</div>
	</div>
	<div class="container" id="about">
	<%@include file="about.jsp" %>
    <div class="footer">
		<%@include file="footer.jsp"%>
	</div>
</body>
</html>