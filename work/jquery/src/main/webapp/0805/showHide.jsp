<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script>
	$(function() {
		$('#img').click(function(){
			$('#img').hide();
		})
		
		$('span').click(function() {
			$('img').show();
		})
	})
</script>
</head>
<body>
	<img src="1-1.jpg" width="140" id="img">
	<img src="1-1.jpg" width="140">
	<img src="1-1.jpg" width="140">
	<span style="font-size: 20px;">안녕하세요</span>
	<span style="font-size: 20px;">안녕하세요</span>
	<span style="font-size: 20px;">안녕하세요</span>
	<span style="font-size: 20px;">안녕하세요</span>
</body>
</html>