<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- logo --%>
<div class="col-2">
	<h3>
		<a href="/lesson03/quiz02/list_template.jsp" class="text-success">Melong</a>
	</h3>
</div>

<%-- 검색 --%>
<div class="col-10">
	<form method="get" action="/lesson03/quiz02/info_template.jsp">
		<div class="input-group">
			<input type="text" class="form-control col-6" name="search">
			<div class="input-group-append">
				<button class="btn btn-info" type="submit">검색</button>
			</div>
		</div>
	</form>
</div>