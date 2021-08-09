package com.circleash.db;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.circleash.common.MysqlService;

@WebServlet("/db/ex02_insert")
public class DatabaseEx02Insert extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
			response.setContentType("text/html");
			
			PrintWriter out = response.getWriter();
			
			//이름, 생년월일, 자기소개, 이메일
			String name = request.getParameter("name");
			String birth = request.getParameter("yyyymmdd");
			String introduce = request.getParameter("introduce");
			String email = request.getParameter("email");
			
			MysqlService mysqlService = MysqlService.getInstance();
			MysqlService.connect();
			
			String insertQuery = "INSERT INTO \r\n" 
					+ "`new_user` (`name`, `yyyymmdd`, `email`, `introduce`)\r\n"
					+ "VALUE ('" + name + "', '" + birth + "', '" + email + "', '" + introduce + "'); ";
			int count = MysqlService.update(insertQuery);
			
			out.println("입력성공");
	}
}
