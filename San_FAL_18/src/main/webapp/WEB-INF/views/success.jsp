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
<table align="center">
<tr><td colspan="2" align="center"><h3>Mensaje: ${success}</h3></td></tr>
<tr><td>&nbsp;</td></tr>
<tr><td colspan="2" align="center">
<a href="/iua" class="button"><span>Inicio</span></a></td></tr>		
</table>    
</body>
</html>