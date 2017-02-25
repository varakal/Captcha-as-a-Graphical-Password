package org.apache.jsp.Res.JSP.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!doctype html>\n");
      out.write("<!-- paulirish.com/2008/conditional-stylesheets-vs-css-hacks-answer-neither/ -->\n");
      out.write("<!--[if lt IE 7]> <html class=\"no-js lt-ie9 lt-ie8 lt-ie7\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if IE 7]>    <html class=\"no-js lt-ie9 lt-ie8\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if IE 8]>    <html class=\"no-js lt-ie9\" lang=\"en\"> <![endif]-->\n");
      out.write("<!-- Consider adding a manifest.appcache: h5bp.com/d/Offline -->\n");
      out.write("<!--[if gt IE 8]><!-->\n");
      out.write("<html class=\"no-js\" lang=\"en\">\n");
      out.write("<!--<![endif]-->\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("\n");
      out.write("<title>Admin Home</title>\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("\n");
      out.write("<!-- Mobile viewport optimized: h5bp.com/viewport -->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" media=\"screen\" href=\"css/superfish.css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/nivo-slider.css\" media=\"all\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/tweet.css\" media=\"all\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style1.css\">\n");
      out.write("<link rel=\"stylesheet\" media=\"all\" href=\"css/lessframework.css\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- All JavaScript at the bottom, except this Modernizr build.\n");
      out.write("\t   Modernizr enables HTML5 elements & feature detects for optimal performance.\n");
      out.write("\t   Create your own custom Modernizr build: www.modernizr.com/download/ -->\n");
      out.write("<script src=\"js/modernizr-2.5.3.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- WRAPPER -->\n");
      out.write("<div class=\"wrapper cf\">\n");
      out.write("\n");
      out.write("<header class=\"cf\"> <!-- MAIN -->\n");
      out.write("<div role=\"main\" id=\"main\" class=\"cf\"><!-- headline -->\n");
      out.write("<div class=\"headline\">Captcha as Graphical Passwords A New\n");
      out.write("Security Primitive Based on Hard AI Problems</div>\n");
      out.write("<!-- ENDS headline --></div>\n");
      out.write("\n");
      out.write("<!-- nav --> <nav class=\"cf\">\n");
      out.write("<ul id=\"nav\" class=\"sf-menu\">\n");
      out.write("\t<li class=\"current-menu-item\"><a\n");
      out.write("\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/Res/JSP/Admin/acc_type_details.jsp\" target=\"myhome\"><span>Account Type</span></a></li>\n");
      out.write("\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/Res/JSP/Admin/account_details.jsp\" target=\"myhome\"><span>Account Details</span></a></li>\n");
      out.write("\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/Res/JSP/Admin/branch_details.jsp\" target=\"myhome\"><span>Branch Details</span></a></li>\n");
      out.write("\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/Res/JSP/Admin/adminchangepwd.jsp\" target=\"myhome\"><span>Change Password</span></a></li>\n");
      out.write("\n");
      out.write("\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/SignOut?no=1\"><span>LogOut</span></a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("</nav> <!-- ends nav -->\n");
      out.write(" </header> <!-- MAIN -->\n");
      out.write("<div role=\"main\" id=\"main\" class=\"cf\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<div><iframe\n");
      out.write("\tstyle=\"position: relative; width: 900px; height: 455px;left: 50px;top: -10px;\" name=\"myhome\">\n");
      out.write("\n");
      out.write("</iframe></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- ENDS MAIN --></div>\n");
      out.write("<!-- ENDS WRAPPER -->\n");
      out.write("\n");
      out.write("<!-- JavaScript at the bottom for fast page loading -->\n");
      out.write("\n");
      out.write("<!-- Grab Google CDN's jQuery, with a protocol relative URL; fall back to local if offline -->\n");
      out.write("<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\"></script>\n");
      out.write("<script>window.jQuery || document.write('<script src=\"js/jquery-1.7.1.min.js\"><\\/script>')</script>\n");
      out.write("\n");
      out.write("<!-- scripts concatenated and minified via build script -->\n");
      out.write("<script src=\"js/custom.js\"></script>\n");
      out.write("\n");
      out.write("<!-- superfish -->\n");
      out.write("<script src=\"js/superfish-1.4.8/js/hoverIntent.js\"></script>\n");
      out.write("<script src=\"js/superfish-1.4.8/js/superfish.js\"></script>\n");
      out.write("<script src=\"js/superfish-1.4.8/js/supersubs.js\"></script>\n");
      out.write("<!-- ENDS superfish -->\n");
      out.write("\n");
      out.write("<script src=\"js/tweet/jquery.tweet.js\"></script>\n");
      out.write("<script src=\"js/jquery.isotope.min.js\"></script>\n");
      out.write("<script src=\"js/jquery.nivo.slider.js\"></script>\n");
      out.write("<script src=\"js/css3-mediaqueries.js\"></script>\n");
      out.write("<script src=\"js/tabs.js\"></script>\n");
      out.write("<script src=\"js/poshytip-1.1/src/jquery.poshytip.min.js\"></script>\n");
      out.write("<!-- end scripts -->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
