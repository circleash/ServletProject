<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
	<%
		// 1 ~ 10까지의 합 구하기
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
	
	%>
	<strong>합계 : <%=sum%></strong>
	<input type="text" value="<%=sum%>">
	
	<%
		List<String> animal = new ArrayList<>();
		animal.add("dog");
		animal.add("cat");
	%>
	<br>
	<b><%=animal.get(0) %></b>
	<br>
	<b><%=animal.get(1) %></b>
	<br>
	
	<%!
		//MEMBER 변수
		private int num = 10;
		
		//Method
		//Hello world 리턴하는 메소드
		public String getHelloWorld() {
			return "Hello World";
		}
	%>
	
	<%=getHelloWorld() %>
	<%=num %>
	
</body>
</html>