<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!-- PAGINA DE SUGERENCIAS -->

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
	<h3>Formulario de contacto</h3>
	<p>Si tiene consultas o inquietudes por favor complete el siguiente formulario y nuestro personal responderá a la brevedad.</p>
	<img width="150" height="150" src="<%=request.getContextPath()%>/resources/images/img09.jpg" hspace="5" vspace="5" style="float: right;" />
	
<form:form action="sugerencias.html">
<table>
		<tr><td>NOMBRE</td><td>TELEFONO</td><td>EMAIL</td></tr>
		<tr>
		<td><label><input type="text" placeholder="Por favor escribe tu nombre" name="name" id="name" required autofocus></label></td>
		<td><label><input type="tel" placeholder="Porfavor especifica tu número de teléfono" name="telefono" id="telefono" required></label></td>
 		<td><label><input type="email" placeholder="tuemail@servidor.com" name="email" id="email" required></label></td>
		</tr>
		
 		<tr><td>MENSAJE:</td></tr>
 		
 		<tr>
 		<td colspan="3">
 		<label>
 		<textarea id="mensaje" name="mensaje" placeholder="Tu consulta..." cols="60" rows="10"></textarea>
 		</label>
 		</td>
 		</tr>
 		
 		<tr><td>
 		<input class="sendButton" type="submit" name="Submit" value="Enviar">
		</td></tr>
         <tr><td colspan="2" align="center">		
		<a href="<%=request.getContextPath()%>/" class="button"><span>Inicio</span></a></td></tr>
</table>
</form:form>
				
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
		<li><a title="Centro Cordoba" href="/iua/forms/centrocba.html">Centro Cordoba</a>
		<li><a title="Centro Rosario" href="/iua/forms/centroros.html">Centro Rosario</a>
		<li><a title="Centro Buenos Aires" href="/iua/forms/centrobbaa.html">Centro Buenos Aires</a>
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