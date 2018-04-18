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
				<img width="172" height="114" alt="Sanatorio.com" src="/iua" border="0"></a>
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
			<li class="page_item "><a title="Quienes somos" href="/iua">Conozcanos</a></li>
			<li class="page_item "><a title="Profesionales" href="/iua/forms/profesionales.html">Profesionales</a></li>
			<li class="page_item inicio actual"><a title="Contacto" href="/iua/forms/contacto.html">Contacto</a></li>
			<li class="page_item "><a title="Turnos" href="/iua/forms/loginform.html">Turnos</a></li>
			<li class="page_item "><a title="Inicio de sesion" href="/iua/forms/loginform.html">Ingreso</a></li>
		</ul>
	</div>
	<div id="content">
	<div class="titulo">
		<h2>Informacion de contacto.</h2>
		<div class="parrafo">
		<p>
			Contacto 1:
		</p>	
		
		<p>	
			Contacto 2:
		</p>
		
		<p>	
			Contacto 3:
		</p>	
		
		<p>	
			Contacto 4:
		</p>
		</div>	
	</div>
</div>
</div>
</body>
</html>