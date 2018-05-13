<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- PAGINA DE CONTACTOS -->

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
			<li class="page_item "><a title="Quienes somos" href="/iua/forms/conozcanos.html">Conozcanos</a></li>
			<li class="page_item "><a title="Profesionales" href="/iua/forms/profesionales.html">Profesionales</a></li>
			<li class="page_item inicio actual"><a title="Contacto" href="/iua/forms/contacto.html">Contacto</a></li>
			<li class="page_item "><a title="Turnos" href="/iua/forms/turnos.html">Turnos</a></li>
			<li class="page_item "><a title="Inicio de sesion" href="/iua/forms/loginform.html">Ingreso</a></li>
		</ul>
	</div>
	<div id="content">
	<div class="titulo">
		<h2>Informacion de contacto.</h2>
		<div class="parrafo">
			<img width="250" height="250" src="<%=request.getContextPath()%>/resources/images/img10.jpg" hspace="5" vspace="5" style="float: left;" />
			<h4>Encontranos en las redes.</h4>
			<a title="Facebook" href="https://www.facebook.com">
			<img alt="" src="<%=request.getContextPath()%>/resources/images/facelogo.png" style="width:42px;height:42px;border:0"></a>
			<a title="Twitter" href="https://www.twitter.com"
			><img alt="" src="<%=request.getContextPath()%>/resources/images/twitterlogo.png" style="width:42px;height:42px;border:0"></a>
			<a title="Youtube" href="https://www.youtube.com">
			<img alt="" src="<%=request.getContextPath()%>/resources/images/youtubelogo.png" style="width:42px;height:42px;border:0"></a>
			
			<h4>Correo electrónico.</h4>
			<a href="mailto:fabri_lopez@hotmail.com">sanatorioiua@gmail.com.ar</a>
			
			<h4>O envíenos sus inquietudes.</h4>
			+<a title="Sugerencias y Reglamos" href="/iua/forms/sugerencias.html">Sugerencias y reclamos</a> 
		
		</div>	
	</div>
</div>
</div>
</body>
</html>