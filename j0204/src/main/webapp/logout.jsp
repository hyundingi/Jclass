<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		session.invalidate(); // 모든 섹션 종료
		// removeAttributte("session_id"); // 특정 섹션만 삭제
		response.sendRedirect("j0204_01.jsp");
	%>

</body>
</html>