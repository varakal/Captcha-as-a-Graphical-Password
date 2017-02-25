package org.apache.jsp.Res.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--[if gt IE 8]><!--> <html class=\"no-js\" lang=\"en\"> <!--<![endif]-->\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t\t\n");
      out.write("\t<title>User Home</title>\n");
      out.write("\t<meta name=\"description\" content=\"\">\n");
      out.write("\t\n");
      out.write("\t<!-- Mobile viewport optimized: h5bp.com/viewport -->\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<link rel=\"stylesheet\" media=\"screen\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/superfish.css\" /> \n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/nivo-slider.css\" media=\"all\"  /> \n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/tweet.css\" media=\"all\"  />\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/style1.css\">\n");
      out.write("\t<link rel=\"stylesheet\" media=\"all\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/lessframework.css\"/>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<!-- All JavaScript at the bottom, except this Modernizr build.\n");
      out.write("\t   Modernizr enables HTML5 elements & feature detects for optimal performance.\n");
      out.write("\t   Create your own custom Modernizr build: www.modernizr.com/download/ -->\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/modernizr-2.5.3.min.js\"></script>\n");
      out.write("</head>\n");


String num = request.getParameter("no");

if(num.trim().equals("1"))
{
	
      out.write("\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\talert(\"Login Success\")\n");
      out.write("\t</script>\n");
      out.write("\t\n");
      out.write("\t");

}
	
      out.write("\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("\t<!-- WRAPPER -->\n");
      out.write("\t<div class=\"wrapper cf\" >\n");
      out.write("\t\t<header class=\"cf\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- MAIN -->\n");
      out.write("\t\t<div role=\"main\" id=\"main\" class=\"cf\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- headline -->\n");
      out.write("\t\t\t<div class=\"headline\">Captcha as Graphical Passwords A New Security Primitive Based on Hard AI Problems</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- ENDS headline --></div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- nav -->\n");
      out.write("\t\t\t<nav class=\"cf\">\n");
      out.write("\t\t\t\t<ul id=\"nav\" class=\"sf-menu\">\n");
      out.write("\t\t\t\t\t<li class=\"current-menu-item\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/Res/JSP/User/userprofile.jsp\" target=\"myhome\"><span>User Profile</span></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/Res/JSP/User/balance_enquiry.jsp\" target=\"myhome\"><span>Balance Enquiry</span></a>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/Res/JSP/User/mini_statement.jsp\"target=\"myhome\"><span>Mini Statement</span></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\" ><span>Fund Transfer</span></a>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/Res/JSP/User/register_benificiary.jsp\" target=\"myhome\">Register Benificiary</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/Res/JSP/User/confirm_benificiary.jsp\"target=\"myhome\">Confirm/Reject Benificiary</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/Res/JSP/User/make_payment.jsp\" target=\"myhome\">Make Payment</a></li>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/Res/JSP/User/transaction.jsp\" target=\"myhome\"><span>Transactions</span></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/SignOut?no=1\"><span>LogOut</span></a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</header>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- MAIN -->\n");
      out.write("\t\t<div role=\"main\" id=\"main\" class=\"cf\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div><iframe\n");
      out.write("\tstyle=\"position: relative; width: 800px; height: 450px;left: 100px;\" name=\"myhome\">\n");
      out.write("\n");
      out.write("</iframe></div>\n");
      out.write("  \t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- ENDS MAIN -->\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<!-- ENDS WRAPPER -->\n");
      out.write("\t\n");
      out.write("\t<!-- JavaScript at the bottom for fast page loading -->\n");
      out.write("\t\n");
      out.write("\t<!-- Grab Google CDN's jQuery, with a protocol relative URL; fall back to local if offline -->\n");
      out.write("\t<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\"></script>\n");
      out.write("\t<script>window.jQuery || document.write('<script src=\"js/jquery-1.7.1.min.js\"><\\/script>')</script>\n");
      out.write("\t\n");
      out.write("\t<!-- scripts concatenated and minified via build script -->\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/custom.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- superfish -->\n");
      out.write("\t<script  src=\"");
      out.print(request.getContextPath());
      out.write("/js/superfish-1.4.8/js/hoverIntent.js\"></script>\n");
      out.write("\t<script  src=\"");
      out.print(request.getContextPath());
      out.write("/js/superfish-1.4.8/js/superfish.js\"></script>\n");
      out.write("\t<script  src=\"");
      out.print(request.getContextPath());
      out.write("/js/superfish-1.4.8/js/supersubs.js\"></script>\n");
      out.write("\t<!-- ENDS superfish -->\n");
      out.write("\t\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/tweet/jquery.tweet.js\" ></script>\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery.isotope.min.js\"></script>\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery.nivo.slider.js\" ></script>\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/css3-mediaqueries.js\"></script>\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/tabs.js\"></script>\n");
      out.write("\t<script  src=\"");
      out.print(request.getContextPath());
      out.write("/js/poshytip-1.1/src/jquery.poshytip.min.js\"></script>\n");
      out.write("\t<!-- end scripts -->\n");
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
