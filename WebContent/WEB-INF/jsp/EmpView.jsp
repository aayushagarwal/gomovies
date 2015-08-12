<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Employee Details</h1>
	<hr />
	
	<table cellpadding="10" bgcolor="#e3e3e3">
		<tr>
			<td>Movie ID</td>
			<td>Movie Name</td>
		</tr>
		
		<c:forEach items="${elist }" var="mov">
		<tr>
			<td>${mov.movieId }</td>
			<td>${mov.movieTitle }</td>
		</tr>
		</c:forEach>
	</table>
	
</body>
</html>
