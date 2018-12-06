<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
<h1>Entraste a mi sitio !!!</h1>
Hola !!! <c:out value="${param.Apellido}"></c:out>
<c:set var="contador" value="1" scope="session" />
<table>
<c:forTokens items="${param.Frase}" delims=" " var="Palabras">
<tr><td><c:out value="${contador}"/> </td><td>
<c:out value="${Palabras}"/>
</td></tr>
<c:set var="contador" value="${contador+1}" />
</c:forTokens>
</table>
</body>
</html>