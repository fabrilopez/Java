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
<script>



</script>

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
			<li class="page_item "><a title="Quienes somos" href="/iua/">Conozcanos</a></li>
			<li class="page_item "><a title="Profesionales" href="/iua/forms/profesionales.html">Profesionales</a></li>
			<li class="page_item "><a title="Contacto" href="/iua/forms/contacto.html">Contacto</a></li>
			<li class="page_item inicio actual"><a title="Turnos" href="/iua/forms/turnos.html">Turnos</a></li>
			<li class="page_item "><a title="Inicio de sesion" href="/iua/spring_security_login">Ingreso</a></li>
		</ul>
	</div>
	<div id="content">
	<div class="titulo">
		<h3>Sacar turno en linea</h3>  	  
    <form:form action="newturno.html" method="post" commandName="combtab">
    <form:input type="hidden" path="turno.turno_id" id="turno.turno_id"/>
    <form:input type="hidden" path="paciente.dni" id="paciente.dni"/>
    <table align="center">
		<tr><td colspan="2" align="center"><h3>Paciente registrado</h3></td></tr>
		<tr><td>DNI:</td><td><core:out value="${combtab.paciente.dni}"></core:out></td></tr>
		<tr><td>Nombre:</td><td>${combtab.paciente.nombre}</td></tr>
		<tr><td>Apellido:</td><td>${combtab.paciente.apellido}</td></tr>
		<tr><td>Obra social:</td><td>${combtab.obrasocial.nombre}</td></tr>
		<tr><td><label for="tipo_practica">Tipo de práctica:</label></td><td><form:input path="turno.tipo_practica" id="turno.tipo_practica"/></td></tr>
		
		<!-- Ingreso de especialidad -->
		<tr>
        <td><label for="especialidad_id">Especialidad :</label></td>
        <td>
        <select id="especialidad.especialidad_id" name="especialidad.especialidad_id">
        <option value=" - " label= "--Seleccione especialidad--">
        <c:forEach items="${combtab.especialidades}" var="especialidad">
            <option value="${especialidad.especialidad_id}">${especialidad.nombre}</option>         
        </c:forEach>
        </select>
        </td>
        </tr>
		
		<!-- Ingreso de profesional de acuerdo a especialidad elegida (Falta implementar)-->
		<tr>
        <td><label for="profesional_id">Profesional :</label></td>
        <td>
        <select id="profesional.profesional_id" name="profesional.profesional_id">
        <option value=" - " label= "--Seleccione profesional--">
        <c:forEach items="${combtab.profesionales}" var="profesional">
        	<option value="${profesional.profesional_id}">${profesional.nombre} ${profesional.apellido} </option>
        </c:forEach>
        </select>
        </td>
        </tr>
		
		
		<tr><td>&nbsp;</td></tr>
		<tr><td colspan="2" align="center"><input type="submit" value="Aceptar" class="buttonStyle" /></td></tr>
		<tr><td>&nbsp;</td></tr>
		<tr><td colspan="2" align="center">	
		<a href="<%=request.getContextPath()%>/" class="button"><span>Inicio</span></a></td></tr>
	</table>
	</form:form>
	</div>
</div>
</div>
</body>
</html>