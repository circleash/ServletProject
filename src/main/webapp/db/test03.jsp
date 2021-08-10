<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.circleash.common.MysqlService" %>
<%@ page import="java.sql.ResultSet" %>
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
	MysqlService mysqlService = MysqlService.getInstance();
	mysqlService.connect();
	
	String query = "SELECT `seller.*`, `used_goods.*` FROM `seller` LEFT JOIN `used_goods` ON `seller.id` = `used_goods.sellerId`;";
	ResultSet result = mysqlService.select(query);
%>
<div class="container">

	<header class="heigth:100px text-center bg-info">
		<h2><span style="color:white">HONG당무마켓</span></h2>
	</header>
	<nav class="bg-info d-flex">
		<ul class="nav w-100 nav-fill ">
			<li class="nav-item"><a href="#" class="nav-link main-link"><span style="color:white">리스트</span></a></li>
			<li class="nav-item"><a href="#" class="nav-link main-link"><span style="color:white">물건 올리기</span></a></li>
			<li class="nav-item"><a href="#" class="nav-link main-link"><span style="color:white">마이 페이지</span></a></li>
		</ul>
	</nav>
	<section class="d-flex flex-wrap justify-content-around">
	<div class="width:300px mt-3">
			<% 
				while(result.next()) {
			%>
			<div><img src="<%=result.getString("picture") %>"></div>
			<div><%=result.getString("title") %></div>
			<div><%=result.getString("price") %></div>
			<div><%=result.getString("nickname") %></div>
	
	</div>
			<%
				}
			%>
	</section>
	
	<footer>
	
	
	</footer>





</div>

</body>
</html>