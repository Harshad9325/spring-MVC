<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>help page</title>
</head>
<body>
	<!-- 	<h1>Thise is help page</h1>
	<h1>called by help controller</h1>
	<h1>url /help</h1> -->

	<%
	// 	String name = (String) request.getAttribute("name");
	// 	Integer mobileNo = (Integer) request.getAttribute("mo.no");
	// 	String add = (String) request.getAttribute("add");
	// 	LocalTime time = (LocalTime) request.getAttribute("time");
	// 	LocalDate date = (LocalDate) request.getAttribute("date");
	%>
	<h1>
		my name: ${name }
		<%-- <%=name%> --%>
	</h1>
	<hr>
	<h1>
		my mobileNo: ${mo.no }
		<%-- <%=mobileNo%> --%>
	</h1>
	<hr>
	<h1>
		my address: ${add }
		<%-- <%=add%> --%>
	</h1>
	<hr>
	<h1>
		time is: ${time }
		<%-- <%=time%> --%>
	</h1>
	<hr>
	<h1>
		current Date is: ${date }
		<%-- <%=date%> --%>
	</h1>


	<hr>
	<%-- <h2>marks is: ${marks }</h2> --%>
<!-- use jstl to print -->
	<c:forEach var="item" items="${marks }">
<%-- 		<h1>${item }</h1> --%>
<h1><c:out value="${item }"></c:out></h1>
	</c:forEach>

</body>
</html>