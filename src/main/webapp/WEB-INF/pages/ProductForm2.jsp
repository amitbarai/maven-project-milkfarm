<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Product</title>
</head>
<body>
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
                <td><form:input path="rate_of_fat" /></td>
            </tr>
            
            <tr>
                <td>per_liter:</td>
                <td><form:input path="per_liter" /></td>
            </tr>
            
            <tr>
                <td>total:</td>
                <td><form:input path="total" /></td>
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
</body>
</html>
