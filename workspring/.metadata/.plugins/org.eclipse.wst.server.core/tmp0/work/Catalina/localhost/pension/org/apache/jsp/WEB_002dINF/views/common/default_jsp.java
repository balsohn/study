/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.1
 * Generated at: 2024-10-08 01:05:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class default_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1721266515607L));
    _jspx_dependants.put("jar:file:/C:/workspring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/pension/WEB-INF/lib/sitemesh-2.4.2.jar!/META-INF/sitemesh-decorator.tld", Long.valueOf(1123645892000L));
    _jspx_dependants.put("jar:file:/C:/workspring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/pension/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/sitemesh-2.4.2.jar", Long.valueOf(1721791721814L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody;

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
    _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.release();
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
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("    /* CSS Reset */\r\n");
      out.write("    * {\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        padding: 0;\r\n");
      out.write("        box-sizing: border-box;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    @font-face {\r\n");
      out.write("        font-family: 'GmarketSansMedium';\r\n");
      out.write("        src: url('https://fastly.jsdelivr.net/gh/projectnoonnu/noonfonts_2001@1.1/GmarketSansMedium.woff') format('woff');\r\n");
      out.write("        font-weight: normal;\r\n");
      out.write("        font-style: normal;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    html, body {\r\n");
      out.write("    \t\r\n");
      out.write("    \tmin-height: 100%;\r\n");
      out.write("        font-family: 'GmarketSansMedium', Arial, sans-serif;\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        padding: 0;\r\n");
      out.write("        background: #FAFBFF;\r\n");
      out.write("        display: flex;\r\n");
      out.write("        flex-direction: column;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    body {\r\n");
      out.write("        display: flex;\r\n");
      out.write("        flex-direction: column;\r\n");
      out.write("        flex: 1;\r\n");
      out.write("\t\tuser-select: none; /* 텍스트 선택 방지 */\r\n");
      out.write("\t\t-webkit-user-drag: none; /* 이미지 드래그 방지 */\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    body > section {flex:1 !important;}\r\n");
      out.write("\r\n");
      out.write("    #outer {\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        height: 40px;\r\n");
      out.write("        background: black;\r\n");
      out.write("        color: white;\r\n");
      out.write("        display: flex;\r\n");
      out.write("        justify-content: center; \r\n");
      out.write("        flex-shrink: 0;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #outer .content {\r\n");
      out.write("        display: flex;\r\n");
      out.write("        align-items: center;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        max-width: 1000px;\r\n");
      out.write("        position: relative;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #outer .content .left {\r\n");
      out.write("        position: absolute;\r\n");
      out.write("        left: 0;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #outer .content .center {\r\n");
      out.write("        margin: auto;\r\n");
      out.write("        text-align: center; \r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #outer .content .right {\r\n");
      out.write("        position: absolute;\r\n");
      out.write("        right: 0;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    header, nav, main {\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        max-width: 1000px;\r\n");
      out.write("        margin: 0 auto;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    header {\r\n");
      out.write("        height: 108px;\r\n");
      out.write("        display: flex;\r\n");
      out.write("        justify-content: space-between;\r\n");
      out.write("        align-items: center;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    header .logo {\r\n");
      out.write("        margin: 45px;\r\n");
      out.write("        padding: 10px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    header .flex-container {\r\n");
      out.write("        display: flex;\r\n");
      out.write("        justify-content: flex-end;\r\n");
      out.write("        align-items: center;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    header .flex-container a {\r\n");
      out.write("        margin-right: 8px; /* 오른쪽 링크들 사이에 간격 추가 */\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("        color: inherit;\r\n");
      out.write("        \r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    header .flex-container .dropdown {\r\n");
      out.write("        position: relative;\r\n");
      out.write("        display: inline-block;\r\n");
      out.write("        height: 100%; /* 부모 요소의 높이를 상속받도록 설정 */\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    header .flex-container .dropdown a {\r\n");
      out.write("        display: inline-flex;\r\n");
      out.write("        align-items: center;\r\n");
      out.write("        height: 100%; /* 부모 요소의 높이를 상속받도록 설정 */\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    nav {\r\n");
      out.write("        margin-top: 10px;\r\n");
      out.write("        height: 50px;\r\n");
      out.write("        font-size:16px;\r\n");
      out.write("        position: relative;\r\n");
      out.write("    \tz-index: 999;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    nav ul {\r\n");
      out.write("        display: flex;\r\n");
      out.write("        list-style: none;\r\n");
      out.write("        padding-left: 0;\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        \r\n");
      out.write("    }\r\n");
      out.write("\tnav a{font-size: 16px;}\r\n");
      out.write("    nav ul li {\r\n");
      out.write("        flex: 1;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        font-weight: 900;\r\n");
      out.write("        position: relative;\r\n");
      out.write("        font-size:20px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    nav > ul > li:hover {\r\n");
      out.write("        color: black;\r\n");
      out.write("        transform: scale(1.1);\r\n");
      out.write("        cursor: default;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    nav ul li a {\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("        color: black;\r\n");
      out.write("        display: block;\r\n");
      out.write("        font-size:20px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    nav ul li a:hover {\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("        color: black;\r\n");
      out.write("  /*      transform: scale(1.1);*/\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    nav ul li ul {\r\n");
      out.write("        position: absolute;\r\n");
      out.write("        top: 100%;\r\n");
      out.write("        left: 0;\r\n");
      out.write("        background: white;\r\n");
      out.write("        visibility: hidden;\r\n");
      out.write("        list-style: none;\r\n");
      out.write("        display: flex;\r\n");
      out.write("        flex-direction: column;\r\n");
      out.write("        z-index: 1000;\r\n");
      out.write("        padding: 0px;    \r\n");
      out.write("        margin-top: 10px;\r\n");
      out.write("        margin: auto;\r\n");
      out.write("        width: 150px;\r\n");
      out.write("        border: 1px solid black;\r\n");
      out.write("        left: 50%; /* 수정: 부모의 중앙으로 이동 */\r\n");
      out.write("        transform: translateX(-50%); /* 수정: 중앙 정렬 */\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    nav ul li:hover ul {\r\n");
      out.write("        visibility: visible;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    nav ul li ul li {\r\n");
      out.write("        padding: 0px;\r\n");
      out.write("        border-bottom: 1px solid #ccc;\r\n");
      out.write("        text-align: left;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    nav ul li ul li:hover {\r\n");
      out.write("        background: #848484;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    nav ul li ul li a {\r\n");
      out.write("        display: block;\r\n");
      out.write("        padding: 10px; /* 패딩을 a 태그로 이동 */\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("        color: black;\r\n");
      out.write("        width: 100%; /* a 태그가 li 태그의 전체 너비를 차지하도록 */\r\n");
      out.write("        box-sizing: border-box; /* 패딩과 테두리를 포함하여 크기 계산 */\r\n");
      out.write("        font-size: 16px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    nav ul li ul li a:hover {\r\n");
      out.write("    \t\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("        color: white;\r\n");
      out.write("        text-shadow: 1px 1px 2px black;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    nav ul li ul li:last-child {\r\n");
      out.write("        border-bottom: none;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    main {\r\n");
      out.write("        flex: 1; /* main 요소가 남은 공간을 차지하도록 설정 */\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    footer {\r\n");
      out.write("        height: 120px;\r\n");
      out.write("        width:100%;\r\n");
      out.write("        background: black;\r\n");
      out.write("        color: white;\r\n");
      out.write("        display: flex;\r\n");
      out.write("        justify-content: center;\r\n");
      out.write("        align-items: center;\r\n");
      out.write("        flex-shrink: 0; /* footer가 화면 크기에 따라 줄어들지 않도록 설정 */\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    .footer {width:100%;}\r\n");
      out.write("\r\n");
      out.write("    header .flex-container .dropdown-content {\r\n");
      out.write("\t    display: none;\r\n");
      out.write("\t    position: absolute;\r\n");
      out.write("\t    background-color: white;\r\n");
      out.write("\t    min-width: 160px;\r\n");
      out.write("\t    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\r\n");
      out.write("\t    z-index: 1001; /* z-index를 상단 메뉴보다 높게 설정 */\r\n");
      out.write("\t    right: 0;\r\n");
      out.write("\t    left: 50%; /* 부모 요소의 중앙에 위치하도록 */\r\n");
      out.write("\t    transform: translateX(-50%); /* 중앙 정렬 */\r\n");
      out.write("\t    \r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("    header .flex-container .dropdown-content a {\r\n");
      out.write("        color: black;\r\n");
      out.write("        padding: 12px 16px;\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("        display: block;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    header .flex-container .dropdown-content a:hover {\r\n");
      out.write("        background-color: #f1f1f1;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    header .flex-container .dropdown:hover .dropdown-content {\r\n");
      out.write("        display: block;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    header .flex-container a:hover {\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("        color: white; /* 마우스를 올렸을 때의 색상 */\r\n");
      out.write("        text-shadow: 1px 1px 2px black;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction viewMenu(){\r\n");
      out.write("\t\tif(document.getElementById(\"menu\").innerHTML.trim()==\"\"){\r\n");
      out.write("\t\tvar chk = new XMLHttpRequest();\r\n");
      out.write("\t\tchk.onload = function(){\r\n");
      out.write("\t\t\tvar rooms = JSON.parse(chk.responseText);\r\n");
      out.write("\t\t\tfor(room of rooms){\r\n");
      out.write("\t\t\t\tvar addLi = document.createElement(\"li\");\r\n");
      out.write("\t\t\t\taddLi.innerHTML = \"<a href='../room/roomView?id=\" + room.id + \"'>\" + room.title + \"</a>\";\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"menu\").appendChild(addLi);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tchk.open(\"get\", \"../getRooms\");\r\n");
      out.write("\t\tchk.send();\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      if (_jspx_meth_decorator_005fhead_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"outer\">\r\n");
      out.write("        <div class=\"content\">\r\n");
      out.write("            <div class=\"left\">LEFT</div>\r\n");
      out.write("            <div class=\"center\">광고성 글</div>\r\n");
      out.write("            <div class=\"right\">X</div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <header>\r\n");
      out.write("        <a href=\"../main/index\"><div class=\"logo\"><img src=\"../resources/aaa2.png\" width=\"100px\"></div></a>\r\n");
      out.write("        <div class=\"flex-container\">\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("    <nav>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li>펜션소개\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"\">펜션지기</a></li>\r\n");
      out.write("                    <li><a href=\"\">오시는길</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>주변볼거리\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"\">호수공원</a></li>\r\n");
      out.write("                    <li><a href=\"\">킨 텍 스</a></li>\r\n");
      out.write("                    <li><a href=\"\">한류월드</a></li>\r\n");
      out.write("                    <li><a href=\"\">서 오 능</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>주변맛집\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"\">버거킹</a></li>\r\n");
      out.write("                    <li><a href=\"\">서가원</a></li>\r\n");
      out.write("                    <li><a href=\"\">대동관</a></li>\r\n");
      out.write("                    <li><a href=\"\">김밥천국</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li onmouseover=\"viewMenu()\"><a href=\"../room/list\">객실현황</a>\r\n");
      out.write("                <ul id=\"menu\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>예약관련\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"\">예약 안내</a></li>\r\n");
      out.write("                    <li><a href=\"../reserve/reserve\">실시간 예약</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>커뮤니티\r\n");
      out.write("                <ul>\r\n");
      out.write("                   <li> <a href=\"../notice/list\">공지사항</a></li>\r\n");
      out.write("                    <li> <a href=\"../tour/list\">여행후기</a> </li>\r\n");
      out.write("                    <li><a href=\"../board/list\">회원게시판</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \t");
      if (_jspx_meth_decorator_005fbody_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"footer\"><footer>펜션 정보</footer></div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_decorator_005fhead_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  decorator:head
    com.opensymphony.module.sitemesh.taglib.decorator.HeadTag _jspx_th_decorator_005fhead_005f0 = (com.opensymphony.module.sitemesh.taglib.decorator.HeadTag) _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.HeadTag.class);
    boolean _jspx_th_decorator_005fhead_005f0_reused = false;
    try {
      _jspx_th_decorator_005fhead_005f0.setPageContext(_jspx_page_context);
      _jspx_th_decorator_005fhead_005f0.setParent(null);
      int _jspx_eval_decorator_005fhead_005f0 = _jspx_th_decorator_005fhead_005f0.doStartTag();
      if (_jspx_th_decorator_005fhead_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody.reuse(_jspx_th_decorator_005fhead_005f0);
      _jspx_th_decorator_005fhead_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_decorator_005fhead_005f0, _jsp_getInstanceManager(), _jspx_th_decorator_005fhead_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/common/default.jsp(300,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty userid}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                <a href=\"../member/login\">로그인</a>\r\n");
          out.write("                <a href=\"../member/member\">회원가입</a>\r\n");
          out.write("                <a href=\"../inquiry/write\">문의하기</a>\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/views/common/default.jsp(305,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty userid}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            \t");
          if (_jspx_meth_c_005fif_005f2(_jspx_th_c_005fif_005f1, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("            \t<div class=\"dropdown\">\r\n");
          out.write("                <a href=\"\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(" 님</a>\r\n");
          out.write("                <div class=\"dropdown-content\">\r\n");
          out.write("                        <a href=\"../member/memberView\">회원정보</a>\r\n");
          out.write("                        <a href=\"../member/reserveList\">예약정보</a>\r\n");
          out.write("                        <a href=\"../member/myWrite\">내가 작성한 글</a>\r\n");
          out.write("             \t</div>\r\n");
          out.write("             \t</div>\r\n");
          out.write("                <a href=\"../member/logout\">로그아웃</a>\r\n");
          out.write("                <a href=\"../inquiry/write\">문의하기</a>\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
      // /WEB-INF/views/common/default.jsp(306,13) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userid=='admin'}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            \t<a href=\"../adminRoom/list\">객실관리</a>\r\n");
          out.write("            \t<a href=\"\">예약관리</a>\r\n");
          out.write("            \t<a href=\"../adminRoom/inquiryList\">문의관리</a>\r\n");
          out.write("            \t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/common/default.jsp(350,20) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("room");
      // /WEB-INF/views/common/default.jsp(350,20) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/common/default.jsp(350,20) '${rooms}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${rooms}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                    <li><a href=\"../room/roomView?id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${room.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${room.title }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</a></li>\r\n");
            out.write("                    ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_decorator_005fbody_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  decorator:body
    com.opensymphony.module.sitemesh.taglib.decorator.BodyTag _jspx_th_decorator_005fbody_005f0 = (com.opensymphony.module.sitemesh.taglib.decorator.BodyTag) _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.BodyTag.class);
    boolean _jspx_th_decorator_005fbody_005f0_reused = false;
    try {
      _jspx_th_decorator_005fbody_005f0.setPageContext(_jspx_page_context);
      _jspx_th_decorator_005fbody_005f0.setParent(null);
      int _jspx_eval_decorator_005fbody_005f0 = _jspx_th_decorator_005fbody_005f0.doStartTag();
      if (_jspx_th_decorator_005fbody_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.reuse(_jspx_th_decorator_005fbody_005f0);
      _jspx_th_decorator_005fbody_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_decorator_005fbody_005f0, _jsp_getInstanceManager(), _jspx_th_decorator_005fbody_005f0_reused);
    }
    return false;
  }
}
