<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
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
<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
<script
	src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
	
<title>Shopping Zone</title>
<head>
<style>
.gold{
	color: #FFBF00;
}
.product{
	border: 1px solid #dddddd;
	height: 321px;
}
.product>img{
	max-width: 250px;
}
.product-rating{
	font-size: 20px;
	margin-bottom: 25px;
}
.product-title{
	font-size: 30px;
}
.product-desc{
	font-size: 16px;
}
.product-price{
	font-size: 22px;
}
.product-stock{
	color: #74DF00;
	font-size: 20px;
	margin-top: 10px;
}
.product-info{
		margin-top: 50px;
}
.content-wrapper {
	max-width: 1140px;
	background: #fff;
	margin: 0 auto;
	margin-top: 25px;
	margin-bottom: 10px;
	border: 0px;
	border-radius: 0px;
}
.container-fluid{
	max-width: 1140px;
	margin: 0 auto;
}
.view-wrapper {
	float: right;
	max-width: 70%;
	margin-top: 25px;
}
.container {
	padding-left: 0px;
	padding-right: 0px;
	max-width: 100%;
}
.service1-items {
	padding: 0px 0 0px 0;
	float: left;
	position: relative;
	overflow: hidden;
	max-width: 100%;
	height: 321px;
	width: 130px;
}
.service1-item {
	height: 107px;
	width: 120px;
	display: block;
	float: left;
	position: relative;
	padding-right: 20px;
	border-right: 1px solid #DDD;
	border-top: 1px solid #DDD;
	border-bottom: 1px solid #DDD;
}
.service1-item > img {
	max-height: 100%;
	max-width: 100%;
	opacity: 0.6;
	transition: all .2s ease-in;
	-o-transition: all .2s ease-in;
	-moz-transition: all .2s ease-in;
	-webkit-transition: all .2s ease-in;
}
.service1-item > img:hover {
	cursor: pointer;
	opacity: 1;
}
.service-image-left {
	padding-right: 20px;
}
.service-image-right {
	padding-left: 20px;
}
.service-image-left > center > img,.service-image-right > center > img{
	max-height: 100%;
	max-width:100%;
}
</style>
</head>
<body>
<%@include file="header.jsp"%>
<form:form>
<div class="container-fluid">
    <div class="content-wrapper">	
		<div class="item-container">	
			<div class="container">	
				<div class="col-md-12">
					<div class="product col-md-3 service-image-left">
                    
						<center>
							<img src="<c:url value="/resources/${p.pname}.jpg"/>" style="width:300px;height:300px;"/>
						</center>
					</div>
				</div>
				<div class="col-md-7">
					<div class="product-title">${p.pname }</div>
					<div class="product-desc">${p.desc}...........!!!!!</div>
                    <div class="product-rating"><i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star-o"></i> </div>
 					<hr>
					<div class="product-price">${p.price}</div>
					
 				<hr>
					<div class="btn-group cart">						
						<a href="<c:url value='storecart?p=${p.pid}' />" class="btn btn-success btn-sm" role="button">Cart </a>
					</div>
					<div class="btn-group wishlist">
						<a href="<%-- <c:url  value='Product/buy?p=${p.pid}' /> --%>"class="btn btn-success btn-sm" role="button"> Buy </a>
				</div>
			  </div>	
     		</div>
		</div>
	</div> 
</div>
	</form:form>
	 
            <%@include file="footer.jsp" %>
    
</body>
</html>