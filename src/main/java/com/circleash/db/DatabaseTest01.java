package com.circleash.db;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.circleash.common.MysqlService;

@WebServlet("/db/test01")
public class DatabaseTest01 extends HttpServlet {
	
		@Override
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
				response.setContentType("text/plain");		
				PrintWriter out = response.getWriter();
		
				MysqlService mysqlService = MysqlService.getInstance();
				mysqlService.connect();
				
				String query = "INSERT INTO `real_estate`\r\n"
								+ "(`realtorId`, `address`, `area`, `type`, `price`, `rentPrice`, `createdAt`, `updatedAt`)\r\n"
								+ "VALUE (3, '헤라펠리스 101동 5305호', 350, '매매', 1500000, NULL, now(), now());";
				
				int count = mysqlService.update(query);
				
				out.println("삽입 행 개수 : " + count);
				
				String selectQuery = "SELECT * FROM `real_estate` ORDER BY `id` DESC LIMIT 10;";
				
				ResultSet result = mysqlService.select(selectQuery);
				try {
						while(result.next()) {
								out.println("매물 주소 : " + result.getString("address"));
								out.println(" 면적 : " + result.getInt("area"));
								out.println(" 타입 : " + result.getString("type"));
						}
						
				} catch (SQLException e) {
						e.printStackTrace();
				}
		
		}
}
