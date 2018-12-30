<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd" >
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Vendor Management Screen</title>
</head>
<body>
    <div align="center">
        <h1>Vendor List</h1>
        <h3>
            <a href="newVendor">New Vendor</a>
             <a href="allproduct"> product</a>
        </h3>
        <table border="1">
 
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
            <th>Telephone</th>
            <th>Action</th>
 
            <c:forEach var="vendor" items="${listVendor}">
                <tr>
 
                    <td>${vendor.name}</td>
                    <td>${vendor.email}</td>
                    <td>${vendor.address}</td>
                    <td>${vendor.telephone}</td>
                    <td><a href="editVendor?id=${vendor.id}">Edit</a>
                        <a href="deleteVendor?id=${vendor.id}">Delete</a></td>
 
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
