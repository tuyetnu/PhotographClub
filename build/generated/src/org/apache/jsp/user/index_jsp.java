package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import nuntt.dtos.RegistrationDTO;
import nuntt.daos.RegistrationDAO;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_nunnt_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_nunnt_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_nunnt_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>User Page</title>\n");
      out.write("        <!-- Bootstrap Core CSS -->\n");
      out.write("        <link href=\"/PhotographClub/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link href=\"/PhotographClub/css/sb-admin-2.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom Fonts -->\n");
      out.write("        <link href=\"/PhotographClub/css/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <style>\n");
      out.write("            .tagtd {\n");
      out.write("                padding: 10px 15px;\n");
      out.write("            }\n");
      out.write("            .taginput {\n");
      out.write("                height: 50px;\n");
      out.write("                width: 300px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      if (_jspx_meth_nunnt_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <nav class=\"navbar navbar-default navbar-static-top\" role=\"navigation\" style=\"margin-bottom: 0\">\n");
      out.write("                <!-- /.navbar-header -->\n");
      out.write("                <ul class=\"nav navbar-top-links navbar-right\">\n");
      out.write("                    <li>\n");
      out.write("                        <form action=\"/PhotographClub/MainController\" method=\"POST\">\n");
      out.write("                            <i class=\"fa fa-sign-out fa-fw\"></i><input type=\"submit\" value=\"Logout\" name=\"action\" />\n");
      out.write("                        </form>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <div class=\"navbar-default sidebar\" role=\"navigation\">\n");
      out.write("                    <div class=\"sidebar-nav navbar-collapse\">\n");
      out.write("                        <ul class=\"nav\" id=\"side-menu\">       \n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"/PhotographClub/user/index.jsp\"><i class=\"fa fa-edit fa-fw\"></i> Edit Profile</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"/PhotographClub/\"><i class=\"fa fa-arrow-circle-right\"></i> Back to Website</a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.sidebar-collapse -->\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <div id=\"page-wrapper\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <h1 class=\"page-header\" style=\"text-align: center;\">My Profiles</h1>\n");
      out.write("                    </div>       \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");

                    String username = (String) session.getAttribute("USERLOGIN");
                    RegistrationDAO dao = new RegistrationDAO();
                    RegistrationDTO dto = dao.findByPK(username);
                
      out.write("\n");
      out.write("\n");
      out.write("                <center>\n");
      out.write("                    <form action=\"MainController\" method=\"POST\">\n");
      out.write("                        <table border=\"0\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"tagtd\">Username: </td>\n");
      out.write("                                <td class=\"tagtd\">\n");
      out.write("                                    <input type=\"text\" name=\"txtUsername\" value=\"");
      out.print( dto.getUsername());
      out.write("\" readonly=\"readonly\" class=\"taginput\"/>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"tagtd\">Fullname: </td>\n");
      out.write("                                <td class=\"tagtd\">\n");
      out.write("                                    <input type=\"text\" name=\"txtUsername\" value=\"");
      out.print( dto.getFullname());
      out.write("\" class=\"taginput\" />\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"tagtd\">Password: </td>\n");
      out.write("                                <td class=\"tagtd\">\n");
      out.write("                                    <input type=\"password\" name=\"txtUsername\" value=\"\" class=\"taginput\"/>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"tagtd\">Retype password: </td>\n");
      out.write("                                <td class=\"tagtd\">\n");
      out.write("                                    <input type=\"text\" name=\"txtUsername\" value=\"\" class=\"taginput\"/>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr><td class=\"tagtd\"></td>\n");
      out.write("                                <td class=\"tagtd\">\n");
      out.write("                                    <form action=\"/PhotogaphClub/MainController\" method=\"POST\">\n");
      out.write("                                    </form>\n");
      out.write("                                    <form action=\"/PhotograpClub/MainController\" method=\"POST\">\n");
      out.write("                                        <input type=\"submit\" value=\"Update\" name=\"action\" />\n");
      out.write("                                    </form>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_nunnt_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nunnt:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_nunnt_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_nunnt_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_nunnt_if_0.setPageContext(_jspx_page_context);
    _jspx_th_nunnt_if_0.setParent(null);
    _jspx_th_nunnt_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ROLELOGIN ne 'user'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_nunnt_if_0 = _jspx_th_nunnt_if_0.doStartTag();
    if (_jspx_eval_nunnt_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            ");
        if (true) {
          _jspx_page_context.forward("../login.jsp");
          return true;
        }
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_nunnt_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_nunnt_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_nunnt_if_test.reuse(_jspx_th_nunnt_if_0);
      return true;
    }
    _jspx_tagPool_nunnt_if_test.reuse(_jspx_th_nunnt_if_0);
    return false;
  }
}
