<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body style="background-color: #33FFF8 ;">
<div class="container mt-5">
<center>
<h1 style="color: blue;">${Header }</h1>
<p style="color: red;">${desc }</p>
</center>
<hr>
<h1>
     User Registration success............!!!!!!!!
     </h1>
<h1>YOUR EMAIL IS:${user.email }</h1>
<h1>YOUR NAME IS:${user.userName }</h1>
<h1>YOUR PASSWORD IS :${user.password }</h1>
</div>
</body>
</html>