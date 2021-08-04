<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test01</title>
</head>
<body>
	<% int[] scores = {80, 90, 100, 95, 80}; 
		int sum = 0;
		double avg = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		avg = (double) sum / scores.length;
	%>
	<strong>평균 : <%=avg%></strong> <br>

	<%
	List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
	int count = 0;
//	for(String check:scoreList) {
//		if(check.equals("0")) {
//			count +=10;
//		}
//	}
	for(int i = 0; i < scoreList.size(); i++) {
		if(scoreList.get(i) == "O") {
			count = count + 10;			
		}
	}
	%>
	<strong>채점결과는 : <%=count %>점 입니다.</strong> <br>
	
	<%!
	public int getSum(int number) {
		int sum = 0;
		for(int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}
	%>
	<strong>1에서 50까지의 합은 <%=getSum(50) %> 입니다. </strong> <br>
	
	<%
	String birthDay = "20010820"; 
	String year = birthDay.substring(0, 4);
	int newYear = Integer.parseInt(year);
	int age = (2021 - newYear) + 1;
	
	%>
	<strong><%=birthDay%>의 나이는 <%=age %>살 입니다.</strong>

</body>
</html>