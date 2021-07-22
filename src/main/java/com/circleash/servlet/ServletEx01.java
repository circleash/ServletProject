package com.circleash.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletEx01 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//한글 깨짐 방지
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain");
		
		// Date 클래스
		Date now = new Date();
		
		// response의 body 값 주입
		PrintWriter out = response.getWriter();
		out.println(now);
		
		// 2021-07-20 14:10:10
		// formatting 포맷팅
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm-ss");
		out.println(formatter.format(now));
	}

}
