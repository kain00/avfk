<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<script src="../../js/jquery.js" ></script>
	<script src="../../js/main.js" ></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 3.0 MVC Series: Hello World</title>
</head>
<body>
<table>
	<thead>
		<tr>
			<td>Pályázat sequencia</td>
			<td>Pályázat azonosító</td>
			<td>Pályázat leírás</td>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="competition" items="${competitions}">
		<tr id="${competition.id}">
			<td>${competition.id}</td>
			<td>${competition.textId}</td>
			<td>${competition.description}</td>
		</tr>
	</c:forEach>
	</tbody>
</table> 
<a href="add">Felvisz</a>

</body>
</html>