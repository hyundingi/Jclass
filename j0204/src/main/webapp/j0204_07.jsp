<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- 전역변수 --%>
<%!
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
%>

<% 
	// 페이지 노출 문제가 있음!
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String uid = "ora_user";
	String upw = "1111";
	String sql = "select * from employees";
	
	try{
		Class.forName(driver);
		conn = DriverManager.getConnection(url, uid, upw);
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		out.println("db접속"+"</br>");
		
		while(rs.next()){
			int employee_id = rs.getInt("employee_id");
			String employee_name = rs.getString("emp_name");
			out.println("사번/이름 : "+employee_id+", "+employee_name+"</br>");
		}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
		}catch(Exception e2){
			e2.printStackTrace();
		}
	}
	--%>

</body>
</html>