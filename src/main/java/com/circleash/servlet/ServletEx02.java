package com.circleash.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:8080/servlet/ex02?user_id=hagulu&name=kim
@WebServlet("/servlet/ex02")
public class ServletEx02 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("user_id");
		String name = request.getParameter("name");
		

		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>get 파라미터 확인</title></head>");
		out.println("<body> <h3> " + id + " : " + name + " </h3></body></html>");
	}

}