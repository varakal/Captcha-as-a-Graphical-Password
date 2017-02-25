package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.amutha.support.Utility;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {



	String signoutstatus="";



	String loginstatus="",passstatus="",mergeSatus="",mergingStatus="",share1_file="",share2_file="";

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

      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<!--\r\n");
      out.write("\tTwenty by HTML5 UP\r\n");
      out.write("\thtml5up.net | @n33co\r\n");
      out.write("\tFree for personal and commercial use under the CCA 3.0 license (html5up.net/license)\r\n");
      out.write("-->\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>Login Page</title>\r\n");
      out.write("\t\t<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t\t<meta name=\"description\" content=\"\" />\r\n");
      out.write("\t\t<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/skel.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/skel-layers.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/init.js\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<noscript>\r\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/skel.css\" />\r\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/style.css\" />\r\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/style-wide.css\" />\r\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/style-noscript.css\" />\r\n");
      out.write("\t\t</noscript>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/jquery.toastmessage.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/jquery.toastmessage.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t<link href='http://fonts.googleapis.com/css?family=Bowlby+One+SC' rel='stylesheet' type='text/css'>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/normalize.css\" type=\"text/css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/style.css\" type=\"text/css\">\r\n");
      out.write("\t<link rel=\"author\" href=\"https://plus.google.com/107766061849006545830\"/>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery-1.9.1.min.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery.lettering-0.6.1.min.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery.scrollorama.js\"></script>\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t.main\r\n");
      out.write("\t{\r\n");
      out.write("\tfont-family: mensch;\r\n");
      out.write("  line-height: 1.3em;\r\n");
      out.write("  font-size: 46px;\r\n");
      out.write("  color: #ffffff;\r\n");
      out.write("  text-shadow: 5px 5px 5px #d96c4b;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  margin-bottom: 20px;\r\n");
      out.write("  margin-top: -140px;\r\n");
      out.write("  margin-right: 20px;\r\n");
      out.write("  margin-left:50px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t</style>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</head>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");

signoutstatus=request.getParameter("signoutstatus");
System.out.println("signoutstatus "+signoutstatus);




      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	loginstatus=request.getParameter("loginstatus");
	passstatus=(String)request.getAttribute("passstatus");
	mergeSatus=(String)request.getAttribute("mergeSatus");
	mergingStatus=(String)request.getAttribute("mergingStatus");

      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<body class=\"index\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<!-- Header -->\r\n");
      out.write("\t\t\t<header id=\"header\" class=\"alt\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<nav id=\"nav\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index.jsp\" class=\"button special\">Admin</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index1.jsp\" class=\"button special\">User</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t</header>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Banner -->\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<section id=\"banner\" >\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"main\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<h>Captcha as Graphical Passwords A New Security Primitive Based on Hard AI Problems</h>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--\r\n");
      out.write("\t\t\t\t\t\".inner\" is set up as an inline-block so it automatically expands\r\n");
      out.write("\t\t\t\t\tin both directions to fit whatever's inside it. This means it won't\r\n");
      out.write("\t\t\t\t\tautomatically wrap lines, so be sure to use line breaks where\r\n");
      out.write("\t\t\t\t\tappropriate (<br />).\r\n");
      out.write("\t\t\t\t-->\r\n");
      out.write("\t\t\t\t<div class=\"inner\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/AdminLogin\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<header>\r\n");
      out.write("\t\t\t\t\t\t<h2>Admin Login</h2>\r\n");
      out.write("\t\t\t\t\t</header>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tID\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"adminid\" placeholder=\"Please Enter Id\" >\r\n");
      out.write("\t\t\t\t\tPassword\r\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"pwd\" placeholder=\"Please Enter Password\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Login\" class=\"button fit scrolly\" style=\"position: relative;top: 10px;\" >\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");

	if(signoutstatus==null)
	{
		
	}

	else if(signoutstatus.equals("success"))
	{
		
      out.write("\r\n");
      out.write("\t\t<div style=\"top:500px;position: absolute;left: 100px;\"><font color=red>Logged out Successfully!!!</font></div>\r\n");
      out.write("\t\r\n");
	
	session.removeAttribute("signoutstatus");
	}


      out.write('\r');
      out.write('\n');

	if(loginstatus==null)
	{
		
	}

	else if(loginstatus.equals("failed"))
	{
		
      out.write("\r\n");
      out.write("\t<br><br><br>\t\r\n");
      out.write("\t<center><h4><font color=red>Login Failed, Invalid User!!!</font></h4></center>\r\n");

	}


      out.write(" \t   \r\n");
      out.write(" ");

			if(Utility.parse(request.getParameter("no"))==5)
			{
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div  style=\"position: absolute;top: 500px;left: 300px;color: #336633;font-size: 20px; \">\t\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t $().toastmessage('showErrorToast', \"Sorry this user id is already exists.....!\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</script></div>\t\t\r\n");
      out.write("\t\t\t");
}

		
      out.write("\r\n");
      out.write("\t\t\r\n");
	
		int no=Utility.parse(request.getParameter("no"));
System.out.println("No :"+no);
		if(no==1)
		{
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t alert(\"Invalid id and password!\");\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t</script>\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t");
}
		if(no==3)
		{
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t alert(\"Captcha Click Point is wrong,Please try again!\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</script>\t\t\r\n");
      out.write("\t\t");
}
		if(no==4)
		{
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t alert(\"Please Click Properly!\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</script>\t\t\r\n");
      out.write("\t\t");
}
			
			
		if(no==2)
		{
			
		
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t alert(\"You have Logged Out Successfully!\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</script>\t\t\r\n");
      out.write("\t\t");

		}
		
		
	
      out.write("\r\n");
      out.write("             \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
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
