/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.1
 * Generated at: 2024-07-10 03:53:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import login.Login;

public final class memberView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/work/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/jstlLogin/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1720572198265L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("login.Login");
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
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write(" <style>\r\n");
      out.write("   #memberView {\r\n");
      out.write("     width:600px;\r\n");
      out.write("     height:400px;\r\n");
      out.write("     margin:auto;\r\n");
      out.write("     margin-top:200px;\r\n");
      out.write("   }\r\n");
      out.write("   table td {\r\n");
      out.write("     height:40px;\r\n");
      out.write("     border:1px solid black;\r\n");
      out.write("     text-align:center;\r\n");
      out.write("   }\r\n");
      out.write(" </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body> <!-- memberView.jsp -->\r\n");
      out.write("\r\n");

    Login login=new Login();
    login.memberView(session,request,response);
    
    Login.getName(request,session);

      out.write("\r\n");
      out.write("  <!-- 출력부분  -->\r\n");
      out.write("  <div id=\"memberView\">\r\n");
      out.write("    <table width=\"400\" align=\"center\">\r\n");
      out.write("      <caption> <h3> 회원님의 정보 <span style=\"font-size:11px\" onclick=\"pwdChg()\">비밀번호변경</span> </h3></caption>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"100\"> 아이디 </td>\r\n");
      out.write("        <td> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td> 이 름 </td>\r\n");
      out.write("        <td> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr> <!-- 클릭을 해서 수정폼이 나오게 -->\r\n");
      out.write("        <td> 이메일 </td>\r\n");
      out.write("        <td>\r\n");
      out.write("          <!-- 처음에 정보를 보여주는 부분 -->\r\n");
      out.write("          <div id=\"before\">\r\n");
      out.write("           ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mdto.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" \r\n");
      out.write("           <input type=\"button\" onclick=\"editView()\" value=\"수정\">\r\n");
      out.write("          </div>\r\n");
      out.write("           \r\n");
      out.write("          <!-- 수정을 클릭하면 수정할 수 있는 폼의 형태 --> \r\n");
      out.write("          <div id=\"after\" style=\"display:none;\">\r\n");
      out.write("           <form method=\"post\" action=\"emailOk.jsp\">\r\n");
      out.write("            <input type=\"text\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mdto.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" \">\r\n");
      out.write("            <input type=\"submit\" value=\"수정\">\r\n");
      out.write("           </form>\r\n");
      out.write("          </div> \r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr> <!-- 처음부터 수정폼으로 작업 -->\r\n");
      out.write("        <td> 전화번호 </td>\r\n");
      out.write("        <td>\r\n");
      out.write("         <form method=\"post\" action=\"phoneOk.jsp\">\r\n");
      out.write("          <input type=\"text\" name=\"phone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mdto.phone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("          <input type=\"submit\" value=\"수정\">\r\n");
      out.write("         </form>\r\n");
      out.write("         </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    <div id=\"pwdChg\">\r\n");
      out.write("       <div> <h4> 비밀번호 변경하기 </h4></div>\r\n");
      out.write("       <form method=\"post\" action=\"pwdChgOk.jsp\">\r\n");
      out.write("         <input type=\"password\" name=\"oldPwd\" placeholder=\"기존 비밀번호\"><br>\r\n");
      out.write("         <input type=\"password\" name=\"pwd\" placeholder=\"새 비밀번호\"><br>\r\n");
      out.write("         <input type=\"password\" name=\"pwd2\" placeholder=\"새 비밀번호 확인\"><br>\r\n");
      out.write("         <input type=\"submit\" value=\"비밀번호 변경\">\r\n");
      out.write("       </form>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write(" <style>\r\n");
      out.write("   #pwdChg {\r\n");
      out.write("     width:396px;\r\n");
      out.write("     height:260px;\r\n");
      out.write("     margin:auto;\r\n");
      out.write("     text-align:center;\r\n");
      out.write("     border:1px solid black;\r\n");
      out.write("     margin-top:20px;\r\n");
      out.write("     margin-bottom:100px;\r\n");
      out.write("     display:none;\r\n");
      out.write("   }\r\n");
      out.write("   #pwdChg input[type=password] {\r\n");
      out.write("     width:200px;\r\n");
      out.write("     height:28px;\r\n");
      out.write("     margin-top:8px;\r\n");
      out.write("   }\r\n");
      out.write("   #pwdChg input[type=submit] {\r\n");
      out.write("     width:208px;\r\n");
      out.write("     height:32px;\r\n");
      out.write("     margin-top:8px;\r\n");
      out.write("   }\r\n");
      out.write(" </style>\r\n");
      out.write(" <script>\r\n");
      out.write("   function pwdChg()\r\n");
      out.write("   {\r\n");
      out.write("\t   document.getElementById(\"pwdChg\").style.display=\"block\";\r\n");
      out.write("   }\r\n");
      out.write("   function editView()\r\n");
      out.write("   {\r\n");
      out.write("\t   // 이메일을 수정하고자 한다 수정폼을 보이게 하기\r\n");
      out.write("\t   document.getElementById(\"after\").style.display=\"block\";\r\n");
      out.write("\t   // id=\"before\"는 숨겨야 된다.\r\n");
      out.write("\t   document.getElementById(\"before\").style.display=\"none\";\r\n");
      out.write("   }\r\n");
      out.write(" </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
