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
			<li>
				${ enterprise.name } - <fmt:formatDate pattern="dd/MM/yyyy" value="${ enterprise.openedDate }"/>
				<a href="/${enterprise.id}" onclick="updateEnterprise(event, ${enterprise.id})">Update</a>
				<a href="/${enterprise.id}" onclick="deleteEnterprise(event, ${enterprise.id})">Remove</a>		
			 </li>
		</c:forEach>
	</ul>
	<script type="text/javascript">
	function deleteEnterprise(event, enterpriseId) {
	    event.preventDefault(); 
	    fetch('http://localhost:8080/gerenciador/deleteEnterprise?id=' + enterpriseId, {
	        method: 'DELETE'
	    })
	    .then(response => {
	        if (response.ok) {
	        	alert('Deleted successfully');
	        	window.location.href = "http://localhost:8080/gerenciador/listEnterprises";
	        } else {
	        	alert('Failed to delete');
	        }
	    })
	    .catch(error => console.error('Error:', error));
	}
	
	function updateEnterprise(event, enterpriseId) {
		event.preventDefault(); 
		const url = 'http://localhost:8080/gerenciador/updateEnterprise?id=' + enterpriseId
		window.location.href = url
	}
	</script>
</body>
</html>