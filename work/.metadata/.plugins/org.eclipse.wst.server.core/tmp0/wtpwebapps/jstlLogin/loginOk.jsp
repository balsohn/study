<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="login.Login" %>    
<%
    // loginOk.jsp
    // 회원인증 => 아이디,비번
    Login login=new Login();
    login.loginOk(request,session,response);
    
%>