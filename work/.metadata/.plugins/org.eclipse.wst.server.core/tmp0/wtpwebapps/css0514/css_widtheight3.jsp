<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

 b {
/*inline에서 block으로*/
	display:block;
	/*width:100px;
	height:100px;*/
	background:yellow;
}



 u {
/*inline에서 block으로*/
	display:inline-block;
	width:100px;
	height:50px;
	background:red;
}

div {
	display:inline;
}


</style>




</head>
<body>
<!-- width height는 block태그만 가능하다.
단 inline태그도 가능하게 할 수 있다.
1.inline tag => block tag변형
2.inline tag => 가로 세로 속성을 사용할 수 있는 속성을 부여 -->


<div>인라인</div>
<span>오늘</span>
<b>내일</b>
<u>모레</u>
<i>졸려</i>

</body>
</html>