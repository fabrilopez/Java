<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<%=request.getContextPath()%>/resources/images/fav.png" rel="icon" type="image/png">
<link href="<%=request.getContextPath()%>/resources/css/menu.css" rel="stylesheet" type="text/css">
<title>Sanatorio IUA</title>
</head>
<body>	
<table align="center">
<tr><td colspan="2" align="center">

	<h1>HTTP Status 403 - Acceso Negado</h1>

	<c:choose>
		<c:when test="${empty username}">
		  <h2>Usted no cuenta con los permisos para acceder a ésta página!</h2>
		</c:when>
		<c:otherwise>
		  <h2>Username : ${username} <br/>
                    Usted no tiene permiso para acceder a ésta página!</h2>
		</c:otherwise>
	</c:choose>

</td></tr>
<tr><td>&nbsp;</td></tr>
<tr><td colspan="2" align="center">
<a href="/iua" class="button"><span>Inicio</span></a></td></tr>		
</table>    
</body>
</html>
