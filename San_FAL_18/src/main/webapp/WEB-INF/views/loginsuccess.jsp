<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<%=request.getContextPath()%>/resources/images/fav.png" rel="icon" type="image/png">
<link href="<%=request.getContextPath()%>/resources/css/menu.css" rel="stylesheet" type="text/css">
<title>Sanatorio IUA</title>
</head>
<body>
<table align="center">
	<tr><td colspan="2" align="center"><h1>Bienvenido <core:out value="${loginForm.userName}" /></h1></td></tr>
	<tr><td colspan="2" align="center"><h2>Sus Datos</h2></td></tr>
	<tr>
		<td width="150">Nombre de Usuario:</td>
		<td width="100"><core:out value="${loginForm.userName}" /></td>
	</tr>
	<tr>
		<td>Password:</td>
		<td><core:out value="${loginForm.password}" /></td>
	</tr>
	<tr>
		<td>Email:</td>
		<td><core:out value="${loginForm.email}" /></td>
	</tr>
	<tr>
		<td>Nombre:</td>
		<td><core:out value="${loginForm.name}" /></td>
	</tr>
	<tr>
		<td>Apellido:</td>
		<td><core:out value="${loginForm.surname}" /></td>
	</tr>
	<tr><td>&nbsp;</td></tr>
	<tr align="center">
		<td colspan="2" align="center">
		<a href="loginform.html" class="button"><span>Logout</span></a>
		<a href="/iua" class="button"><span>Inicio</span></a></td>									
	</tr>
</table>
</body>
</html>