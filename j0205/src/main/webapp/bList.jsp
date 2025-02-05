<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
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
		</colgroup>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		<c:forEach items="${list}" var="board">
<%-- 		<c:forEach begin="1" end="10" step="1"> --%>
			<tr>
				<td>${board.bno}</td>
				<td>${board.btitle}</td>
				<td>${board.id}</td>
				<td>${board.bgroup}</td>
				<td>${board.bhit}</td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>