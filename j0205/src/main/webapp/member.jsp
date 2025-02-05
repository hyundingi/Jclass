<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

table {
	width: 800px;
	margin: 10px auto;
	text-align: center;
}

th, td {
	height: 40px;
}

h2 {
	text-align: center;
}
</style>
</head>
<body>
	<h2>게시판 리스트</h2>
	<table>
		<colgroup>
			<col width="10%">
			<col width="*">
			<col width="15%">
			<col width="15%">
			<col width="15%">
			<col width="15%">
		</colgroup>
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>전화번호</th>
			<th>성별</th>
			<th>취미</th>
		</tr>
		<c:forEach items="${list }" var="member">
		<tr>
		<td>${member.id }</td>
		<td>${member.pw }</td>
		<td>${member.name }</td>
		<td>${member.tel }</td>
		<td>${member.gender }</td>
		<td>${member.hobby }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>