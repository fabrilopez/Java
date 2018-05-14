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
<body>
    <form:form method="POST" modelAttribute="profesional" action="newprofesional.html" commandName="profesional">
    	<form:input type="hidden" path="profesional_id" id="profesional_id"/>
        <table align="center">
        <tr><td colspan="2" align="center"><h3>Agregar profesional</h3></td></tr> 
        <tr><td><label for="nombre">Nombre: </label></td>					<td><form:input path="nombre" id="nombre"/></td></tr>
        <tr><td><label for="apellido">Apellido: </label></td>				<td><form:input path="apellido" id="apellido"/></td></tr>
        <tr><td><label for="email">E-mail: </label></td>					<td><form:input path="email" id="email"/></td></tr>        
        
        <tr>
        <td><label for="especialidad_id">Especialidad :</label></td>
        <td>
        <select id="especialidad_id" name="especialidad_id">
        	<option value=" - " label= "--Seleccione especialidad--">
        <c:forEach items="${especialidades}" var="especialidad">
            <option value="${especialidad.especialidad_id}">${especialidad.nombre}</option>         
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
		<a href="<%=request.getContextPath()%>/forms/profesionales.html" class="button"><span>Volver</span></a>
		<a href="<%=request.getContextPath()%>/" class="button"><span>Home</span></a></td></tr>
        </table>
        
        
        
    </form:form>
</body>
</body>
</html>