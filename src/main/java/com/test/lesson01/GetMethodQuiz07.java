package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz07")
public class GetMethodQuiz07 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		
		// 응답 헤더
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		// 리퀘스트 파라미터 꺼내기
		String address = request.getParameter("address");
		String card = request.getParameter("card");
		int price = Integer.valueOf(request.getParameter("price"));
		
		// 세가지 조건에 따라 출력문
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>주문 결과</title></head><body>");
		if (address.startsWith("서울시") == false) {
			out.print("배달 불가 지역입니다.");
		} else if (card.contains("신한")) {
			out.print("결제 불가 카드입니다.");
		} else {
			out.print(address + " <b>배달 준비중</b><br>");
			out.print("결제금액:" + price + "원");
		}
		out.print("</body></html>");
	}
}
