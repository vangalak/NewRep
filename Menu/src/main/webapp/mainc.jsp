<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main Course</title>
</head>
<body align="center">
<br>
<p align="center">A party mood requires great food!</p>
<table border="1" cellpadding="20%">

<tr>
<th>
<td>ID</td>
<td>Name</td>
<td>Price</td>
</th>
<c:forEach var="main" items="${main }">
<td>${main.id }</td>
<td>${main.name }</td>
<td>${main.price }</td>
</c:forEach>
</tr>
</table>
</body>
</html>