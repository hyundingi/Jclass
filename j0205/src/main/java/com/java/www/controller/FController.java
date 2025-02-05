package com.java.www.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.java.www.service.BService;
import com.java.www.service.BServiceBList;
import com.java.www.service.MServiceMember;
import com.java.www.service.Mservice;


@WebServlet({ "*.do" })
public class FController extends HttpServlet {
    
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction 호출");
		
		//한글처리
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		String cPath = request.getContextPath();
		String page = uri.substring(cPath.length());
		String url = "";
		BService bservice = null;
		Mservice mservice = null;
		
		if(page.equals("/") || page.equals("/index.do")) {
			System.out.println("메인페이지 연결");
			url = "index.jsp";
		}else if (page.equals("/login.do")){
			System.out.println("로그인 페이지 연결");
			url = "login.jsp";
		}else if (page.equals("/memebrInput.do")){
			System.out.println("사용자 정보 페이지 연결");
			url = "memebrInput.jsp";
		}else if (page.equals("/logout.do")) {
			System.out.println("로그아웃 페이지 연결");
			url = "logout.jsp";
		}else if (page.equals("/bList.do")) {
			System.out.println("게시판 페이지 연결");
			
			// 전체게시글 가져오기
			bservice = new BServiceBList();
			bservice.execute(request, response); // request - list데이터 담겨서 옴
			url = "bList.jsp";
		}else if (page.equals("/member.do")) {
			System.out.println("사용자 전체 정보 페이지 연결");
			// 전체게시글 가져오기
			mservice = new MServiceMember();
			mservice.execute(request, response); // request - list데이터 담겨서 옴
			url = "member.jsp";
		}
		
//		switch(page) {
//		case "/": case "/index":
//			System.out.println("메인페이지 연결");
//			url = "index.jsp";
//			break;
//		case "/login.do":
//			System.out.println("로그인 페이지 연결");
//			url = "login.jsp";
//			return;
//		case "/member.do":
//			System.out.println("회원가입 페이지 연결");
//			url = "member.jsp";
//			return;
//		case "/logout.do":
//			System.out.println("로그아웃 페이지 연결");
//			url = "logout.jsp";
//			return;
//		}//switch끝
		System.out.println(url);
		// response.sendRedirect(url);
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	} // doAction 끝
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 호출");
		doAction(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 호출");
		doAction(request,response);
		
	}

}
