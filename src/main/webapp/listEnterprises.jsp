<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.jozias.gerenciador.servlet.Enterprise"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gerenciador</title>
</head>
<body>

	<h1>Enterprises</h1>
	<ul>
	<% List<Enterprise> enterprisesList = (List<Enterprise>) request.getAttribute("enterprises");
 
		for(Enterprise enterprise : enterprisesList) {
	%>
	<li> <%= enterprise.getName() %> </li> 
	
	<%	} %>
	</ul> 
		
		
		
</body>
</html>