<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- PAGINA DE TURNOS -->

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
			<li class="page_item "><a title="Profesionales" href="/iua/forms/profesionales.html">Profesionales</a></li>
			<li class="page_item "><a title="Contacto" href="/iua/forms/contacto.html">Contacto</a></li>
			<li class="page_item inicio actual"><a title="Turnos" href="/iua/forms/turnos.html">Turnos</a></li>
			<li class="page_item "><a title="Inicio de sesion" href="/iua/spring_security_login">Ingreso</a></li>
		</ul>
	</div>
	<div id="content">
	<div class="titulo">
		<h3>Sacar turno en linea</h3>
	Para crear un turno es necesario estar registrado, una vez realizado el registro, ingrese su DNI para proceder a la creacion de un nuevo turno.  	  
    <form:form action="turnos.html"  commandName="combtab">
	<table align="center">
	<tr><td colspan="3">
        	<tr><td colspan="2" align="center"><h3>Paciente registrado</h3></td></tr>
			<tr><td>&nbsp;</td></tr>
			<tr><td>DNI:</td><td><form:input type="number" path="paciente.dni" /></td></tr>
			<tr><td>&nbsp;</td></tr>                    
			<tr><td colspan="2" align="center"><input type="submit" value="Continuar" class="buttonStyle" /></td></tr>
			<tr><td>&nbsp;</td></tr>                            
		<tr><td colspan="2" align="center">	
		<a href="newpaciente.html" class="button"><span>Registrarse</span></a>
		<a href="/iua" class="button"><span>Inicio</span></a></td></tr>
	</table>
	</form:form>
	</div>
</div>
</div>
</body>
</html>