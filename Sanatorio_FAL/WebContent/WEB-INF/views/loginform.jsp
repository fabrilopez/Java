<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<%=request.getContextPath()%>/css/styles.css" rel="stylesheet" type="text/css">
<title>Sanatorio de la Ciudad de Córdoba</title>

</head>
<body>


<form:form action="loginform.html"  commandName="loginForm">
	<table align="center">
		<tr>
			<td colspan="2" align="center"><h3>Formulario de ingreso</h3></td>
		</tr>
		<tr>
			<td colspan="2" ><FONT color="red"><form:errors
				path="generalErrors" /></FONT></td>
		</tr>
		<tr>
			<td colspan="2" rowspan="2"><FONT color="red"><form:errors
				path="userName" /></FONT>&nbsp;</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>Nombre de usuario:</td>
			<td><form:input path="userName" /></td>
		</tr>
		
		<tr>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td colspan="2" rowspan="2"><FONT color="red"><form:errors
						path="password" /></FONT>&nbsp;</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td>Clave:</td>
			<td><form:password path="password" /></td>
		</tr>
		<tr>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="Ingresar" class="buttonStyle" /></td>
		</tr>
		<tr>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td colspan="2" align="center"><a href="registrationform.html" >Registrarse</a></td>
		</tr>
	</table>
</form:form>
</body>
</html>