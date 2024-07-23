<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="newEnterprise" var="linkServeletNewEnterprise"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Enterprise</title>
</head>
<body>
	<form action="${linkServeletNewEnterprise}" method="post">
		<label for="enterprise">Nome:</label>
		<input name="name" type="text"/>
		<label for="date">Data Abertura:</label>
		<input name="date" type="text"/>
		<input type="submit" />
	</form>
</body>
</html>