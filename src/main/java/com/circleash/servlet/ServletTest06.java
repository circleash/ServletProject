package com.circleash.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz06")
public class ServletTest06 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		
		int number1 = Integer.parseInt(request.getParameter("number1"));
		int number2 = Integer.parseInt(request.getParameter("number2"));
		
		PrintWriter out = response.getWriter();
		
		//JSON 형태 =이거는 파라미터 형태임
		//?number1=120&number2=25
		// {"addition : " + (number1 + number2), "subtraction : " + (number1 - number2), 
		// "multiplication : " + (number1 * number2), "division : " + (number1 // number2)}
		
		out.println("{\"addition\":\""  + (number1 + number2) + "\", \"substraction\":\"" + (number1 - number2) + "\", \"multiplication\" :\"" + (number1 * number2) + "\", \"division\" :\"" + (number1 / number2) + "\" }");
	}
}
