<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제어문 사용</title>
</head>
<body>
<%
	// map을 테이블로 표현하기
	// 성적 정보 저장
	// {"korean"=85, "english"=72, "math"=90, "science"=100}

	Map<String, Integer> scoreMap = new HashMap<>();
	scoreMap.put("korean", 85);
	scoreMap.put("english", 72);
	scoreMap.put("math", 90);
	scoreMap.put("science", 100);
	
	Set<String> keys = scoreMap.keySet();
%>
	<table border="1">
		<%
			for(String key:keys) {
				
		%>
		<tr>
			<th><%=key %></th>
			<td><%=scoreMap.get(key) %></td>
		</tr>
		<% }%>
		

</body>
</html>