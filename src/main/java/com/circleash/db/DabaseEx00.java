package com.circleash.db;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/db/ex00")
public class DabaseEx00 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			String url = "jdbc:mysql://localhost:3306/circleash";
			String userId = "root";
			String password = "root";
			
			Connection connection = DriverManager.getConnection(url, userId, password);
			Statement statement = connection.createStatement();
			
			String selectQuery = "SELECT * FROM used_goods";
			
			ResultSet resultSet = statement.executeQuery(selectQuery);
			
			PrintWriter out = response.getWriter();
			
			while(resultSet.next()) {
				out.println(resultSet.getString("title"));
				out.println(resultSet.getInt("price"));
			}
			
			String insertQuery = "INSERT INTO `used_goods`\r\n"
					+ "(`title`, `price`, `description`, `sellerId`, `createdAt`, `updatedAt`)\r\n"
					+ "VALUE ('고양이간식 팝니다.', 2000, '저희 고양이가 입맛이 까다로워서 안먹네요', 5, now(), now());";
			// 실행한 결과 행의 수를 리턴 
			int count = statement.executeUpdate(insertQuery);
			
			out.println("삽입성공!! " + count );
			
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}