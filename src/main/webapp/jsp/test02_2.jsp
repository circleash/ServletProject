<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과페이지</title>
</head>
<body>
<%
	// what=date or what=time
	String what = request.getParameter("what");

	//오늘 날짜를 기준으로 날짜 표현과 시간 표현
	Date now = new Date();
	String string = null;
	if(what.equals("date")) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일");
		string = formatter.format(now);
	} else {
		SimpleDateFormat formatterTime = new SimpleDateFormat("HH시 mm분 ss초");
		string = formatterTime.format(now);
	}
%>
	<div>
	 <%=string %>

	</div>

</body>
</html>