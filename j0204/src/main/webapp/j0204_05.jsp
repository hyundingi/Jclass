<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="now" class="java.util.Date"></jsp:useBean>
	<div>날짜 : <fmt:formatDate value="${now }" pattern="yyyy-MM-dd"/></div>
	<div>년도 : <fmt:formatDate value="${now }" pattern="yyyy"/></div>
	<div>월 : <fmt:formatDate value="${now }" pattern="MM"/></div>
	<div>일 : <fmt:formatDate value="${now }" pattern="dd"/></div>
	<div>시 : <fmt:formatDate value="${now }" pattern="hh"/></div>
	<div>분 : <fmt:formatDate value="${now }" pattern="mm"/></div>
	<div>초 : <fmt:formatDate value="${now }" pattern="ss"/></div>
	<hr>
	<c:set var="name" value="홍       길  동"></c:set>
	<div> 이름 : ${name }</div>
	<c:if test="${fn:contains(name,'동') }">
		<div> 이름에 동이라는 글자가 포함되어 있습니다.</div>
	</c:if>
	<div> 이름 : ${fn:replace(name," ","") }</div>


</body>
</html>