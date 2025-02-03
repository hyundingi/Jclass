<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키저장하기</title>
</head>
<body>
<!-- 아이디를 쿠키에 저장 // 변수명: cook_id 변수값: 입력한 데이터ㅏ -->
<%
String cook_id = request.getParameter("id");
String[] saveId = request.getParameterValues("saveId");
if (saveId != null){
	Cookie cookie = new Cookie("cook_id",cook_id);
	response.addCookie(cookie);
%>
<div><%= saveId[0] %>가 저장되었습니다.</div>
<% }else{
	Cookie[] cookies = request.getCookies();
	for (Cookie cookie : cookies){
		if (cookie.getName().equals("cook_id")){
			cookie.setMaxAge(0);
			response.addCookie(cookie);
		}
	}
	%>
	<div>쿠키에 저장되어 있는 cook_id가 삭제되었습니다.</div>
<% }%>
<div>정보 : <%= saveId %></div>
<button onclick="javascript:location.href='loginOk.jsp'">이동하기</button>
</body>
</html>