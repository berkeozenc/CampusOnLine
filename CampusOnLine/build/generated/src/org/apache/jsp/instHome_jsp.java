package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Instructor;
import Controller.Login;

public final class instHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      Controller.Login login = null;
      synchronized (session) {
        login = (Controller.Login) _jspx_page_context.getAttribute("login", PageContext.SESSION_SCOPE);
        if (login == null){
          login = new Controller.Login();
          _jspx_page_context.setAttribute("login", login, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\"\n");
      out.write("     >\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\"/>\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"/>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"/>\n");
      out.write("    <meta name=\"description\" content=\"\"/>\n");
      out.write("    <meta name=\"author\" content=\"\"/>\n");
      out.write("\n");
      out.write("    <title>COL++ Main Page</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    <!-- Custom Fonts -->\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'/>\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"font-awesome/css/font-awesome.min.css\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    <!-- Plugin CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/animate.min.css\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/creative.css\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("      $('ul li.dropdown').hover(function() {\n");
      out.write("  $(this).find('.dropdown-menu').stop(true, true).delay(200).fadeIn(500);\n");
      out.write("}, function() {\n");
      out.write("  $(this).find('.dropdown-menu').stop(true, true).delay(200).fadeOut(500);\n");
      out.write("});\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"page-top\">\n");
      out.write("\n");
      out.write("    <nav id=\"mainNav\" class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand page-scroll\" href=\"#page-top\">Main Page</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    \n");
      out.write("                  \n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"#\">Instructor Functions</a>\n");
      out.write("                    </li>\n");
      out.write("                      ");
Instructor i = (Instructor) login.getU();
                        if(i.isIsAdvisor()){
      out.write("\n");
      out.write("                        <li class=\"dropdown\" >\n");
      out.write("                         <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" data-hover=\"dropdown\" data-delay=\"1000\" data-close-others=\"false\">\n");
      out.write("        Advisor Functions<b class=\"caret\"></b>\n");
      out.write("    </a>\n");
      out.write("    <ul class=\"dropdown-menu\">\n");
      out.write("        <li><a tabindex=\"-1\" href=\"#\">Draft Program Approval</a></li>\n");
      out.write("        <li class=\"divider\"></li>\n");
      out.write("        <li><a tabindex=\"-1\" href=\"#\">Manage Holds</a></li>\n");
      out.write("          <li class=\"divider\"></li>\n");
      out.write("        <li><a tabindex=\"-1\" href=\"#\">Free Hours Report</a></li>\n");
      out.write("          <li class=\"divider\"></li>\n");
      out.write("        <li><a tabindex=\"-1\" href=\"#\">Messages</a></li>\n");
      out.write("          <li class=\"divider\"></li>\n");
      out.write("        <li><a tabindex=\"-1\" href=\"#\">Manage Quotas</a></li>\n");
      out.write("                  <li class=\"divider\"></li>\n");
      out.write("        <li><a tabindex=\"-1\" href=\"#\">View Free Rooms</a></li>\n");
      out.write("\n");
      out.write("       \n");
      out.write("    </ul>\n");
      out.write("                    </li>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    ");

                        if(i.isIsQuotaMan()){
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"#\">Quota Manager Functions</a>\n");
      out.write("                    </li>\n");
      out.write("                     ");
}
      out.write("\n");
      out.write("                     ");

                        if(i.isIsDepAdmin()){
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"#\">Department Admin Functions</a>\n");
      out.write("                    </li>\n");
      out.write("                     ");
}
      out.write("\n");
      out.write("                           \n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"login.html\">Log Out</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-collapse -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container-fluid -->\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <header>\n");
      out.write("        <div class=\"header-content\">\n");
      out.write("            <div class=\"header-content-inner\">\n");
      out.write("                <h2>Welcome To Campus On-Line ++</h2>\n");
      out.write("                <hr/>\n");
      out.write("              \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <section class=\"bg-primary\" id=\"announcements\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-8 col-lg-offset-2 text-center\">\n");
      out.write("                    <h2 class=\"section-heading\">Announcements</h2>\n");
      out.write("                    <hr class=\"light\"/>\n");
      out.write("                    <p class=\"text-faded\">Here comes the announcements from the database based on department id of student</p>\n");
      out.write("                    <a href=\"#\" class=\"btn btn-default btn-xl\">View Details Of My Announcments</a>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Plugin JavaScript -->\n");
      out.write("    <script src=\"js/jquery.easing.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.fittext.js\"></script>\n");
      out.write("    <script src=\"js/wow.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom Theme JavaScript -->\n");
      out.write("    <script src=\"js/creative.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
}
