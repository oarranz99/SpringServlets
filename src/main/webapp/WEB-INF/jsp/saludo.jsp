<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:if test="${not empty requestScope.nombre}">
		<h1>Bienvenid@ ${requestScope.nombre}</h1>
	</c:if>
	<hr>
	<h4>Lista empleados</h4>
	<table>
		<c:forEach items="${requestScope.listaEmpleados}"
					var="obj">
					<tr>
						<td>${obj.id}</td><td>${obj.nombre}</td>
					</tr>
		</c:forEach>
		
		Nombre: ${sessionScope.nombre} 
	</table>
</body>
</html>