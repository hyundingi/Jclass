<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>페이지</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

table {
	width: 900px;
	margin: 10px auto;
	text-align: center;
	
}
th {
	background: pink;
}

th, td {
	height: 40px;
}
</style>
</head>
<body>
	<h2>리스트 출력</h2>
	<table>
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>취미</th>
		</tr>
		<c:forEach items="${list }" var="member">
		<tr>
			<td>${member.id }</td>
			<td>${member.name }</td>
			<td>${member.hobby }</td>
		</tr>
		</c:forEach>
	</table>
	<hr>
	<h2>홍길동 회원정보</h2>
	<form action="">
	<label> 아이디 </label>
	<input type="text" name="id" value="${list[0].id }"><br>
	<label> 이름 </label>
	<input type="text" name="name" value="${list[0].name }"><br>
	<label> 취미 </label>
	<input type="checkbox" id="game" name="hobby" value="game" 
	<c:if test="${fn:contains(list[0].hobby,'게임') }">checked</c:if> >
	<label for="game"> 게임 </label>
	<input type="checkbox" id="golf" name="hobby" value="golf"
	<c:if test="${fn:contains(list[0].hobby,'골프') }">checked</c:if> >
	<label for="golf"> 골프 </label>
	<input type="checkbox" id="swim" name="hobby" value="swim"
	<c:if test="${fn:contains(list[0].hobby,'수영') }">checked</c:if> >
	<label for="swim"> 수영 </label>
	<input type="checkbox" id="run" name="hobby" value="run"
	<c:if test="${fn:contains(list[0].hobby,'조깅') }">checked</c:if> >
	<label for="run"> 조깅 </label>
	<input type="checkbox" id="book" name="hobby" value="book"
	<c:if test="${fn:contains(list[0].hobby,'독서') }">checked</c:if> >
	<label for="book"> 독서 </label>
	
	</form>

</body>
</html>