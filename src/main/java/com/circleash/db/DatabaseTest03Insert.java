package com.circleash.db;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.circleash.common.MysqlService;

public class DatabaseTest03Insert extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String picture = request.getParameter("picture");
		String title = request.getParameter("title");
		String price = request.getParameter("price");
		String nickname = request.getParameter("nickname");
		
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
	}
}
