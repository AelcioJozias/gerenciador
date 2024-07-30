<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="entry" var="linkServeletNewEnterprise"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Enterprise</title>
</head>
<body>
	<form action="${linkServeletNewEnterprise}" method="post">
		<label for="name">Nome:</label>
		<input name="name" type="text"/>
		<label for="date">Data Abertura:</label>
		<input name="date" type="text"/>
		<input name="action" value="NewEnterprise" type="hidden"/>
		<input type="submit" />
	</form>
</body>
</html>