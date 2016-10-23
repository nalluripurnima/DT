<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
.module {
  background: 
  linear-gradient(
  to bottom,
  rgba(0, 0, 0, 0),
  rgba(0, 0, 0, 0.4)
  ),
  url(http://www.photofurl.com/wp-content/uploads/2008/10/beautiful_baby_coming_the_table_wallpaper-1024x640.jpg);
  width: 100%;
  height: 100%;
  position: relative;
  overflow: hidden;
  margin: 20px;
  }
.module > header {
  position: absolute;
  bottom: 0;
  left: 0;
  width: 100%;
  padding: 20px 10px;
  }
.module > header > h1 {
  margin: 0;
  text-shadow: 0 1px 0 black;
  }

* {
  box-sizing: border-box;
  }

</style>
</head>
<body>
     <%@include file="header.jsp" %>
<div class="module">
   <header>
     <h1>
       <a href=""> <span class="glyphicon glyphicon-phone-alt">+91-9876543210</span></a><br><br> 		 
	   <a href=""> <span class="glyphicon glyphicon-envelope">Purnima.Nalluri@gmail.com</span></a><br>		
    </h1>
  </header>
</div>
     <div class="footer">
         <%@include file="footer.jsp" %>
    </div>
  </body>
</html>