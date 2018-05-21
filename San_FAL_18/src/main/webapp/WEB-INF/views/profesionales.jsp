<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- PAGINA DE PROFESIONALES -->

<html>
<head>
	<title>Sanatorio IUA</title>	
	<link href="<%=request.getContextPath()%>/resources/images/fav.png" rel="icon" type="image/png">
	<link href="<%=request.getContextPath()%>/resources/css/menu.css" rel="stylesheet" type="text/css">
</head> 	
<body>

<div id="page">
<div id="header">
		<div id="headerimg">
			<a title="Sanatorio.com" href="/iua" >
				<img width="180" height="90" src="<%=request.getContextPath()%>/resources/images/logosan.png" alt="Sanatorio.com" src="/iua" border="0"></a>
		</div>
		<div id="fecha">
		<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/fecha.js"></script>
			
		</div>
		<div id="usuario">
		<core:if test="${loginForm.userName!=null}">
			<p>Bienvenido:<core:out value="  ${loginForm.userName}" /></p>
		</core:if>
		</div>
		<ul id="nav">
			<li class="page_item "><a title="Inicio" href="/iua">Inicio</a></li>												
			<li class="page_item "><a title="Quienes somos" href="/iua/forms/conozcanos.html">Conozcanos</a></li>
			<li class="page_item inicio actual"><a title="Profesionales" href="/iua/forms/profesionales.html">Profesionales</a></li>
			<li class="page_item "><a title="Contacto" href="/iua/forms/contacto.html">Contacto</a></li>
			<li class="page_item "><a title="Turnos" href="/iua/forms/turnos.html">Turnos</a></li>
			<li class="page_item "><a title="Inicio de sesion" href="/iua/forms/loginform.html">Ingreso</a></li>
		</ul>
	</div>
	<div id="content">
	<div class="titulo">
		<h3>Lista de Profesionales</h3>  
    <table id= "tabla">
        <tr>
            <td><b>ID</b></td><td><b>NOMBRE</b></td><td><b>APELLIDO</b></td><td><b>ESPECIALIDAD</b></td><td><b>EDITAR</b></td><td><b>BORRAR</b></td>
        </tr>
        <c:forEach items="${profesionales}" var="profesional">
            <tr>
            <td>${profesional.profesional_id}</td>
            <td>${profesional.nombre}</td>
            <td>${profesional.apellido}</td>        
            <c:forEach items="${especialidades}" var="especialidad">
            	<c:if test="${profesional.especialidad_id==especialidad.especialidad_id}">
            		<td>${especialidad.nombre}</td>	
            	</c:if>
            </c:forEach>
            <td><a href="<c:url value='/forms/edit-${profesional.profesional_id}-profesional' />">${profesional.profesional_id}</a></td>
            <td><a href="<c:url value='/forms/delete-${profesional.profesional_id}-profesional' />">Borrar</a></td>
            </tr>
        </c:forEach>
    </table>
    	<h3>Lista de Especilidades</h3>
    <table id="tabla">
        <tr>
            <td><b>ID</b></td><td><b>ESPECIALIDAD</b></td><td><b>EDITAR</b></td><td><b>BORRAR</b></td>
        </tr>
        <c:forEach items="${especialidades}" var="especialidad">
            <tr>
            <td>${especialidad.especialidad_id}</td>
            <td>${especialidad.nombre}</td>
            <td><a href="<c:url value='/forms/edit-${especialidad.especialidad_id}-especialidad' />">${especialidad.especialidad_id}</a></td>
            <td><a href="<c:url value='/forms/delete-${especialidad.especialidad_id}-especialidad' />">Borrar</a></td>
            </tr>
        </c:forEach>
    </table>    
    <br/>
    <a href="<c:url value='/forms/newespecialidad.html' />" class="button"><span>Agregar especialidad</span></a>	
    <a href="<c:url value='/forms/newprofesional.html' />" class="button"><span>Agregar profesional</span></a>
	</div>
</div>
</div>
</body>
</html>