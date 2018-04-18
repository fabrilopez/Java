<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Sanatorio IUA</title>	
	<link href="<%=request.getContextPath()%>/resources/css/menu.css" rel="stylesheet" type="text/css">
</head>
<body>
    <form:form method="POST" modelAttribute="especialidad" action="newespecialidad.html" commandName="especialidad">
    	<form:input type="hidden" path="especialidad_id" id="especialidad_id"/>
        <table align="center">
        <tr><td colspan="2" align="center"><h3>Agregar especialidad</h3></td></tr> 
        <tr><td><label for="nombre">Nombre de la nueva especialidad: </label></td><td><form:input path="nombre" id="nombre"/></td></tr>
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
		<a href="profesionales.html" class="button"><span>Volver</span></a>
		<a href="/iua" class="button"><span>Home</span></a></td></tr>
        </table>
    </form:form>
</body>
</html>