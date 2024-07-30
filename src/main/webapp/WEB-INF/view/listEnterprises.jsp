<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List,br.com.jozias.gerenciador.model.Enterprise"%>
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
			<li>
				${ enterprise.name } - <fmt:formatDate pattern="dd/MM/yyyy" value="${ enterprise.openedDate }"/>
				<a href="/gerenciador/entry?action=EnterpriseForm&id=${enterprise.id}" onclick="updateEnterprise(event, ${enterprise.id})">Update</a>
				<a href="/gerenciador/entry?action=DeleteEnterprise&id=${enterprise.id}" onclick="deleteEnterprise(event, ${enterprise.id})">Remove</a>		
			 </li>
		</c:forEach>
	</ul>
	<script type="text/javascript">
	</script>
</body>
</html>