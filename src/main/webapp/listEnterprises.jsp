<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.jozias.gerenciador.servlet.Enterprise"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gerenciador</title>
</head>
<body>

	<h1>Enterprises</h1>
	
	<ul>
		<c:forEach items="${enterprises}" var="enterprise">
			<li>${ enterprise.name }</li>
		</c:forEach>
	</ul>
	
</body>
</html>