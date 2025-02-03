<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%-- 주석 --%>
<%-- @가 있으면 지시자  자바페이지 속성 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>페이지</title>
</head>
<body>
<%-- <%%> 안에 들어있으면 자바 프로그램 넣을 수 있음 
	 <%!%> 안에 들어있으면 선언식
	 <!-- 스크립 트릿 -->
--%>
	<%
	for (int i = 0; i < 10; i++) {
		out.println(i+"<br/>");
	}
	%>
	<hr>
	<%
	for(int i=1;i<10;i++){
			out.println("["+i+"단]"+"<br/>");
		for (int j=1;j<10;j++){
			out.println(i+" * "+j+" = "+i*j+"<br/>");
		}
	}
	%>
	<hr>
	<%
	int k = 0;
	while(k<10){
		out.println(k+"<br/>");
		k++;
	}
	%>

</body>
</html>