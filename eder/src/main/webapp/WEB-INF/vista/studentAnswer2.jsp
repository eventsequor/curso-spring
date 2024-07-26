<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/styles/style.css"/>
<title>Insert title here</title>
</head>
<body>
	<div>
		<div>Hola ${param.nameStudent} Welcomen to the spring course</div>
		<div>
			<h3>Attention</h3>
			${idMessage}
		</div>
		<div><img alt="picture" src="${pageContext.request.contextPath}/resources/imgs/fondo.jpg"/></div>
	</div>
</body>
</html>