<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- PAGINA DE SERVICIOS -->

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
		<p>Bienvenido:<core:out value="  ${username}" /></p>
			<a href="<core:url value="/j_spring_security_logout" />" ><span>Logout</span></a>
		</div>
		<ul id="nav">
			<li class="page_item inicio actual"><a title="Inicio" href="/iua">Inicio</a></li>												
			<li class="page_item "><a title="Quienes somos" href="/iua">Conozcanos</a></li>
			<li class="page_item "><a title="Profesionales" href="/iua/forms/profesionales.html">Profesionales</a></li>
			<li class="page_item "><a title="Contacto" href="/iua/forms/contacto.html">Contacto</a></li>
			<li class="page_item "><a title="Turnos" href="/iua/forms/turnos.html">Turnos</a></li>
			<li class="page_item "><a title="Inicio de sesion" href="/iua/spring_security_login">Ingreso</a></li>
		</ul>
	</div>
<div id="content">
	<div class="titulo">
	
	<h3>Servicios disponibles en el sanatorio</h3>
	<img width="150" height="150" src="<%=request.getContextPath()%>/resources/images/img09.jpg" hspace="5" vspace="5" style="float: right;" />
	<ul>
		<li><a title="Enfermeria" href="/iua/forms/conozcanos.html">ENFERMERIA</a>
		<li><a title="Internacion" href="/iua/forms/conozcanos.html">INTERNACION</a>
		<li><a title="Laboratorio" href="/iua/forms/conozcanos.html">LABORATORIO</a>
		<li><a title="Vacunacion" href="/iua/forms/conozcanos.html">VACUNACION</a>
		<li><a title="Hemodialisis" href="/iua/forms/conozcanos.html">HEMODIALISIS</a>
		<li><a title="Diagnůstico" href="/iua/forms/conozcanos.html">DIAGNOSTICO POR IMAGENES</a>
	</ul>
			
	</div>
</div>
<div id ="footer">
<div class="footer_container">
	<div class="bloque_footer">
	<h4>Quienes Somos</h4>
	<ul>
		<li><a title="Nuestra Historia" href="/iua/forms/conozcanos.html">Historia</a>
		<li><a title="Recursos Humanos" href="/iua/forms/rrhh.html">RRHH</a>
		<li><a title="Sugerencias y Reglamos" href="/iua/forms/sugerencias.html">Sugerencias y reclamos</a>
	</ul>
	</div>
	<div class="bloque_footer">
	<h4>Pacientes</h4>
	<ul>
		<li><a title="Listado de Profesionales" href="/iua/forms/profesionales.html">Profesionales</a>
		<li><a title="Listado de Servicios" href="/iua/forms/servicios.html">Servicios</a>
		<li><a title="Obras Sociales" href="/iua/forms/obras.html">Obras Sociales</a>
	</ul>
	</div>
	<div class="bloque_footer">
	<h4>Centros</h4>
	<ul>
		<li><a title="Centro Cordoba" href="/iua/forms/centros.html#cba">Centro Cordoba</a>
		<li><a title="Centro Rosario" href="/iua/forms/centros.html#ros">Centro Rosario</a>
		<li><a title="Centro Buenos Aires" href="/iua/forms/centros.html#bbaa">Centro Buenos Aires</a>
	</ul>
	</div>
</div>
</div>
<br>
<div id="social">
	<a title="Facebook" href="https://www.facebook.com">
		<img alt="" src="<%=request.getContextPath()%>/resources/images/facelogo.png" style="width:42px;height:42px;border:0"></a>
	<a title="Twitter" href="https://www.twitter.com"
		><img alt="" src="<%=request.getContextPath()%>/resources/images/twitterlogo.png" style="width:42px;height:42px;border:0"></a>
	<a title="Youtube" href="https://www.youtube.com">
		<img alt="" src="<%=request.getContextPath()%>/resources/images/youtubelogo.png" style="width:42px;height:42px;border:0"></a>
</div>
<br>
<div id="pie">
2018 Sanatorio IUA.
</div>
</div>
</body>