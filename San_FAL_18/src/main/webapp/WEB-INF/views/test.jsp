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
<div id="header">
		<div id="headerimg">
			<a title="Sanatorio.com" href="/iua" >
				<img width="180" height="90" src="<%=request.getContextPath()%>/resources/images/logosan.png" alt="Sanatorio.com" src="/iua" border="0"></a>
		</div>
		<div id="fecha">
		<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/fecha.js"></script>
			
		</div>
		<div id="usuario">
		<p>Bienvenido: 
		<core:out value="${loginForm.userName}" />
		</p>
		</div>
		<ul id="nav">
			<li class="page_item "><a title="Inicio" href="/iua">Inicio</a></li>												
			<li class="page_item "><a title="Quienes somos" href="/iua/">Conozcanos</a></li>
			<li class="page_item inicio actual"><a title="Profesionales" href="/iua/forms/profesionales.html">Profesionales</a></li>
			<li class="page_item "><a title="Contacto" href="/iua/forms/contacto.html">Contacto</a></li>
			<li class="page_item "><a title="Turnos" href="/iua/forms/turnos.html">Turnos</a></li>
			<li class="page_item "><a title="Inicio de sesion" href="/iua/forms/loginform.html">Ingreso</a></li>
		</ul>
	</div>
	<div id="content">
	<div class="titulo">
<form:form action="test.html" method="post" commandName="combtab">

	<h3>Lista de Profesionales</h3>  
    <table id= "tabla">
        <tr>
            <td><b>ID</b></td><td><b>NOMBRE</b></td><td><b>APELLIDO</b></td><td><b>ESPECIALIDAD</b></td>
        </tr>
        <c:forEach items="${combtab.profesionales}" var="profesional">
            <tr>
            <td>${profesional.profesional_id}</td>
            <td>${profesional.nombre}</td>
            <td>${profesional.apellido}</td>        
            <c:forEach items="${combtab.especialidades}" var="especialidad">
            	<c:if test="${profesional.especialidad_id==especialidad.especialidad_id}">
            		<td>${especialidad.nombre}</td>	
            	</c:if>
            </c:forEach>
            </tr>
        </c:forEach>
    </table>

<h3>Lista de Pacientes</h3>  
    <table id= "tabla">
        <tr>
            <td><b>ID</b></td><td><b>DNI</b></td><td><b>NOMBRE</b></td><td><b>APELLIDO</b></td><td><b>EMAIL</b></td><td><b>TELEFONO</b></td><td><b>DIRECCION</b></td><td><b>OBRASOCIAL</b></td>
        </tr>
        <c:forEach items="${combtab.pacientes}" var="paciente">
            <tr>
            <td>${paciente.paciente_id}</td>
            <td>${paciente.dni}</td>
            <td>${paciente.nombre}</td>
            <td>${paciente.apellido}</td>
            <td>${paciente.email}</td>
            <td>${paciente.telefono}</td>
            <td>${paciente.direccion}</td>                                
            <c:forEach items="${combtab.obrassociales}" var="obrasocial">
            	<c:if test="${obrasocial.os_id==paciente.os_id}">
            		<td>${obrasocial.nombre}</td>	
            	</c:if>
            </c:forEach>                     
            </tr>
        </c:forEach>
    </table>


	
	</form:form>
	</div>
	</div>
	</div>
</body>
</html>