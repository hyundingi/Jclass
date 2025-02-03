<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp 태그 표현식</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

table {
	width: 800px;
	margin: 10px auto;
}

th, td {
	width: 150px;
	height: 40px;
	text-align: center;
}
</style>
</head>
<body>
	<%-- jsp 주석 : 소스보기에 나타나지 않음 [jsp 태그들은 소스보기 했을 때 다 안 보임]--%>
	<!-- 선언식 -->
	<%!
		String[] name = {"홍길동","유관순","이순신","강감찬","김구","홍길자","홍길순","김유신","을지문덕","신사임당"};
	%>

	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		<% for (int i=0;i<10;i++){ %>
		<tr>
			<td><%=i+1 %></td>
			<td>안녕하세요<%=i+1 %></td>
			<td><%= name[i]%></td>
			<td>2025-02-03</td>
			<td>100</td>
		</tr>
		<% } %>
		
	</table>

</body>
</html>