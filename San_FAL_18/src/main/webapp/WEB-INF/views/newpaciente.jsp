<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Sanatorio IUA</title>	
	<link href="<%=request.getContextPath()%>/resources/images/fav.png" rel="icon" type="image/png">
	<link href="<%=request.getContextPath()%>/resources/css/menu.css" rel="stylesheet" type="text/css">
</head>
<body>
<form:form action="newpaciente.html" method="post" commandName="paciente" >
<form:input type="hidden" path="paciente_id" id="paciente_id"/>
<table align="center">
<tr><td colspan="2" align="center"><h3>Agregar paciente</h3></td></tr>
		<tr><td><label for="dni">DNI: </label></td>							<td><form:input path="dni" id="dni"/></td></tr>
		<tr><td><label for="nombre">Nombre: </label></td>					<td><form:input path="nombre" id="nombre"/></td></tr>
        <tr><td><label for="apellido">Apellido: </label></td>				<td><form:input path="apellido" id="apellido"/></td></tr>
        <tr><td><label for="email">E-mail: </label></td>					<td><form:input path="email" id="email"/></td></tr>
        <tr><td><label for="telefono">Telefono: </label></td>					<td><form:input path="telefono" id="telefono"/></td></tr>
        <tr><td><label for="direccion">Direccion: </label></td>					<td><form:input path="direccion" id="direccion"/></td></tr>
        
        <tr>
        <td><label for="os_id">Obra Social :</label></td>
        <td>
        <select id="os_id" name="os_id">
        	<option value=" - " label= "--Seleccione Obra Social--">
        <c:forEach items="${obrassociales}" var="obrasocial">
            <option value="${obrasocial.os_id}">${obrasocial.nombre}</option>         
        </c:forEach>
        </select>
        </td>
        </tr>
        
        <tr><td colspan="3">
                    <c:choose>
                        <c:when test="${edit}">
                            <input type="submit" value="Actualizar"/>
                        </c:when>
                        <c:otherwise>
                            <input type="submit" value="Registrar"/>
                        </c:otherwise>
                    </c:choose>
         </td></tr>
         <tr><td>&nbsp;</td></tr>
         <tr><td colspan="2" align="center">		
		<a href="<%=request.getContextPath()%>/" class="button"><span>Inicio</span></a></td></tr>
</table>
</form:form>
</body>
</html>