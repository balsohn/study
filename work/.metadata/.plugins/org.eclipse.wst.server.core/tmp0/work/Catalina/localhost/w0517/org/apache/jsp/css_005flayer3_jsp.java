/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.1
 * Generated at: 2024-05-17 07:48:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class css_005flayer3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("\t#aa{\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\twidth:50px;\r\n");
      out.write("\theight:50px;\r\n");
      out.write("\tbackground:grey;\r\n");
      out.write("\tborder:1px solid black;\r\n");
      out.write("\tleft:80px;\r\n");
      out.write("\ttop:50px;\r\n");
      out.write("\tvisibility:visible;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t</style>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t//스크립트로 요소를 변화시킬때는 변화시키는 명령을 function()안에 정의한다.\r\n");
      out.write("\t\t//웹페이지내에서 이벤트를 통해 function()을 실행시킨다.\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction hide()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t//명령(기능)\r\n");
      out.write("\t\t\tdocument.getElementById(\"aa\").style.visibility=\"hidden\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction view()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.getElementById(\"aa\").style.visibility=\"visible\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction chg()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdocument.getElementById(\"aa\").style.background=\"white\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body> <!-- css_layer3.jsp -->\r\n");
      out.write("\t<!-- \r\n");
      out.write("\tvisibility의 속성을 변화시킴으로 웹에서 보이기, 숨기기 기능을 할 수 있다.\r\n");
      out.write(" \t-->\r\n");
      out.write(" \t<div id=\"aa\"> \r\n");
      out.write(" \t<input type=\"button\" value=\"닫기\" onclick=\"hide()\">\r\n");
      out.write(" \t<input type=\"button\" value=\"클릭\" onclick=\"chg()\">\r\n");
      out.write(" \t</div>\r\n");
      out.write(" \t<input type=\"button\" value=\"보이기\" onclick=\"view()\">\r\n");
      out.write(" \r\n");
      out.write(" \t\r\n");
      out.write(" \t학교종이 땡땡땡 어서모이자 오늘은 금요일 하하하!!! 저녁에는 삼결살에 소주한잔!! <p>\r\n");
      out.write(" \t학교종이 땡땡땡 어서모이자 오늘은 금요일 하하하!!! 저녁에는 삼결살에 소주한잔!! <p>\r\n");
      out.write(" \t학교종이 땡땡땡 어서모이자 오늘은 금요일 하하하!!! 저녁에는 삼결살에 소주한잔!! <p>\r\n");
      out.write(" \t학교종이 땡땡땡 어서모이자 오늘은 금요일 하하하!!! 저녁에는 삼결살에 소주한잔!! <p>\r\n");
      out.write(" \t학교종이 땡땡땡 어서모이자 오늘은 금요일 하하하!!! 저녁에는 삼결살에 소주한잔!! <p>\r\n");
      out.write(" \t학교종이 땡땡땡 어서모이자 오늘은 금요일 하하하!!! 저녁에는 삼결살에 소주한잔!! <p>\r\n");
      out.write(" \t학교종이 땡땡땡 어서모이자 오늘은 금요일 하하하!!! 저녁에는 삼결살에 소주한잔!! <p>\r\n");
      out.write(" \t학교종이 땡땡땡 어서모이자 오늘은 금요일 하하하!!! 저녁에는 삼결살에 소주한잔!! <p>\r\n");
      out.write(" \t학교종이 땡땡땡 어서모이자 오늘은 금요일 하하하!!! 저녁에는 삼결살에 소주한잔!! <p>\r\n");
      out.write(" \t학교종이 땡땡땡 어서모이자 오늘은 금요일 하하하!!! 저녁에는 삼결살에 소주한잔!! <p>\r\n");
      out.write(" \t학교종이 땡땡땡 어서모이자 오늘은 금요일 하하하!!! 저녁에는 삼결살에 소주한잔!! <p>\r\n");
      out.write(" \t학교종이 땡땡땡 어서모이자 오늘은 금요일 하하하!!! 저녁에는 삼결살에 소주한잔!! <p>\r\n");
      out.write(" \t학교종이 땡땡땡 어서모이자 오늘은 금요일 하하하!!! 저녁에는 삼결살에 소주한잔!! <p>\r\n");
      out.write(" \t학교종이 땡땡땡 어서모이자 오늘은 금요일 하하하!!! 저녁에는 삼결살에 소주한잔!! <p>\r\n");
      out.write(" \t학교종이 땡땡땡 어서모이자 오늘은 금요일 하하하!!! 저녁에는 삼결살에 소주한잔!! <p>\r\n");
      out.write(" \t학교종이 땡땡땡 어서모이자 오늘은 금요일 하하하!!! 저녁에는 삼결살에 소주한잔!! <p>\r\n");
      out.write(" \t학교종이 땡땡땡 어서모이자 오늘은 금요일 하하하!!! 저녁에는 삼결살에 소주한잔!! <p>\r\n");
      out.write(" \t학교종이 땡땡땡 어서모이자 오늘은 금요일 하하하!!! 저녁에는 삼결살에 소주한잔!! <p>\r\n");
      out.write(" \t학교종이 땡땡땡 어서모이자 오늘은 금요일 하하하!!! 저녁에는 삼결살에 소주한잔!! <p>\r\n");
      out.write(" \t학교종이 땡땡땡 어서모이자 오늘은 금요일 하하하!!! 저녁에는 삼결살에 소주한잔!! <p>\r\n");
      out.write(" \t학교종이 땡땡땡 어서모이자 오늘은 금요일 하하하!!! 저녁에는 삼결살에 소주한잔!! <p>\r\n");
      out.write(" \t학교종이 땡땡땡 어서모이자 오늘은 금요일 하하하!!! 저녁에는 삼결살에 소주한잔!! <p>\r\n");
      out.write(" \t학교종이 땡땡땡 어서모이자 오늘은 금요일 하하하!!! 저녁에는 삼결살에 소주한잔!! <p>\r\n");
      out.write(" \t학교종이 땡땡땡 어서모이자 오늘은 금요일 하하하!!! 저녁에는 삼결살에 소주한잔!! <p>\r\n");
      out.write(" \t학교종이 땡땡땡 어서모이자 오늘은 금요일 하하하!!! 저녁에는 삼결살에 소주한잔!! <p>\r\n");
      out.write(" \t학교종이 땡땡땡 어서모이자 오늘은 금요일 하하하!!! 저녁에는 삼결살에 소주한잔!! <p>\r\n");
      out.write(" \t학교종이 땡땡땡 어서모이자 오늘은 금요일 하하하!!! 저녁에는 삼결살에 소주한잔!! <p>\r\n");
      out.write(" \t학교종이 땡땡땡 어서모이자 오늘은 금요일 하하하!!! 저녁에는 삼결살에 소주한잔!! <p>\r\n");
      out.write(" \t\r\n");
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