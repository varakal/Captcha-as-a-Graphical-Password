package org.apache.jsp.Res.JSP.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.amutha.support.Utility;

public final class reg_005fget_005fbenificiary_005fdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Add Branch</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");

	String existenceStatus="",getAccInfo="";
	String add="",accountNumber="",accountHolderName=""; 
	

      out.write("\r\n");
      out.write("\r\n");
	
	
	accountNumber=(String) session.getAttribute("acc_no");
    accountHolderName=(String) session.getAttribute("acc_name");
	existenceStatus=(String) session.getAttribute("existenceStatus");

	if(existenceStatus==null)
	{
		
	}
	else if(existenceStatus=="Yes")
	{

      out.write("\r\n");
      out.write("\t\t<h2><center><font color=red><b>Sorry,This Account Number Does not Exists!</b></font></center></h2>\r\n");

		session.removeAttribute("existenceStatus");
	}
	

      out.write("\r\n");
      out.write("\r\n");
      out.write("<form name=\"reg_benificiary\" method=\"post\" action=\"");
      out.print(request.getContextPath());
      out.write("/ConfirmBenificiary\">\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("   \r\n");
      out.write("\t<div align=\"left\">\r\n");
      out.write("\t  <table border=\"0\" width=\"100%\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t  <td width=\"100%\">\r\n");
      out.write("\t\t\t<p align=\"center\"><b><font size=\"5\" >Register Benificiary </font></b></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t  </table>\r\n");
      out.write("\t  \r\n");
      out.write("\t  <hr>\r\n");
      out.write("\t  \r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t  <center>\r\n");
      out.write("\t  <br>\r\n");
      out.write("\t  <table border=\"0\" width=\"50%\">\r\n");
      out.write("\t  \r\n");
      out.write("\t   <tr align=\"center\">\r\n");
      out.write("\t\t \t\t<td colspan=\"3\" align=\"center\">\r\n");
      out.write("\t\t \t\t\t\t<font color=\"green\" size=\"5\">Check Benificiary Account Details</font>\r\n");
      out.write("\t\t \t\t</td>\r\n");
      out.write("\t\t \t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr align=\"center\">\r\n");
      out.write("\t\t    <td colspan=\"3\">\r\n");
      out.write("\t\t    \t<hr>\r\n");
      out.write("\t\t    </td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr height=\"20px\">\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t  \r\n");
      out.write("\t\t<tr align=\"center\">\r\n");
      out.write("\t\t \t\t<td width=\"150px\">\r\n");
      out.write("\t\t \t\t\t\tAccount Number\r\n");
      out.write("\t\t \t\t</td>\r\n");
      out.write("\t\t \t\t\r\n");
      out.write("\t\t \t\t<td>\r\n");
      out.write("\t\t \t\t\t\t:\r\n");
      out.write("\t\t \t\t</td>\r\n");
      out.write("\t\t \t\t\r\n");
      out.write("\t\t \t\t<td width=\"200px\">\r\n");
      out.write("\t\t \t\t\t\t");
      out.print( accountNumber );
      out.write("\r\n");
      out.write("\t\t \t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr align=\"center\">\r\n");
      out.write("\t\t \t\t<td width=\"150px\">\r\n");
      out.write("\t\t \t\t\t\tAccount Holder Name\r\n");
      out.write("\t\t \t\t</td>\r\n");
      out.write("\t\t \t\t\r\n");
      out.write("\t\t \t\t<td >\r\n");
      out.write("\t\t \t\t\t\t:\r\n");
      out.write("\t\t \t\t</td>\r\n");
      out.write("\t\t \t\t\r\n");
      out.write("\t\t \t\t<td width=\"200px\">\r\n");
      out.write("\t\t \t\t\t\t");
      out.print( accountHolderName );
      out.write("\r\n");
      out.write("\t\t \t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr height=\"20px\" align=\"center\"></tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t\t<td align=\"center\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t        \r\n");
      out.write("\t\t\t\t        <input type=\"hidden\" name=\"acc_no\" value=\"");
      out.print(accountNumber );
      out.write("\"/>\r\n");
      out.write("\t\t\t\t        <input type=\"hidden\" name=\"acc_name\" value=\"");
      out.print(accountHolderName );
      out.write("\"/>\r\n");
      out.write("\t\t\t\t        <input type=\"submit\" name=\"RegAction\" value=\"Cancel\" />\r\n");
      out.write("\t\t\t\t        <input type=\"submit\" name=\"RegAction\" value=\"Confirm Registeration\"  />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t  </table>\r\n");
      out.write("\t  </center>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</center>\r\n");
      out.write("   \r\n");
      out.write("</form>\r\n");
      out.write("\r\n");

	if(Utility.parse(request.getParameter("no"))==1)
	{

      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\talert(\"URN Number Successfully Sent to your mobile.  Now You Can Confirm Benificiary by providing the URN Number through Confirn/Reject Link.!!\");\r\n");
      out.write("\t\t</script>\t\t\t\r\n");

	}
	if(Utility.parse(request.getParameter("no"))==2)
	{

      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\talert(\"Opps,Unable to Send URN Number to MobileNumber !!!!!!!\");\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t\r\n");
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
