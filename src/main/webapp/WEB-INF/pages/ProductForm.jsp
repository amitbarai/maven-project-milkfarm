<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Product</title>
</head>
<body ng-app="myApp" ng-controller="myCtrl" >
    <div align="center">
        <h1>New/Edit Product</h1>
        <form:form action="saveProduct" method="post" modelAttribute="product">
        <table>
            <form:hidden path="id"/>
            <tr>
                <td>Vendor Name:</td>
                <td><form:input path="vendor_name" /></td>
            </tr>
            <tr>
                <td>Batch:</td>
                <td><form:input path="batch" /></td>
            </tr>
            <tr>
                <td>Milk_quaintly:</td>
                <td><form:input path="milk_quaintly" /></td>
            </tr>
            <tr>
                <td>rate_of_fat:</td>
                <td><input ng-model ="rate_of_fat" /></td>
            </tr>
            
            <tr>
                <td>per_liter:</td>
                <td><input ng-model="per_liter" /></td>
            </tr>
            
            <tr>
                <td>total:</td>
                <td><input ng-model="total"></td>
            </tr>
            
            <tr>
                <td>advanced:</td>
                <td><form:input path="advanced" /></td>
            </tr>
            
            <tr>
                <td>balance:</td>
                <td><form:input path="balance" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
   <script>
var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope) {
	//$scope.rate_of_fat =200;
   // $scope.per_liter =200;
	$scope.result = $scope.rate_of_fat * $scope.per_liter;
    $scope.total = $scope.result
    
  
});
</script>
</body>
</html>
