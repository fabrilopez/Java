<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<%=request.getContextPath()%>/resources/css/menu.css" rel="stylesheet" type="text/css">
<title>Sanatorio IUA</title>
<link href="<%=request.getContextPath()%>/resources/images/fav.png" rel="icon" type="image/png">
</head>
<body>
<form:form method="Post" action="registrationform.html" commandName="registration">
	<table align="center" >
		<tr><td colspan="2" align="center"><h3>Formulario de Registro</h3></td></tr>
		<tr><td colspan="2"><FONT color="red"><form:errors path="generalErrors" /></FONT></td></tr>
		<tr><td colspan="2"><FONT color="red"><form:errors	path="userName" /></FONT></td></tr>
		<tr><td>Usuario:</td><td><form:input path="userName" /></td></tr>
		<tr><td colspan="2"><FONT color="red"><form:errors	path="password" /></FONT></td></tr>
		<tr><td>Clave:</td><td><form:password path="password" /></td>			</tr>
		<tr><td colspan="2"><FONT color="red"><form:errors	path="confirmPassword" /></FONT></td></tr>
		<tr><td>Confirmar Clave:</td><td><form:password path="confirmPassword" /></td></tr>
		<tr><td colspan="2"><FONT color="red"><form:errors path="email" /></FONT></td></tr>
		<tr><td>Email:</td><td><form:input path="email" /></td></tr>
		<tr><td colspan="2"><FONT color="red"><form:errors path="name" /></FONT></td></tr>
		<tr><td>Nombre:</td><td><form:input path="name" /></td></tr>
		<tr><td colspan="2"><FONT color="red"><form:errors path="surname" /></FONT></td></tr>
		<tr><td>Apellido:</td><td><form:input path="surname" /></td></tr>
		<tr><td>&nbsp;</td></tr>
		<tr><td colspan="2" align="center"><input type="submit" value="Agregar Usuario" class="buttonStyle" /></td></tr>
		<tr><td>&nbsp;</td></tr>
		<tr><td colspan="2" align="center">
		<a href="loginform.html" class="button"><span>Volver</span></a>
		<a href="/iua" class="button"><span>Home</span></a></td></tr>
		
	</table>
</form:form>
</body>
</html>