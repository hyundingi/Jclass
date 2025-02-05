package com.java.www.service;

import java.util.ArrayList;

import com.java.www.dao.MemberDao;
import com.java.www.dto.MemberDto;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MServiceMember implements Mservice {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// MemberDao 접근
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		MemberDao MD = new MemberDao();
		list = MD.MemberList();
		
		request.setAttribute("list",list);
		

	}

	

}
