package com.test.lesson04;

import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/ex02_insert")
public class InsertEx02 extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) {
		
		// 응답 형태 생략
		
		// request params
		String name = request.getParameter("name");
		String yyyymmdd = request.getParameter("yyyymmdd");
		String email = request.getParameter("email");
		String introduce = request.getParameter("introduce");
		
		// DB 연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect();
		
		// DB Insert
		String insertQuery = "insert into `new_user`"
				+ "(`name`, `yyyymmdd`, `email`, `introduce`)"
				+ "values"
				+ "('" + name + "', '" + yyyymmdd + "', '" + email + "', '" + introduce + "')";
		try {
			ms.update(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// DB 연결 해제
		ms.disconnect();
		
		// 목록 화면으로 이동
	}
}



