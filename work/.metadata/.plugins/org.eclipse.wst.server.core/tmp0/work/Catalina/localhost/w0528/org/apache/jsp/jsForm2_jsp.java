/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.1
 * Generated at: 2024-05-29 05:28:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jsForm2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction check()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t//서버로 전송되기전 유효성 검사를 한다\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//유효성 검사를 할 때 form태그에 onsubmit=\"return 메소드명()\" \r\n");
      out.write("\t\t\t//return을 붙이면 함수의 return이 false이면 전송x, return이 true이면 전송 \r\n");
      out.write("\t\t\t//return false; //submit 전송 취소 \r\n");
      out.write("\t\t\t// return true; //submit 실행. 문제 없으면 서버로 전송 \r\n");
      out.write("\t\t\t//alert();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\tvar userId=document.myform.userId.value.trim(); //앞뒤 공백 지움(문자열만 전송하기위해)\r\n");
      out.write("\t\t\t//1.아이디값이 존재해야 한다. => 비어있으면 안된다=> 비어있으면 return false\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(userId.length == 0)//(userId==\"\") //아이디값의 존재여부 / \"\" <비어있다면. 전송하지 않는다. \r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\t//alert(\"아이디를 입력하세요\");\r\n");
      out.write("\t\t\t\t//요즘은 레이어도 있다.\r\n");
      out.write("\t\t\t\t//관련 입력폼 근처에 출력 \r\n");
      out.write("\t\t\t\tdocument.getElementById(\"aa\").innerText=\"아이디가 비어있습니다.\"\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"aa\").style.color=\"red\";\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"aa\").style.fontSize=\"12px\";\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\treturn false;//유효성 검사했을때 잘못입력된 경우 \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\treturn true;\t\r\n");
      out.write("\t\t\t}\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\t\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body><!-- jsForm2.jsp -->\t\t\t\t\t\t<!-- form태그에 onsubmit은 submit버튼이 클릭되었을때 -->\r\n");
      out.write("\t<form method=\"post\" action=\"test.jsp\" name=\"myform\" onsubmit=\"return check()\">\r\n");
      out.write(" \t\t아이디 : <input type=\"text\" name=\"userId\"> \r\n");
      out.write(" \t\t\t<div id=\"aa\"></div>\r\n");
      out.write(" \t\t<hr>\r\n");
      out.write(" \t\t비밀번호 : <input type=\"password\" name=\"password\"> <hr>\r\n");
      out.write(" \t\t소개 : <textarea name=\"sogae\" cols=\"30\" rows=\"4\"></textarea><hr>\r\n");
      out.write(" \t\t<input type=\"submit\" value=\"전송\">\r\n");
      out.write(" \t\t<!--  type=\"submit\"은 전송되면 form의 action=\"test.jsp로 보내진다. -->\r\n");
      out.write(" \t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}