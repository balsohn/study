<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
		function srcview() {
			document.getElementById("src").innerText=document.getElementsByTagName("body")[0].innerHTML;
		}
		
		function addTag() {
			var new1=document.createElement("li");
		//	new1.appendChild(document.createTextNode("전가복"));
			new1.textContent="전가복";
		
		
			var aa=document.getElementById("aa");
			aa.insertBefore(new1, document.getElementsByTagName("li")[0]);
			
		}
		
		function delTag() {
			document.getElementById("aa").removeChild(document.getElementById("aa").childNodes[0]);
		}
		
		function lengthTag() {
			alert (document.getElementById("aa").childNodes.length);
		}
		
		function rep(){
			var old=document.getElementById("aa").childNodes[2];
			var new1=document.createTextNode("육개장");
			
			old.replaceChild(new1, old.childNodes[0]);
		}
	</script>
	
</head>
<body>
	<input type="button" value="소스보기" onclick="srcview()">
	<input type="button" value="요소추가" onclick="addTag()">
	<input type="button" value="요소삭제" onclick="delTag()">
	<input type="button" value="요소길이" onclick="lengthTag()">
	<input type="button" value="요소내용교체" onclick="rep()">
	<hr>
	<ul id="aa"><li>짜장명</li><li>짬 뽕 </li><li> 탕수육 </li><li> 팔보채 </li></ul>
	<hr>
	<div id="src"></div>
</body>
</html>