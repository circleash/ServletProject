package com.circleash.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex05")
public class ServletEx05 extends HttpServlet {
		
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		response.setContentType("text/html");
		
		
		PrintWriter out = response.getWriter();
		
		String userId = request.getParameter("user_id");
		String name = request.getParameter("name");
		String birth = request.getParameter("birth");
		String email = request.getParameter("email");
		
		//테이블 형태로 출력
		out.println("<html><head><title>회원정보</title></head>");
		out.println("<body> <table border=1>");
		// 이름 : 김인규
		// 생년월일 : 19990412
		out.println("<tr><td>아이디</td> <td>" + userId + "</td></tr>");
		out.println("<tr><td>이름</td> <td>" + name + "</td></tr>");
		out.println("<tr><td>생년월일</td> <td>" + birth + "</td></tr>");
		out.println("<tr><td>이메일</td> <td>" + email + "</td></tr>");		
		
		out.println("</table></body></html>");
		

	}
}
