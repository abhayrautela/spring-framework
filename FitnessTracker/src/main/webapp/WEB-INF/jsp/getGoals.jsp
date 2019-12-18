<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>ID</th><th>Minutes</th>
		</tr>
		<tr>
			<c:forEach items="${goals}" var="goal">
				<tr>
					<td>${goal.id}</td><td>${goal.minutes}</td>
					<td>
						<table>
							<tr>
								<th>Exercise Id</th><th>Exercise Minutes</th><th>Exercise Activity</th>
							</tr>
							<c:forEach items="${goal.exercises}" var="exercise">
								<tr>
									<td>${exercise.id}</td><td>${exercise.minutes}</td><td>${exercise.activity}</td>
								</tr>
							</c:forEach>
						</table>
					</td>
				</tr>
			</c:forEach>
		</tr>
	</table>
</body>
</html>