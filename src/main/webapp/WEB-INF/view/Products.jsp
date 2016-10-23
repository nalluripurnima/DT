<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<body>
  <script>
    angular.module('myApp', []).controller('productCtrl', function($scope) {
        $scope.names = ${sproducts};
        $scope.orderByMe = function(x) {
            $scope.myOrderBy = x;
        }
    });
    alert('hello welcome to eshop');
   </script>
  <div id="tour" class="bg-1">
    <div style="background-color: white;height: 30px;">
    	<form>
			<input type="text" ng-model="search" style="height: 30px;width: 30%;outline: none;"/>&nbsp&nbsp
			<span class="glyphicon glyphicon-search"></span> Search
	   </form>
	</div>
	<br/> 
  <div class="container" ng-app="myApp" ng-controller="productCtrl">
     <div class="col-md-2 column productbox">
		<div class="columns" ng-repeat="resource in names | filter:search">
		<img src='<c:url value="/resources/{{resource.pname}}.jpg"/>' style="width:300px;height:300px;"/>
		<div class="producttitle">{{resource.pname}}</div>
		<div class="productprice">
			<div class="pricetext">{{resource.price}}</div>
		</div>
		<div class="pull-left">
			<a href="moredetails?p={{resource.pid}}" class="btn btn-info btn-sm" role="button">MoreDetails</a>
		</div>
		<div class="pull-right">
			<a href="buy" class="btn btn-info btn-sm" role="button">BUY</a>
		</div>
	   </div>
	  </div>
	 </div>   
    </div>
 </body>
</html>

