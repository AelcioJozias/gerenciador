<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="updateEnterprise" var="linkServeletNewEnterprise"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:formatDate pattern="dd/MM/yyyy" value="${ enterprise.openedDate }" var="date"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Enterprise</title>
</head>
<body>
	<form action="${linkServeletNewEnterprise}" method="post">
		<input name="id" type="hidden" value="${enterprise.id}">
		<label for="name">Nome:</label>
		<input name="name" type="text" value="${enterprise.name}"/>
		<label for="date">Data Abertura:</label>
		<input name="date" type="text" value="${date}"/>
		<input type="submit" />
	</form>
</body>
</html>