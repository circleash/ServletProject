package com.circleash.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletTest01 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//한글 깨짐 방지
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain");
		
		Date now = new Date();
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		PrintWriter out = response.getWriter();
		out.println("오늘의 날짜는 " + formatter.format(now));
		
		
		
	}

}
