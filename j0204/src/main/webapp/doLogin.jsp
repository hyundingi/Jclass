<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 확인</title>
</head>
<body>
	<h2>로그인 확인</h2>
	<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	session.setAttribute("session_id", id); // 섹션으로 저장
	if(id.equals("aaa") && pw.equals("1111")){
		// 로그인 틀리면 로그인페이지로 다시 돌아감
		response.sendRedirect("login.jsp");
	}else{
		// 로그인 되면 확인창으로 안 가고 메인으로 바로감
		response.sendRedirect("j0204_01.jsp"); // 바로 보내기
	}
	%>
	<div>아이디 : <%= id %></div>
	<div>패스워드 : <%= pw %></div>
	
	<button onclick="javascript:location.href='j0204_01.jsp'">이동하기</button>

</body>
</html>