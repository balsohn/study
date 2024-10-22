/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.1
 * Generated at: 2024-07-02 03:57:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
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
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");

	Class.forName("com.mysql.jdbc.Driver"); // 라이브러리를 찾아라
	String db="jdbc:mysql://localhost:3306/second";
	Connection conn=DriverManager.getConnection(db,"root","1234");
	request.setCharacterEncoding("utf-8");
	
	int pager;
	
	if(request.getParameter("pager")==null)
	{
		pager=1;
	}
	else
	{
		pager=Integer.parseInt(request.getParameter("pager"));
	}
	
	int index=(pager-1)*10;
	int pstart,pend;
	int p=(pager-1)/10;
	
	pstart=p*10+1;
	pend=pstart+9;
	
	// 총 페이지를 type별로 구하기
	String type=request.getParameter("type");
	String search=request.getParameter("search");
	int searchType;
	if(request.getParameter("searchType")==null)
	{
		searchType=-1;
	}
	else
	{
		searchType=Integer.parseInt(request.getParameter("searchType"));
	}
	
	String searchText="";
	String sql2="select ceil(count(*)/10) as chong from pageboard";
	if(type!=null && search!=null)
	{
		switch(searchType)
		{
		case 0:searchText=" where type=? and title like ?";break;
		case 1:searchText=" where type=? and title like ? or content like ?"; break;
		case 2:searchText=" where type=? and name like ?"; break;
		}
	}
	else if(type!=null)
	{
		searchText=" where type=?";
	}
	else if(search!=null)
	{
		switch(searchType)
		{
		case 0:searchText=" where title like ?";break;
		case 1:searchText=" where title like ? or content like ?"; break;
		case 2:searchText=" where name like ?"; break;
		}
	}
	
	/* String sql2;
	if(type==null)
	{
		sql2="select ceil(count(*)/10) as chong from pageboard";
	}
	else
	{
		sql2="select ceil(count(*)/10) as chong from pageboard where type=?";
	} */
	
	// 심부름꾼 생성 + setter
	
	sql2=sql2+searchText;
	int searchIndex=1;
	PreparedStatement pstmt2=conn.prepareStatement(sql2);
	if(type!=null)
	{
		pstmt2.setString(searchIndex++,type);
		// String sql2="select ceil(count(*)/10) as chong from pageboard where type=?";
	}
	if(search!=null)
	{
		pstmt2.setString(searchIndex++, "%"+search+"%");
		// String sql2="select ceil(count(*)/10) as chong from pageboard where title like ?";
		if(searchType==1)
		{
			pstmt2.setString(searchIndex++, "%"+search+"%");
			// String sql2="select ceil(count(*)/10) as chong from pageboard where title like ? or content like ?";
		}
	}
	
	ResultSet rs2=pstmt2.executeQuery();
	rs2.next();
	int chong=rs2.getInt("chong");
	
	if(chong<pend)
	{
		pend=chong;
	}
	
	String sql="select * from pageboard"+searchText+" order by case when type=0 then 1 else 2 end, id desc limit ?,10";
	PreparedStatement pstmt=conn.prepareStatement(sql);
	
	
	searchIndex=1;
	if(type!=null)
	{
		pstmt.setString(searchIndex++,type);
	}
	if(search!=null)
	{
		pstmt.setString(searchIndex++, "%"+search+"%");
		if(searchType==1)
		{
			pstmt.setString(searchIndex++, "%"+search+"%");
		}
	}
	
    pstmt.setInt(searchIndex, index);
    ResultSet rs=pstmt.executeQuery();
	/* String sql;
	if(type==null)
	{
		 sql="(select * from pageboard where type='공지사항' order by id desc)"
				+" union all "+"(select * from pageboard where type!='공지사항' order by id desc limit ?,10)"; 
		sql="select * from pageboard order by case when type='공지사항' then 1 else 2 end, id limit ?,10";
	}
	else
	{
		sql="select * from pageboard where type=? order by id desc limit ?,10";
	}
	PreparedStatement pstmt=conn.prepareStatement(sql); 
	if(type==null)
	{
		pstmt.setInt(1, index);
	}
	else
	{
		pstmt.setString(1, type);
		pstmt.setInt(2, index);
	}
	
	ResultSet rs=pstmt.executeQuery(); */
	String param="";
	if(type!=null && search!=null)
	{
		param="&type="+type+"&search="+search+"&searchType="+searchType;
	}
	else if(type!=null)
	{
		param="&type="+type;
	}
	else if(search!=null)
	{
		param="&search="+search+"&searchType="+searchType;
	}
	

      out.write("\t\r\n");
      out.write("     <form method=\"post\" action=\"list.jsp\">\r\n");
      out.write("     <input type=\"hidden\" name=\"type\" value=\"");
      out.print(request.getParameter("type") );
      out.write("\">\r\n");
      out.write("     <tr>\r\n");
      out.write("     \t<td>\r\n");
      out.write("     \t\t<select name=\"searchType\">\r\n");
      out.write("     \t\t\t<option value=\"0\">제목</option>\r\n");
      out.write("     \t\t\t<option value=\"1\">제목+내용</option>\r\n");
      out.write("     \t\t\t<option value=\"2\">작성자</option>\r\n");
      out.write("     \t\t</select>\r\n");
      out.write("     \t</td>\r\n");
      out.write("     \t<td>\r\n");
      out.write("     \t\t<input type=\"text\" name=\"search\">\r\n");
      out.write("     \t\t<input type=\"submit\" value=\"검색\">\r\n");
      out.write("     \t</td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     \t\r\n");
      out.write("     </form>\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><a href=\"list.jsp\">전체글보기</a></td>\r\n");
      out.write("\t\t\t<td><a href=\"list.jsp?type=1\">자유게시판</a></td>\r\n");
      out.write("\t\t\t<td><a href=\"list.jsp?type=2\">질답게시판</a></td>\r\n");
      out.write("\t\t\t<td><a href=\"list.jsp?type=0\">공지사항</a></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>게시판종류</td>\r\n");
      out.write("\t\t\t<td>제목</td>\r\n");
      out.write("\t\t\t<td>작성자</td>\r\n");
      out.write("\t\t\t<td>조회수</td>\r\n");
      out.write("\t\t\t<td>작성일</td>\r\n");
      out.write("\t\t</tr>\r\n");

	while(rs.next())
	{
		String rtype="";
		switch(rs.getInt("type"))
		{
		case 0:rtype="공지사항";break;
		case 1:rtype="질답게시판";break;
		case 2:rtype="자유게시판";break;
		}

      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>");
      out.print(rtype );
      out.write("</td>\r\n");
      out.write("\t\t\t<td><a href=\"content.jsp?id=");
      out.print(rs.getInt("id"));
      out.write("&pager=");
      out.print(pager);
      out.write('"');
      out.write('>');
      out.print(rs.getString("title") );
      out.write("</a></td>\r\n");
      out.write("\t\t\t<td>");
      out.print(rs.getString("name") );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(rs.getInt("readnum") );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(rs.getString("writeday") );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");

	}

      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("       <td colspan=\"4\" align=\"right\">\r\n");
      out.write("          <a href=\"write.jsp\" id=\"btn\"> 글쓰기 </a>\r\n");
      out.write("       </td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     \r\n");
      out.write("     <tr>\r\n");
      out.write("       <td colspan=\"4\" align=\"center\">\r\n");
      out.write("         <!-- 페이지 링크 출력  : pstart부터 pend => 숫자클릭하면 => list.jsp?pager=페이지   -->\r\n");
      out.write("         \r\n");
      out.write("         <!-- 이전 그룹 이동 -->\r\n");
      out.write("       ");

        if(pstart != 1) // 첫번재 그룹이 아니면 된다.. 
        {
       
      out.write("  \r\n");
      out.write("         <a href=\"list.jsp?pager=");
      out.print(pstart-1);
      out.print(param);
      out.write("\"> << </a>\r\n");
      out.write("       ");

        }
        else
        {
       
      out.write("  \r\n");
      out.write("         \r\n");
      out.write("       ");

        }
       
      out.write("\r\n");
      out.write("       \r\n");
      out.write("         \r\n");
      out.write("         <!-- 이전페이지 이동 -->\r\n");
      out.write("       ");

        if(pager != 1)
        {
       
      out.write("  \r\n");
      out.write("         <a href=\"list.jsp?pager=");
      out.print(pager-1);
      out.print(param);
      out.write("\"> < </a> <!-- 1페이지가 아닐때 -->\r\n");
      out.write("       ");

        }
        else
        {
       
      out.write("  \r\n");
      out.write("            <!-- 1페이지일때는 링크 X -->\r\n");
      out.write("       ");

        }
       
      out.write("  \r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("         ");

         
           for(int i=pstart;i<=pend;i++)
           {
        	   String imsi="";
        	   if(pager==i)
        	   {
        		   imsi="style='color:red;border:1px solid black;'";
        	   }
         
      out.write("\t  \r\n");
      out.write("              <a href=\"list.jsp?pager=");
      out.print(i);
      out.print(param);
      out.write('"');
      out.write(' ');
      out.print(imsi);
      out.write(" class=\"link\"> ");
      out.print(i);
      out.write(" </a>\r\n");
      out.write("         ");

           }
         
      out.write("\r\n");
      out.write("         \r\n");
      out.write("         <!-- 다음페이지 이동 -->\r\n");
      out.write("        ");

         if(pager != chong)
         {
        
      out.write(" \r\n");
      out.write("         <a href=\"list.jsp?pager=");
      out.print(pager+1);
      out.print(param);
      out.write("\"> > </a>\r\n");
      out.write("        ");

         }
         else
         {
        
      out.write(" \r\n");
      out.write("         \r\n");
      out.write("        ");

         }
        
      out.write(" \r\n");
      out.write("        \r\n");
      out.write("        <!-- 다음 그룹 이동 -->\r\n");
      out.write("        ");

        if(pend != chong) // 마지막 그룹은 pend와 chong가 같다
        {
        
      out.write(" \r\n");
      out.write("         <a href=\"list.jsp?pager=");
      out.print(pend+1);
      out.print(param);
      out.write("\"> >> </a>\r\n");
      out.write("        ");

        }
        else
        {
        
      out.write("\r\n");
      out.write("         \r\n");
      out.write("        ");

        }
        
      out.write("\r\n");
      out.write("       </td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     <form method=\"post\" action=\"list.jsp\">\r\n");
      out.write("     <tr>\r\n");
      out.write("     \t<td>\r\n");
      out.write("     \t\t<select name=\"searchType\">\r\n");
      out.write("     \t\t\t<option value=\"0\">제목</option>\r\n");
      out.write("     \t\t\t<option value=\"1\">제목+내용</option>\r\n");
      out.write("     \t\t\t<option value=\"2\">작성자</option>\r\n");
      out.write("     \t\t</select>\r\n");
      out.write("     \t</td>\r\n");
      out.write("     \t<td>\r\n");
      out.write("     \t\t<input type=\"text\" name=\"search\">\r\n");
      out.write("     \t\t<input type=\"submit\" value=\"검색\">\r\n");
      out.write("     \t</td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     \t\r\n");
      out.write("     </form>\r\n");
      out.write("\t</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");

	rs.close();
	rs2.close();
	pstmt.close();
	pstmt2.close();
	conn.close();

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
