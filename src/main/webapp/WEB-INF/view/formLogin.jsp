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
		<label for="login">Login:</label>
		<input name="login" autocomplete="off" type="text"/>
		<label for="password">Password:</label>
		<input name="password" type="password" autocomplete="off"/>
		<input name="action" value="Login" type="hidden"/>
		<input type="submit" />
	</form>
</body>
</html>