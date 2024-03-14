package com.test.lesson04;

import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/quiz01")
public class Lesson04Quiz01 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) {
		
		// 응답
		response.setContentType("text/plain");
		
		// 디비 연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect(); // db 연결
		
		// 인서트(db)
		String insertQuery = "insert into `real_estate`"
				+ "(`realtorId`, `address`,`area`,`type`,`price`,`rentPrice`)"
				+ "values"
				+ "(3, '헤라펠리스 101동 5305호', 350, '매매', 1500000, null)";
		try {
			ms.update(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// 셀렉트(db) => 출력
		
		// 디비 연결 해제
		ms.disconnect();
	}
}



