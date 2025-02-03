<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- html 주석 : 소스보기 하면 나타남 -->
<%-- jsp 주석 : 소스보기 하면 안 나타남 --%>

<!--  저장되었는지, 삭제되었는지 출력 -->
<%
String cook_id = request.getParameter("id");
String[] saveid = request.getParameterValues("idsave");

if(saveid != null){
	Cookie cookie = new Cookie("cook_id",cook_id);
	response.addCookie(cookie);
%>
<div><%= saveid[0] %>가 저장되었습니다.</div>
<% }else{
	Cookie[] cookies = request.getCookies();
	for (Cookie cookie : cookies){
		if (cookie.getName().equals("cook_id")){
			cookie.setMaxAge(0);
			response.addCookie(cookie);
		}
	}%>
	<div>쿠키에 저장되어 있는 cook_id가 삭제됨.</div>
<% } %>

<div>현재 cook_id : <%= cook_id %></div>
<button onclick="javascript:location.href='logOk.jsp'">이동하기</button>

</body>
</html>