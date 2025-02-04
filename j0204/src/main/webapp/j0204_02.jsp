<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- --  core lib : 변수선언, 흐름제어(for, if, switch)사용 가능, 특정변수출력 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl</title>
</head>
<body>
	<%
	String sid = "aaa";
	%>
	<div>
		스크립트릿 사용 :
		<%=sid%></div>
	<hr>
	<!--  변수선언 -->
	<c:set var="id" value="bbb" />
	<div>jstl 변수값 : ${id}</div>
	<c:out value="${id}"></c:out>
	<hr>
	<%-- jstl태그(c:~)_와 el태그(${})를 사용하여 만든 식  --%>
	<c:if test="${id == 'bbb'}">
		<div>id는 bbb입니다.</div>
	</c:if>
	<c:if test="${id != 'bbb'}">
		<div>id는 bbb가 아닙니다.</div>
	</c:if>
	<c:forEach begin="1" end="10" step="1" var="i">
		<div> i변수값 : ${i}</div>
	</c:forEach>
	<c:set var="score" value="89" />
	<c:choose>
		<c:when test="${score>=90 }">
			<div>성적 : A</div>
		</c:when>
		<c:when test="${score>=80 }">
			<div>성적 : B</div>
		</c:when>
		<c:when test="${score>=70 }">
			<div>성적 : C</div>
		</c:when>
		<c:when test="${score>=60 }">
			<div>성적 : D</div>
		</c:when>
		<c:when test="${score>=50 }">
			<div>성적 : F</div>
		</c:when>
	</c:choose>
</body>
</html>