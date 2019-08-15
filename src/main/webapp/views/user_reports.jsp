<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${empty users}">
		<h1>No data available</h1>
	</c:if>
	<c:if test="${not empty users}">
		<h1>User Data</h1>

		<c:forEach items="${users}" var="user">
			<hr />
			<c:out value="${user.userName}" />
			<br />
			<c:out value="${user.email}" />
			<br />
			<c:out value="${user.mobile}" />
			<br />
		</c:forEach>
		Download &nbsp&nbsp&nbsp<a href="report?type=pdf">PDF</a> &nbsp&nbsp&nbsp <a href="report?type=excel">Excel</a>
	</c:if>

</body>

</html>