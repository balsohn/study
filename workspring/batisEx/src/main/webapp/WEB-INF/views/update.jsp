<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="updateOk">
	<table>
		<tr>
			<td>제목</td>
			<td><input type="text" name="title" value="${mdto.title}"></td>
		</tr>
	</table>
	</form>
</body>
</html>