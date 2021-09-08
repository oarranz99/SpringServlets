<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario saludo</title>
</head>
<body>
	<h1>FORMULARIO PARA SALUDAR</h1>
	<p>HOY ES  <%= new java.util.Date() %></p>
	
	<form action="saludo" method="get">
		<input type="text" name="paramNombre">
		<input type="submit">
	</form>
</body>
</html>