package org.apache.jsp.Res.JSP.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.amutha.Database.*;

public final class acc_005ftype_005fdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Account Type Details</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");

	String accountType="",desc="",acc_trans_limit="";
	String add="",update="",delete="";
	int accTypeId = 0;
	
	DAO connectobj = new DAO();
	Connection con=connectobj.connector();
	Statement st=(Statement) con.createStatement();
	
	String query="select * from m_acc_type";
	ResultSet rs=st.executeQuery(query);
	
	add=(String) session.getAttribute("add");

	if(add==null)
	{
		
	}
	else if(add=="success")
	{

      out.write("\r\n");
      out.write("\t\t<h2><center><font color=blue><b>Account Type Details Added Successfully !!!<br>\t\r\n");

		session.removeAttribute("add");
	}
	
	update=(String) session.getAttribute("update");

	if(update==null)
	{
		
	}
	else if(update=="success")
	{

      out.write("\r\n");
      out.write("\t\t<h2><center><font color=blue><b>Account Type Details Successfully !!!<br>\r\n");

		session.removeAttribute("update");
	}
	
	delete=(String) session.getAttribute("delete");

	if(delete==null)
	{
		
	}
	else if(delete=="success")
	{

      out.write("\r\n");
      out.write("\t\t<h2><center><font color=blue><b>Account Type Details Deleted Successfully !!!<br>\r\n");
      out.write("\t\t\r\n");

		session.removeAttribute("delete");

	}
	
	else if(delete=="failed")
	{

      out.write("\r\n");
      out.write("\t\t<h2><center><font color=red><b>Account Type Details Deletion Failed!!!<br>\r\n");
      out.write("\t\t\r\n");

		session.removeAttribute("delete");

	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form name=\"acc_type_form\" action=\"adduser.jsp\" method=\"post\">\r\n");
      out.write("    <center>\r\n");
      out.write("<div align=\"left\">\r\n");
      out.write("\t  <table border=\"0\" width=\"100%\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t  <td width=\"100%\">\r\n");
      out.write("\t\t\t<p align=\"center\"><b><font size=\"5\" color=\"#0000CD\">Account Type Details</font></b></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t  </table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br>\r\n");
      out.write("<table align=\"center\" border=\"2\" width=\"100%\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th>\r\n");
      out.write("      <p align=\"center\">Account TypeID</b></font></p>\r\n");
      out.write("    </th>\r\n");
      out.write("    <th>\r\n");
      out.write("      <p align=\"center\">Account Type</b></font></p>\r\n");
      out.write("    </th>\r\n");
      out.write("    <th>\r\n");
      out.write("      <p align=\"center\">Description</font></b></p>\r\n");
      out.write("    </th>\r\n");
      out.write("   <th>\r\n");
      out.write("      <p align=\"center\">Transaction Limit</b></font></p>\r\n");
      out.write("    </th>\r\n");
      out.write("    \r\n");
      out.write("   </tr>\r\n");
      out.write(" ");

	while(rs.next())
	{
		accTypeId=rs.getInt(1);
		accountType=rs.getString(2);
        desc=rs.getString(3);
        acc_trans_limit=rs.getString(4);


      out.write("\r\n");
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"10%\" align=\"center\">");
      out.print(accTypeId );
      out.write("</td>\r\n");
      out.write("    <td width=\"25%\" align=\"center\">");
      out.print(accountType);
      out.write("</td>\r\n");
      out.write("    <td width=\"40%\" align=\"center\">\r\n");
      out.write("      <p align=\"center\">");
      out.print(desc);
      out.write("</p>\r\n");
      out.write("    </td>\r\n");
      out.write("    <td width=\"25%\" align=\"center\">\r\n");
      out.write("      <p align=\"center\">");
      out.print(acc_trans_limit);
      out.write("</p>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");

	
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
