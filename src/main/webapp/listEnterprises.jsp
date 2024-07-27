<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.jozias.gerenciador.servlet.Enterprise"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gerenciador</title>
</head>
<body>
	<c:if test="${ not empty enterprise	 }">
		Enterprise ${ enterprise } saved with success!
	</c:if>
	<br>
	<h2>Enterprises</h2>
	
	<ul>
		<c:forEach items="${enterprises}" var="enterprise">
			<li>${ enterprise.name } - <fmt:formatDate pattern="dd/MM/yyyy" value="${ enterprise.openedDate }"/> </li>
			
		</c:forEach>
	</ul>
	
</body>
</html>