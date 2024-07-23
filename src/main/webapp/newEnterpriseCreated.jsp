<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${ not empty enterprise	 }">
Enterprise ${ enterprise } saved with success!
</c:if>
	<c:if test="${empty enterprese }">
	None enterprise saved 
</c:if>
</body>
</html>