<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Starters</title>
</head>
<body>
<br>
<p align="center">Starters make your mood brighter! </p><br>
<table border="1" cellPadding ="30%" align="center">
<tr bgcolor="#FBEE61">
<th>ID</th>
<th>Name</th>
<th>Price</th>
</tr>
<c:forEach var="items" items="${food}">
<tr>
<td>${items.id}</td>
<td>${items.name}</td>
<td>${items.price}</td>
</tr>
</c:forEach>
</table>
</body>
</html>