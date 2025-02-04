<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>해당값반복</title>
	</head>
	<body>
	<div><%= request.getParameter("st") %></div>
	<div>시작값 : ${param.st}</div>
	<div>마지막 값 : ${param.ed}</div>
	<hr>
		<c:forEach begin="${param.st }" end="${param.ed }" step="1" var="i">
		<div> 반복 : ${i}</div>
		</c:forEach>
	</body>
</html>