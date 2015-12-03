package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Course;
import Controller.Registration;
import Model.Section;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\"\n");
      out.write("      >\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      Controller.Registration reg = null;
      synchronized (_jspx_page_context) {
        reg = (Controller.Registration) _jspx_page_context.getAttribute("reg", PageContext.PAGE_SCOPE);
        if (reg == null){
          reg = new Controller.Registration();
          _jspx_page_context.setAttribute("reg", reg, PageContext.PAGE_SCOPE);
        }
      }
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
      out.write("    <title>COL++ Registrar Page</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    <!-- Custom Fonts -->\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'/>\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'/>\n");
      out.write("   \n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/creative.css\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("<script src=\"js/jquery-1.10.2.min.js\"></script>\n");
      out.write(" <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("     <link rel=\"stylesheet\" href=\"css/bootstrap-multiselect.css\" type=\"text/css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap-multiselect.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"page-top\">\n");
      out.write("    ");
 //burda user objesi register'a gider
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
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"stuSchedule.xhtml\">Schedule</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"stuAdmission.xhtml\">Admission-Online</a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"curri.xhtml\">Curriculum</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"ccr.xhtml\">Ccr</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"evaluationForm.xhtml\">Instructor and Course Evaluation</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"transcript.xhtml\">Transcript</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"stuMessages.xhtml\">Messages</a>\n");
      out.write("                    </li>\n");
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
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <div name=\"selected\" style=\"margin-right: 60px; background-color: #000\">\n");
      out.write("                                ");
reg.filterCourses()
      out.write("\n");
      out.write("                                <table border=\"1\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td colspan=\"7\">SELECTED COURSES</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td style=\"padding: 15px;\">Course Code</td>\n");
      out.write("                                        <td style=\"padding: 15px;\">Course Name</td>\n");
      out.write("                                        <td style=\"padding: 15px\">Section</td>\n");
      out.write("                                        <td style=\"padding: 15px\">Instructor</td>\n");
      out.write("                                        <td style=\"padding: 15px\">Days</td>\n");
      out.write("                                        <td style=\"padding: 15px\">Hours</td>\n");
      out.write("                                        <td style=\"padding: 15px\">Credits</td>\n");
      out.write("                                        \n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>OBLIGATORY</tr>\n");
      out.write("                                    ");

                                        for(Course c : reg.obligatory){
                                            for(Section s : c.sections){
                                    
      out.write("\n");
      out.write("                                    <tr>");
      out.print( c.code);
      out.write("</tr>\n");
      out.write("                                    <tr>");
      out.print( c.name);
      out.write("</tr>\n");
      out.write("                                    <tr>");
      out.print( s.sectionNo);
      out.write("</tr>\n");
      out.write("                                    <tr>");
      out.print( s.instructorName);
      out.write("</tr>\n");
      out.write("                                    <tr>");
      out.print( s.days);
      out.write("</tr>\n");
      out.write("                                    <tr>");
      out.print( s.hours);
      out.write("</tr>\n");
      out.write("                                    <tr>");
      out.print( c.credit);
      out.write("</tr> \n");
      out.write("                                    ");

                                            }
                                        }
                                    
      out.write("\n");
      out.write("                                    \n");
      out.write("                                    <tr>Departmental Elective</tr>\n");
      out.write("                                    ");

                                        for(Course c : reg.deptElective){
                                            for(Section s : c.sections){
                                    
      out.write("\n");
      out.write("                                    <tr>");
      out.print( c.code);
      out.write("</tr>\n");
      out.write("                                    <tr>");
      out.print( c.name);
      out.write("</tr>\n");
      out.write("                                    <tr>");
      out.print( s.sectionNo);
      out.write("</tr>\n");
      out.write("                                    <tr>");
      out.print( s.instructorName);
      out.write("</tr>\n");
      out.write("                                    <tr>");
      out.print( s.days);
      out.write("</tr>\n");
      out.write("                                    <tr>");
      out.print( s.hours);
      out.write("</tr>\n");
      out.write("                                    <tr>");
      out.print( c.credit);
      out.write("</tr> \n");
      out.write("                                    ");

                                            }
                                        }
                                    
      out.write("\n");
      out.write("                                    \n");
      out.write("                                    <tr>Complementary Elective</tr>\n");
      out.write("                                    ");

                                        for(Course c : reg.compElective){
                                            for(Section s : c.sections){
                                    
      out.write("\n");
      out.write("                                    <tr>");
      out.print( c.code);
      out.write("</tr>\n");
      out.write("                                    <tr>");
      out.print( c.name);
      out.write("</tr>\n");
      out.write("                                    <tr>");
      out.print( s.sectionNo);
      out.write("</tr>\n");
      out.write("                                    <tr>");
      out.print( s.instructorName);
      out.write("</tr>\n");
      out.write("                                    <tr>");
      out.print( s.days);
      out.write("</tr>\n");
      out.write("                                    <tr>");
      out.print( s.hours);
      out.write("</tr>\n");
      out.write("                                    <tr>");
      out.print( c.credit);
      out.write("</tr> \n");
      out.write("                                    ");

                                            }
                                        }
                                    
      out.write("\n");
      out.write("                                    \n");
      out.write("                                    <tr>Free Elective</tr>\n");
      out.write("                                    ");

                                        for(Course c : reg.freeElective){
                                            for(Section s : c.sections){
                                    
      out.write("\n");
      out.write("                                    <tr>");
      out.print( c.code);
      out.write("</tr>\n");
      out.write("                                    <tr>");
      out.print( c.name);
      out.write("</tr>\n");
      out.write("                                    <tr>");
      out.print( s.sectionNo);
      out.write("</tr>\n");
      out.write("                                    <tr>");
      out.print( s.instructorName);
      out.write("</tr>\n");
      out.write("                                    <tr>");
      out.print( s.days);
      out.write("</tr>\n");
      out.write("                                    <tr>");
      out.print( s.hours);
      out.write("</tr>\n");
      out.write("                                    <tr>");
      out.print( c.credit);
      out.write("</tr> \n");
      out.write("                                    ");

                                            }
                                        }
                                    
      out.write("\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    <tr name=\"selected_data\">\n");
      out.write("                                        \n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <div name=\"all_courses\" style=\"background-color: #000\">\n");
      out.write("                                <table border=\"1\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td colspan=\"7\">ALL COURSES</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td style=\"padding: 15px\">Course Code</td>\n");
      out.write("                                        <td style=\"padding: 15px\">Course Name</td>\n");
      out.write("                                        <td style=\"padding: 15px\">Section</td>\n");
      out.write("                                        <td style=\"padding: 15px\">Instructor</td>\n");
      out.write("                                        <td style=\"padding: 15px\">Days</td>\n");
      out.write("                                        <td style=\"padding: 15px\">Hours</td>\n");
      out.write("                                        <td style=\"padding: 15px\">Credits</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr name=\"all_courses_data\">\n");
      out.write("                                        \n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("   \n");
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
