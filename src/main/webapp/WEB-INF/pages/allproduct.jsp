<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd" >
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product Buy Entry</title>
</head>
<body>
    <div align="center">
        <h1>Product List</h1>
        <h3>
            <a href="newProduct">New Product</a>
        </h3>
        <table border="1">
 
            <th>ID</th>
            <th>vendor_name</th>
            <th>batch</th>
            <th>milk_quaintly</th>
            <th>fat</th>
            <th>rate_of_fat</th>
            <th>per_liter</th>
            <th>total</th>
             <th>advanced</th>
              <th>balanc</th>
 
            <c:forEach var="product" items="${getallproducts}">
                <tr>
 
                    <td>${product.id}</td>
                    <td>${product.vendor_name}</td>
                    <td>${product.batch}</td>
                    <td>${product.milk_quaintly}</td>
                     <td>${product.fat}</td>
                    <td>${product.rate_of_fat}</td>
                    <td>${product.per_liter}</td>
                    <td>${product.total}</td>
                    <td>${product.advanced}</td>
                    <td>${product.balance}</td>
                    
                    <td><a href="editProduct?id=${product.id}">Edit</a>
                        <a href="deleteProduct?id=${product.id}">Delete</a></td>
 
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
