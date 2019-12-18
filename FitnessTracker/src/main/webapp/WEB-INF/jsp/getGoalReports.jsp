<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Goals Report</title>
</head>
<body>
	
	<table>
		<tr>
			<th>Minutes</th><th>Exercise Minutes</th><th>Activity</th>
		</tr>
		<c:forEach items="${goalReports}" var="goalReport">
			<tr>
				<td>${goalReport.goalMinutes}</td><td>${goalReport.exerciseMinutes}</td><td>${goalReport.exerciseActivity}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>