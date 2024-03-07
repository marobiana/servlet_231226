<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp</title>
</head>
<body>
	<!-- html의 주석: 소스보기에서 보임 -->
	<%-- jsp의 주석: 소스보기에서 보이지 않음 --%>
	
	<%
		// java 문법 시작
		// scriptlet
		
		int sum = 0; 
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
	%>
	
	<b>합계:</b>
	<input type="text" value="<%= sum %>">
	
	<%!
		// 선언문 - 클래스 같은 느낌
		
		// field
		private int num = 100;
		
		// method
		public String getHelloWorld() {
			return "Hello world";
		}
	%>
	
	<br>
	<%= num + 200 %>
	<br>
	<%= getHelloWorld() %>
	
	<%
		List<String> strList = new ArrayList<>();
	%>
</body>
</html>


