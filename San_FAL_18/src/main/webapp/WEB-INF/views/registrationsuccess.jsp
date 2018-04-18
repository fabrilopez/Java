<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<%=request.getContextPath()%>/resources/css/menu.css" rel="stylesheet" type="text/css">
<title>Sanatorio IUA</title>
</head>
<body>

<table align="center">
	<tr><td colspan="2" align="center"><h2>Registro Exitoso.</h2></td></tr>
	<tr>
		<td width="150">Nombre de Usuario:</td>
		<td width="100"><core:out value="${registration.userName}" /></td>
	</tr>
	<tr>
		<td>Password:</td>
		<td><core:out value="${registration.password}" /></td>
	</tr>
	<tr><td>&nbsp;</td></tr>
	<tr>
		<td colspan="2" align="center" >
		<a href="loginform.html" class="button"><span>Volver</span></a>
		<a href="/iua" class="button"><span>Home</span></a>		
	</tr>
</table>

</body>
</html>