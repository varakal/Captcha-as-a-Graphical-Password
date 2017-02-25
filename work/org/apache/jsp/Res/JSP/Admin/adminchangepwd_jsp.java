package org.apache.jsp.Res.JSP.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.amutha.support.Utility;

public final class adminchangepwd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     \r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Admin Change Password Page</title>\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\r\n");
      out.write("\tfunction window_Onload()\r\n");
      out.write(" \t{\r\n");
      out.write(" \t     document.changepasswordform.old_password.focus();\r\n");
      out.write(" \t     document.changepasswordform.old_password.value=\"\";\r\n");
      out.write(" \t     document.changepasswordform.new_password.value=\"\";\r\n");
      out.write("   \t     document.changepasswordform.confirm_password.value=\"\";\r\n");
      out.write("     \r\n");
      out.write(" \t}\r\n");
      out.write(" \t\r\n");
      out.write(" \tfunction checkFormValidator()\r\n");
      out.write(" \t{\r\n");
      out.write(" \t\tif(document.changepasswordform.old_password.value==\"\")\r\n");
      out.write(" \t\t{\r\n");
      out.write(" \t\t\talert(\"Plese Enter your Old Password\");\r\n");
      out.write(" \t\t\tdocument.changepasswordform.old_password.focus();\r\n");
      out.write(" \t\t\treturn false;\r\n");
      out.write(" \t\t}\r\n");
      out.write(" \t\t\r\n");
      out.write(" \t\telse if(document.changepasswordform.new_password.value==\"\")\r\n");
      out.write(" \t\t{\r\n");
      out.write(" \t\t\talert(\"Plese Enter your New Password\");\r\n");
      out.write(" \t\t\tdocument.changepasswordform.new_password.focus();\r\n");
      out.write(" \t\t\treturn false;\r\n");
      out.write(" \t\t}\r\n");
      out.write(" \t\t\r\n");
      out.write(" \t\telse if(document.changepasswordform.confirm_password.value==\"\")\r\n");
      out.write(" \t\t{\r\n");
      out.write(" \t\t\talert(\"Plese Enter Confirm Password\");\r\n");
      out.write(" \t\t\tdocument.changepasswordform.confirm_password.focus();\r\n");
      out.write(" \t\t\treturn false;\r\n");
      out.write(" \t\t}\r\n");
      out.write(" \t\t\t\t\r\n");
      out.write(" \t}\r\n");
      out.write("\r\n");
      out.write("\tfunction checkPassword()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar newpassword=document.getElementById(\"new_password\").value;\r\n");
      out.write("\t\tvar confirmpassword=document.getElementById(\"confirm_password\").value;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(newpassword!=confirmpassword)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"Password Mismatch\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"new_password\").value=\"\";\r\n");
      out.write("\t\t\tdocument.getElementById(\"confirm_password\").value=\"\";\r\n");
      out.write("\t\t\tdocument.getElementById(\"new_password\").focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
 String admin_id=(String) session.getAttribute("admin_id");
      out.write("\r\n");
      out.write("<body onload=\"window_Onload()\">\r\n");
      out.write("<form name=\"changepasswordform\" method=post action=\"");
      out.print(request.getContextPath());
      out.write("/adminchangepwdaction\" onsubmit=\"return checkFormValidator()\">\r\n");
      out.write("\r\n");
      out.write("\t\t<center>\r\n");
      out.write("            <div align=\"left\">\r\n");
      out.write("\t  <table border=\"0\" width=\"100%\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t  <td width=\"100%\">\r\n");
      out.write("\t\t\t<p align=\"center\"><b><font size=\"5\" color=\"#0000CD\">Change Password</font></b></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t  </table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br>\r\n");
      out.write("    <div align=\"center\">\r\n");
      out.write("\t  <center>\r\n");
      out.write("\t  <table border=\"1\" width=\"40%\"> \r\n");
      out.write("\t\t <tr>\r\n");
      out.write("\t\t  <td width=\"100%\"><br>&nbsp;User ID &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"admin_id\" value=\"");
      out.print(admin_id);
      out.write("\" readonly size=\"20\"> <br><br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t&nbsp;Old Password  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<input type=\"password\" name=\"old_password\" size=\"20\"> <br><br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t&nbsp;New Password &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<input type=\"password\" name=\"new_password\" size=\"20\"> <br><br>\r\n");
      out.write("\t\t   \r\n");
      out.write("            &nbsp;Confirm Password &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<input type=\"password\" name=\"confirm_password\" size=\"20\">\r\n");
      out.write("\t\t\t<br><br>\r\n");
      out.write("\t\t  </td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t  </table>\r\n");
      out.write("  \t</div>\r\n");
      out.write("  \t<br>\r\n");
      out.write("<input type=\"submit\" value=\"Submit\" name=\"B1\" onclick=\"return checkPassword()\">\r\n");
      out.write(" <input type=\"reset\" value=\"Reset\" name=\"B2\">\r\n");
      out.write(" </center>\r\n");
      out.write("</form>\r\n");

	if(Utility.parse(request.getParameter("no"))==1)
	{

      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\talert(\"Password have Changed Successfully!!\");\r\n");
      out.write("\t\t</script>\t\t\t\r\n");

	}
	if(Utility.parse(request.getParameter("no"))==2)
	{

      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\talert(\"Opps,Something Went Wrong Try Again Latter!!!!!\");\r\n");
      out.write("\t\t</script>\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");

	}
	if(Utility.parse(request.getParameter("no"))==3)
	{

      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\talert(\"Old Password Mismatch!!!\");\r\n");
      out.write("\t\t</script>\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");

	}
	if(Utility.parse(request.getParameter("no"))==4)
	{

      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\talert(\"New Password and Confirm Password is Mismatch!!!\");\r\n");
      out.write("\t\t</script>\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");

	}
	

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
