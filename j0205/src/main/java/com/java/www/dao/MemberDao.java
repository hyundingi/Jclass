package com.java.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.java.www.dto.BoardDto;
import com.java.www.dto.MemberDto;

public class MemberDao {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	DataSource ds;
	ArrayList<MemberDto> list;
	String id,pw,name,tel,gender,hobby;
	
	
	// 전체글 가져오기 메소드
	public ArrayList<MemberDto> MemberList(){
		conn = getConnection();
		String sql = "select * from Member";
		list = new ArrayList<MemberDto>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				tel = rs.getString("tel");
				gender = rs.getString("gender");
				hobby = rs.getString("hobby");
				list.add(new MemberDto(id, pw, name, tel, gender, hobby));
			}
		} catch (Exception e) { e.printStackTrace();
		}finally {
			try {
				if (rs != null)	rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) { e2.printStackTrace(); }
		}
		return list;
	}
	
	// 커넥션 메소드
	public Connection getConnection() {
		Connection connection = null;

		try {
			// 커넥션 풀에 있는 Connection객체 가져오기
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			ds = (DataSource) envContext.lookup("ora21");
			connection = ds.getConnection();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	} // getConnection() 끝
}
