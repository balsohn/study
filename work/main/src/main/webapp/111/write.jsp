<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="writeOk.jsp">
		<table>
			<caption><h2>게시물 작성</h2></caption>
			<tr>
				<td> 제목 </td>
				<td> <input type="text" name="title"> </td>
			</tr>
			<tr>
				<td> 작성자 </td>
				<td> <input type="text" name="name"></td>
			</tr>
			<tr>
				<td> 비밀번호 </td>
				<td> <input type="password" name="pwd"></td>
			</tr>
			<tr>
				<td> 내용 </td>
				<td> <textarea name="content"></textarea> </td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="글쓰기">
					<a href="list.jsp">목록가기</a>
				</td>
			</tr>
			
		</table>
	
	</form>
</body>
</html>