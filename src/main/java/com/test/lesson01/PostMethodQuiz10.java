package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz10")
public class PostMethodQuiz10 extends HttpServlet {

	private final Map<String, String> userMap =  new HashMap<String, String>() {
	    {
	        put("id", "marobiana");
	        put("password", "qwerty1234");
	        put("name", "신보람");
	    }
	};
	
	@Override
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		
		// 응답 헤더
		response.setContentType("text/html");
		
		// request param 
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		// 검사 및 출력
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>결과</title></head><body>");
		if (userMap.get("id").equals(id) == false) {
			out.print("아이디가 일치하지 않습니다.");
		} else if (userMap.get("password").equals(password) == false) {
			out.print("비밀번호가 일치하지 않습니다.");
		} else {
			out.print(userMap.get("name") + "님 환영합니다!!");
		}
		out.print("</body></html>");
	}
}




