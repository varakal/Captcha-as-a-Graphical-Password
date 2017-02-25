package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgetpassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<link rel=\"stylesheet\" media=\"screen\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/superfish.css\" /> \r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/nivo-slider.css\" media=\"all\"  /> \r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/tweet.css\" media=\"all\"  />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/style1.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" media=\"all\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/lessframework.css\"/>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- WRAPPER -->\r\n");
      out.write("\t\r\n");
      out.write("\t\t<!-- MAIN -->\r\n");
      out.write("\t\t<div role=\"main\" id=\"main\" class=\"cf\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- headline -->\r\n");
      out.write("\t\t\t<div class=\"headline\">Captcha as Graphical Passwords A New Security Primitive Based on Hard AI Problems</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- ENDS headline --></div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/ForgetPass\" method=\"post\" >\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"uid\"\tplaceholder=\"Please Enter Your Id to Reset Password\" style=\"position: relative;top: 150px;left: 400px;width: 250px;height: 50px;\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t <input type=\"submit\"\r\n");
      out.write("\t\t\t\tvalue=\"Ok\" class=\"button fit scrolly\"\r\n");
      out.write("\t\t\t\tstyle=\"position: relative; top: 200px;left: 200px\"> \r\n");
      out.write("\t\t\t\t<a href=\"\"></a>\r\n");
      out.write("\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
