package com.circleash.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// /servlet/test07?user_id=hagulu&name=김인규&birth=1990712&email=lecture@hagulu.com
@WebServlet("/servlet/test07")
public class ServletTest07 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		
		String address = request.getParameter("address");
		String paymentCard = request.getParameter("paymentCard");
		String price = request.getParameter("price");
		
		out.println("<html><head><title>주문</title></head>");
		out.println("<body>");
		if(!address.contains("서울시")) {
			out.println("<h2>배달 불가지역입니다. </h2>");	
		} else if(paymentCard.equals("신한카드")) {
			out.println("<h2>결제 불가능한 카드입니다.</h2>");
		} else {
			out.println("<h3>" + address + "로 배달 준비중.</h3>");
			out.println("결제금액 : " + price + "원");
		}
				
		out.println("</body></html>");
		

	}
}
