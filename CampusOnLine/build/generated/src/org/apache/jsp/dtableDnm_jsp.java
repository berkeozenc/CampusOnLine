package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dtableDnm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>JSP Page</title>\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function() {\n");
      out.write("    var table = $('#example').DataTable();\n");
      out.write("    var tt = new $.fn.dataTable.TableTools( table );\n");
      out.write(" \n");
      out.write("    $( tt.fnContainer() ).insertBefore('div.dataTables_wrapper');\n");
      out.write("} );\n");
      out.write("    </script>\n");
      out.write("    <style>\n");
      out.write("        body { font-size: 140%; }\n");
      out.write("    div.DTTT { margin-bottom: 0.5em; float: right; }\n");
      out.write("    div.dataTables_wrapper { clear: both; }\n");
      out.write("    </style>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\"/>\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/animate.min.css\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/creative.css\" type=\"text/css\"/>\n");
      out.write("    \n");
      out.write("     <script src=\"js/jquery.js\"></script>\n");
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
      out.write("    \n");
      out.write("     <script src=\"dtjs/dataTables.bootstrap.js\"></script>\n");
      out.write("     <script src=\"dtjs/dataTables.tableTools.js\"></script>\n");
      out.write("     <script src=\"dtjs/jquery.dataTables.js\"></script>\n");
      out.write("     <link rel=\"stylesheet\" href=\"dtcss/dataTables.bootstrap.css\" type=\"text/css\"/>\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"DTTT btn-group\"><a class=\"btn btn-default DTTT_button_copy\" id=\"ToolTables_example_0\" tabindex=\"0\" aria-controls=\"example\"><span>Copy</span><div style=\"position: absolute; left: 0px; top: 0px; width: 59px; height: 34px; z-index: 99;\"><embed id=\"ZeroClipboard_TableToolsMovie_1\" src=\"../swf/copy_csv_xls_pdf.swf\" loop=\"false\" menu=\"false\" quality=\"best\" bgcolor=\"#ffffff\" width=\"59\" height=\"34\" name=\"ZeroClipboard_TableToolsMovie_1\" align=\"middle\" allowscriptaccess=\"always\" allowfullscreen=\"false\" type=\"application/x-shockwave-flash\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\" flashvars=\"id=1&amp;width=59&amp;height=34\" wmode=\"transparent\"></div></a><a class=\"btn btn-default DTTT_button_csv\" id=\"ToolTables_example_1\" tabindex=\"0\" aria-controls=\"example\"><span>CSV</span><div style=\"position: absolute; left: 0px; top: 0px; width: 54px; height: 34px; z-index: 99;\"><embed id=\"ZeroClipboard_TableToolsMovie_2\" src=\"../swf/copy_csv_xls_pdf.swf\" loop=\"false\" menu=\"false\" quality=\"best\" bgcolor=\"#ffffff\" width=\"54\" height=\"34\" name=\"ZeroClipboard_TableToolsMovie_2\" align=\"middle\" allowscriptaccess=\"always\" allowfullscreen=\"false\" type=\"application/x-shockwave-flash\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\" flashvars=\"id=2&amp;width=54&amp;height=34\" wmode=\"transparent\"></div></a><a class=\"btn btn-default DTTT_button_xls\" id=\"ToolTables_example_2\" tabindex=\"0\" aria-controls=\"example\"><span>Excel</span><div style=\"position: absolute; left: 0px; top: 0px; width: 60px; height: 34px; z-index: 99;\"><embed id=\"ZeroClipboard_TableToolsMovie_3\" src=\"../swf/copy_csv_xls_pdf.swf\" loop=\"false\" menu=\"false\" quality=\"best\" bgcolor=\"#ffffff\" width=\"60\" height=\"34\" name=\"ZeroClipboard_TableToolsMovie_3\" align=\"middle\" allowscriptaccess=\"always\" allowfullscreen=\"false\" type=\"application/x-shockwave-flash\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\" flashvars=\"id=3&amp;width=60&amp;height=34\" wmode=\"transparent\"></div></a><a class=\"btn btn-default DTTT_button_pdf\" id=\"ToolTables_example_3\" tabindex=\"0\" aria-controls=\"example\"><span>PDF</span><div style=\"position: absolute; left: 0px; top: 0px; width: 54px; height: 34px; z-index: 99;\"><embed id=\"ZeroClipboard_TableToolsMovie_4\" src=\"../swf/copy_csv_xls_pdf.swf\" loop=\"false\" menu=\"false\" quality=\"best\" bgcolor=\"#ffffff\" width=\"54\" height=\"34\" name=\"ZeroClipboard_TableToolsMovie_4\" align=\"middle\" allowscriptaccess=\"always\" allowfullscreen=\"false\" type=\"application/x-shockwave-flash\" pluginspage=\"http://www.macromedia.com/go/getflashplayer\" flashvars=\"id=4&amp;width=54&amp;height=34\" wmode=\"transparent\"></div></a><a class=\"btn btn-default DTTT_button_print\" id=\"ToolTables_example_4\" title=\"View print view\" tabindex=\"0\" aria-controls=\"example\"><span>Print</span></a></div>\n");
      out.write("   <table id=\"example\" class=\"table table-striped table-bordered dataTable\" cellspacing=\"0\" width=\"100%\" role=\"grid\" aria-describedby=\"example_info\" style=\"width: 100%;\">\n");
      out.write("\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t<tr role=\"row\"><th class=\"sorting_asc\" tabindex=\"0\" aria-controls=\"example\" rowspan=\"1\" colspan=\"1\" aria-sort=\"ascending\" aria-label=\"Name: activate to sort column descending\" style=\"width: 150px;\">Name</th><th class=\"sorting\" tabindex=\"0\" aria-controls=\"example\" rowspan=\"1\" colspan=\"1\" aria-label=\"Position: activate to sort column ascending\" style=\"width: 236px;\">Position</th><th class=\"sorting\" tabindex=\"0\" aria-controls=\"example\" rowspan=\"1\" colspan=\"1\" aria-label=\"Office: activate to sort column ascending\" style=\"width: 109px;\">Office</th><th class=\"sorting\" tabindex=\"0\" aria-controls=\"example\" rowspan=\"1\" colspan=\"1\" aria-label=\"Age: activate to sort column ascending\" style=\"width: 51px;\">Age</th><th class=\"sorting\" tabindex=\"0\" aria-controls=\"example\" rowspan=\"1\" colspan=\"1\" aria-label=\"Start date: activate to sort column ascending\" style=\"width: 105px;\">Start date</th><th class=\"sorting\" tabindex=\"0\" aria-controls=\"example\" rowspan=\"1\" colspan=\"1\" aria-label=\"Salary: activate to sort column ascending\" style=\"width: 83px;\">Salary</th></tr>\n");
      out.write("\t\t\t\t</thead>\n");
      out.write("\n");
      out.write("\t\t\t\t<tfoot>\n");
      out.write("\t\t\t\t\t<tr><th rowspan=\"1\" colspan=\"1\">Name</th><th rowspan=\"1\" colspan=\"1\">Position</th><th rowspan=\"1\" colspan=\"1\">Office</th><th rowspan=\"1\" colspan=\"1\">Age</th><th rowspan=\"1\" colspan=\"1\">Start date</th><th rowspan=\"1\" colspan=\"1\">Salary</th></tr>\n");
      out.write("\t\t\t\t</tfoot>\n");
      out.write("\n");
      out.write("\t\t\t\t<tbody>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<tr role=\"row\" class=\"odd\">\n");
      out.write("\t\t\t\t\t\t<td class=\"sorting_1\">Airi Satou</td>\n");
      out.write("\t\t\t\t\t\t<td>Accountant</td>\n");
      out.write("\t\t\t\t\t\t<td>Tokyo</td>\n");
      out.write("\t\t\t\t\t\t<td>33</td>\n");
      out.write("\t\t\t\t\t\t<td>2008/11/28</td>\n");
      out.write("\t\t\t\t\t\t<td>$162,700</td>\n");
      out.write("\t\t\t\t\t</tr><tr role=\"row\" class=\"even\">\n");
      out.write("\t\t\t\t\t\t<td class=\"sorting_1\">Angelica Ramos</td>\n");
      out.write("\t\t\t\t\t\t<td>Chief Executive Officer (CEO)</td>\n");
      out.write("\t\t\t\t\t\t<td>London</td>\n");
      out.write("\t\t\t\t\t\t<td>47</td>\n");
      out.write("\t\t\t\t\t\t<td>2009/10/09</td>\n");
      out.write("\t\t\t\t\t\t<td>$1,200,000</td>\n");
      out.write("\t\t\t\t\t</tr><tr role=\"row\" class=\"odd\">\n");
      out.write("\t\t\t\t\t\t<td class=\"sorting_1\">Ashton Cox</td>\n");
      out.write("\t\t\t\t\t\t<td>Junior Technical Author</td>\n");
      out.write("\t\t\t\t\t\t<td>San Francisco</td>\n");
      out.write("\t\t\t\t\t\t<td>66</td>\n");
      out.write("\t\t\t\t\t\t<td>2009/01/12</td>\n");
      out.write("\t\t\t\t\t\t<td>$86,000</td>\n");
      out.write("\t\t\t\t\t</tr><tr role=\"row\" class=\"even\">\n");
      out.write("\t\t\t\t\t\t<td class=\"sorting_1\">Bradley Greer</td>\n");
      out.write("\t\t\t\t\t\t<td>Software Engineer</td>\n");
      out.write("\t\t\t\t\t\t<td>London</td>\n");
      out.write("\t\t\t\t\t\t<td>41</td>\n");
      out.write("\t\t\t\t\t\t<td>2012/10/13</td>\n");
      out.write("\t\t\t\t\t\t<td>$132,000</td>\n");
      out.write("\t\t\t\t\t</tr><tr role=\"row\" class=\"odd\">\n");
      out.write("\t\t\t\t\t\t<td class=\"sorting_1\">Brenden Wagner</td>\n");
      out.write("\t\t\t\t\t\t<td>Software Engineer</td>\n");
      out.write("\t\t\t\t\t\t<td>San Francisco</td>\n");
      out.write("\t\t\t\t\t\t<td>28</td>\n");
      out.write("\t\t\t\t\t\t<td>2011/06/07</td>\n");
      out.write("\t\t\t\t\t\t<td>$206,850</td>\n");
      out.write("\t\t\t\t\t</tr><tr role=\"row\" class=\"even\">\n");
      out.write("\t\t\t\t\t\t<td class=\"sorting_1\">Brielle Williamson</td>\n");
      out.write("\t\t\t\t\t\t<td>Integration Specialist</td>\n");
      out.write("\t\t\t\t\t\t<td>New York</td>\n");
      out.write("\t\t\t\t\t\t<td>61</td>\n");
      out.write("\t\t\t\t\t\t<td>2012/12/02</td>\n");
      out.write("\t\t\t\t\t\t<td>$372,000</td>\n");
      out.write("\t\t\t\t\t</tr><tr role=\"row\" class=\"odd\">\n");
      out.write("\t\t\t\t\t\t<td class=\"sorting_1\">Bruno Nash</td>\n");
      out.write("\t\t\t\t\t\t<td>Software Engineer</td>\n");
      out.write("\t\t\t\t\t\t<td>London</td>\n");
      out.write("\t\t\t\t\t\t<td>38</td>\n");
      out.write("\t\t\t\t\t\t<td>2011/05/03</td>\n");
      out.write("\t\t\t\t\t\t<td>$163,500</td>\n");
      out.write("\t\t\t\t\t</tr><tr role=\"row\" class=\"even\">\n");
      out.write("\t\t\t\t\t\t<td class=\"sorting_1\">Caesar Vance</td>\n");
      out.write("\t\t\t\t\t\t<td>Pre-Sales Support</td>\n");
      out.write("\t\t\t\t\t\t<td>New York</td>\n");
      out.write("\t\t\t\t\t\t<td>21</td>\n");
      out.write("\t\t\t\t\t\t<td>2011/12/12</td>\n");
      out.write("\t\t\t\t\t\t<td>$106,450</td>\n");
      out.write("\t\t\t\t\t</tr><tr role=\"row\" class=\"odd\">\n");
      out.write("\t\t\t\t\t\t<td class=\"sorting_1\">Cara Stevens</td>\n");
      out.write("\t\t\t\t\t\t<td>Sales Assistant</td>\n");
      out.write("\t\t\t\t\t\t<td>New York</td>\n");
      out.write("\t\t\t\t\t\t<td>46</td>\n");
      out.write("\t\t\t\t\t\t<td>2011/12/06</td>\n");
      out.write("\t\t\t\t\t\t<td>$145,600</td>\n");
      out.write("\t\t\t\t\t</tr><tr role=\"row\" class=\"even\">\n");
      out.write("\t\t\t\t\t\t<td class=\"sorting_1\">Cedric Kelly</td>\n");
      out.write("\t\t\t\t\t\t<td>Senior Javascript Developer</td>\n");
      out.write("\t\t\t\t\t\t<td>Edinburgh</td>\n");
      out.write("\t\t\t\t\t\t<td>22</td>\n");
      out.write("\t\t\t\t\t\t<td>2012/03/29</td>\n");
      out.write("\t\t\t\t\t\t<td>$433,060</td>\n");
      out.write("\t\t\t\t\t</tr></tbody>\n");
      out.write("\t\t\t</table>\n");
      out.write("  \n");
      out.write("</body>\n");
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
}
