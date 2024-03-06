package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz06")
public class GetMethodQuiz06 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		
		// 응답
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json");
		
		// Request Params
		int number1 = Integer.valueOf(request.getParameter("number1"));
		int number2 = Integer.valueOf(request.getParameter("number2"));
		
		// JSON 출력
		PrintWriter out = response.getWriter();
		// {"addition":1570, "subtraction":1430, "multiplication":105000
		// , "division":21}
		out.print("{\"addition\":" + (number1 + number2));
		out.print(", \"subtraction\":" + (number1 - number2));
		out.print(", \"multiplication\":" + (number1 * number2));
		out.print(",\"division\":" + (number1 / number2) + "}");
	}
}




