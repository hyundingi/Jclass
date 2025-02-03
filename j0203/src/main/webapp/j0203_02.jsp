<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form</title>
</head>
<body>
	<h2>회원가입</h2>
	<form action="./FormSend" method="post" name="frm">
	<label>아이디</label>
	<input type="text" name="id"><br/>
	<label>패스워드</label>
	<input type="text" name="pw"><br/>
	<label>이름</label>
	<input type="text" name="name"><br/>
	<label>성별</label>
	<input type="radio" id="man" name="gender"><br/>
	<label for="man">남자</label>
	<input type="radio" id="woman" name="gender"><br/>
	<label for="woman">여자</label>
	
	<label>취미</label><br/>
	<input type="checkbox" id="game" value="game" name="hobby"><br/>
	<label for="game">게임</label>
	<input type="checkbox" id="golf" value="golf" name="hobby"><br/>
	<label for="golf">골프</label>
	<input type="checkbox" id="swim" value="swim" name="hobby"><br/>
	<label for="swim">수영</label>
	<input type="checkbox" id="book" value="book" name="hobby"><br/>
	<label for="book">독서</label>
	<br/>
	<select>
	
	</select>
	<input type="submit" value="가입완료">
	
	
	</form>

</body>
</html>