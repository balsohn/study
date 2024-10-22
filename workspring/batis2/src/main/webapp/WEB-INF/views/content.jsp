<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>         
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
   <style>
   table {
     border-spacing:0px;
   }
   table td {
     border-bottom:1px solid black;
     padding:5px;
     height:30px;
   }
   table tr:first-child td {
     border-top:2px solid black;
   }
   table tr:last-child td {
     border-bottom:2px solid black;
   }
   #btn1 , #btn2 , #btn3 {
     display:inline-block;
     width:100px;
     height:30px;
     line-height:30px;
     background:white;
     border:1px solid green;
     text-decoration:none;
     color:black;
   }
   #btn2 {
     background:black;
     color:white;
   }
 </style>
 
</head>
<body>
 <table width="700" align="center">
     <caption> <h3> 게시판 내용 </h3></caption>
     <tr>
       <td> 제 목 </td>
       <td colspan="3"> ${bdto.title} </td>
     </tr>
     <tr>
       <td width="100"> 작성자 </td>
       <td width="250"> ${bdto.name} </td>
       <td width="100"> 조회수 </td>
       <td width="250"> ${bdto.readnum} </td>
     </tr>
     <tr>
       <td> 작성일 </td>
       <td colspan="3"> ${bdto.writeday} </td>
     </tr>
     <tr height="200">
       <td> 내 용 </td>
       <td colspan="3"> ${bdto.content} </td>
     </tr>
     <tr>
       <td colspan="4" align="center">
        <a href="list?page=${page}&pageSize=${pageSize}" id="btn1"> 목록 </a>
        <a href="update?id=${bdto.id}&page=${page}&pageSize=${pageSize}" id="btn2"> 수정 </a>
        <a href="javascript:viewform()" id="btn3"> 삭제 </a>
       </td>
     </tr>
    
     <tr id="delform">
       <td colspan="4" align="center">
         <form method="post" action="delete">
           <input type="hidden" name="id" value="${bdto.id}">
           <input type="hidden" name="page" value="${page}">
           <input type="hidden" name="pageSize" value="${pageSize}">
           비밀번호 <input type="password" name="pwd">
           <input type="submit" value="삭제">
         </form>
       </td>
     </tr>
   </table>

  <script>
    function viewform() // 숨어있는 id="delform"요소를 보이게 하기
    {
    	document.getElementById("delform").style.display="table-row";
    }
  </script>
  <style>
   #delform {
      display:none;
   }
  </style>
</body>
</html>