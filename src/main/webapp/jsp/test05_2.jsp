<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- bootstrap CDN link -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
	<%
		int num = Integer.parseInt(request.getParameter("length"));
		String[] measureArray = request.getParameterValues("measure");
	%>
	
	<h2>변환결과</h2>
	<h3><%= num %>cm</h3>
	<hr>
	
	<% 
//		for(int i = 0; i < measureArray.length; i++) {
//			String measures = measureArray[i];
			
//			if(measures.equals("inch")) {
//				double inch = num * 0.39;
//				out.println(inch + "in<br>");
//			} else if(measures.equals("yard")) {
//				double yard = num / 91.44;
//				out.println(yard + "yd<br>");
//			} else if(measures.equals("feet")) {
//				double feet = num / 30.48;
//				out.println(feet + "ft<br>");
//			} else if(measures.equals("meter")) {
//				double meter = num / 100;
//				out.println(meter + "m<br>");
///			}
//		}
//	%>
	<%
	for(int i = 0; i < measureArray.length; i++) {
		String measures = measureArray[i];
		
		if(measures.equals("inch")) {
			double inch = num * 0.39;
	%>
	<h3><%= inch %>in <br></h3>
	<%
		} else if(measures.equals("yard")) {
			double yard = num / 91.44;
	%>
	<h3><%= yard %>yd <br></h3>
	
	<%
		} else if(measures.equals("feet")) {
			double feet = num / 30.48;
	%>
	<h3><%= feet %>ft <br></h3>
	<%
		} else if(measures.equals("meter")) {
			double meter = num / 100;
	%>
	<h3><%= meter %>m <br></h3>
	<% 
		}
	}
	
	%>
	


</body>
</html>