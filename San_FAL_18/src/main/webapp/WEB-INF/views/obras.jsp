<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
	<title>Sanatorio IUA</title>	
	<link href="<%=request.getContextPath()%>/resources/css/menu.css" rel="stylesheet" type="text/css">
</head>
<body>
<div id="page">
<div id="content">
	<div class="titulo">
	<h3>Lista de Obras Sociales</h3>
    <table id="tabla">
        <tr>
            <td><b>ID</b></td><td><b>NOMBRE</b></td><td><b>EDITAR</b></td><td><b>BORRAR</b></td>
        </tr>
      <c:forEach items="${obrassociales}" var="obrasocial">
            <tr>
            <td>${obrasocial.os_id}</td>
            <td>${obrasocial.nombre}</td>
            <td><a href="<c:url value='/forms/edit-${obrasocial.os_id}-obrasocial' />">${obrasocial.os_id}</a></td>
            <td><a href="<c:url value='/forms/delete-${obrasocial.os_id}-obrasocial' />">Borrar</a></td>
            </tr>
        </c:forEach>
    </table>    
    <br/>
    <a href="<c:url value='/forms/newobrasocial.html' />" class="button"><span>Agregar Obra Social</span></a>	      
    <a href="<c:url value='/' />" class="button"><span>Volver</span></a>
</div>
</div>        
</div>
</body>
</html>