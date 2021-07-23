package com.circleash.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// http://localhost:8080/servlet/ex03?user_id=hagulu&name=kim?age=30
@WebServlet("/servlet/ex03")
public class ServletEx03 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("user_id");
		String name = request.getParameter("name");
		Integer age = Integer.parseInt(request.getParameter("age"));

		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>get 파라미터 확인</title></head>");
		out.println("<body> <h3> " + id + " : " + name + " : " + age + " </h3></body></html>");
	}

}