package com.circleash.db;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.circleash.common.MysqlService;

@WebServlet("/db/test02_insert")
public class DatabaseTest02Insert extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
			response.setContentType("text/html");
			
			PrintWriter out = response.getWriter();
			
			String name = request.getParameter("name");
			String url = request.getParameter("url");
			
			MysqlService mysqlService = MysqlService.getInstance();
			mysqlService.connect();
			
			String insertQuery = "INSERT INTO \r\n"
					+ "`webpage` (`name`, `url`)\r\n"
					+ "VALUE ('" + name + "', '" + url + "');";
			int count = mysqlService.update(insertQuery);
			
			//out.println("입력성공 " + count);
			//insert한 이후에 페이지를 넘어가야하기 때문에 여기서 해결해야함.
			response.sendRedirect("/db/test02.jsp");
	}

}
