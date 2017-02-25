package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.amutha.Database.*;
import com.amutha.support.*;

public final class gpcheck_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>CGP Check</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"jquery-1.8.0.min.js\">\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" media=\"screen\" href=\"css/superfish.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/nivo-slider.css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/tweet.css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/style1.css\">\r\n");
      out.write("<link rel=\"stylesheet\" media=\"all\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/lessframework.css\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- All JavaScript at the bottom, except this Modernizr build.\r\n");
      out.write("\t   Modernizr enables HTML5 elements & feature detects for optimal performance.\r\n");
      out.write("\t   Create your own custom Modernizr build: www.modernizr.com/download/ -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/modernizr-2.5.3.min.js\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("div.background {\r\n");
      out.write("position:relative;\r\n");
      out.write("    width: 150px;\r\n");
      out.write("    height: 150px;\r\n");
      out.write("    background: url(Test.jpg) repeat;\r\n");
      out.write("    border: 0px solid black;\r\n");
      out.write("    left: 200px;\r\n");
      out.write("    top: 200px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write(" \r\n");
      out.write("<script language=\"JavaScript\" type=\"text/javascript\">\r\n");
      out.write(" \r\n");
      out.write(" function test(data,countd)\r\n");
      out.write(" {\r\n");
      out.write("\r\n");
      out.write("\t if(data==1)\r\n");
      out.write("\t {\r\n");
      out.write("\t\t //alert(data);\r\n");
      out.write("\t \t\tpos_x = event.offsetX ? (event.offsetX) : event.pageX\r\n");
      out.write("\t \t\t\t\t- document.getElementById(\"pointer_1\").offsetLeft;\r\n");
      out.write("\t \t\tpos_y = event.offsetY ? (event.offsetY) : event.pageY\r\n");
      out.write("\t \t\t\t\t- document.getElementById(\"pointer_1\").offsetTop;\r\n");
      out.write("\t \t\tdocument.getElementById(\"img1\").style.left = (pos_x - 1);\r\n");
      out.write("\t \t\tdocument.getElementById(\"img1\").style.top = (pos_y - 15);\r\n");
      out.write("\t \t\tdocument.getElementById(\"img1\").style.visibility = \"visible\";\r\n");
      out.write("\t \t\tdocument.form1.form_x1.value = pos_x;\r\n");
      out.write("\t \t\tdocument.form1.form_y1.value = pos_y; \t\r\n");
      out.write("\r\n");
      out.write("\t \t\tvar imgname = document.getElementById(\"img1\").src;\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t\twindow.location.href = \"gpcheck.jsp?no=\" + 2+\"&x=\"+pos_x+\"&y=\"+pos_y+\"&image_name=\"+imgname+\"&count=\"+countd;\r\n");
      out.write("\t }\r\n");
      out.write("\t else if(data==2)\r\n");
      out.write("\t {\r\n");
      out.write("\t\t //alert(data);\r\n");
      out.write("\t \t\tpos_x = event.offsetX ? (event.offsetX) : event.pageX\r\n");
      out.write("\t \t\t\t\t- document.getElementById(\"pointer_1\").offsetLeft;\r\n");
      out.write("\t \t\tpos_y = event.offsetY ? (event.offsetY) : event.pageY\r\n");
      out.write("\t \t\t\t\t- document.getElementById(\"pointer_1\").offsetTop;\r\n");
      out.write("\t \t\tdocument.getElementById(\"img2\").style.left = (pos_x - 1);\r\n");
      out.write("\t \t\tdocument.getElementById(\"img2\").style.top = (pos_y - 15);\r\n");
      out.write("\t \t\tdocument.getElementById(\"img2\").style.visibility = \"visible\";\r\n");
      out.write("\t \t\tdocument.form1.form_x1.value = pos_x;\r\n");
      out.write("\t \t\tdocument.form1.form_y1.value = pos_y; \t\r\n");
      out.write("\r\n");
      out.write("\t \t\tvar imgname = document.getElementById(\"img2\").src;\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t\twindow.location.href = \"gpcheck.jsp?no=\" + 2+\"&x=\"+pos_x+\"&y=\"+pos_y+\"&image_name=\"+imgname+\"&count=\"+countd;\r\n");
      out.write("\t }\r\n");
      out.write("\t else if(data==3)\r\n");
      out.write("\t {\r\n");
      out.write("\t\t //alert(data);\r\n");
      out.write("\t \t\tpos_x = event.offsetX ? (event.offsetX) : event.pageX\r\n");
      out.write("\t \t\t\t\t- document.getElementById(\"pointer_1\").offsetLeft;\r\n");
      out.write("\t \t\tpos_y = event.offsetY ? (event.offsetY) : event.pageY\r\n");
      out.write("\t \t\t\t\t- document.getElementById(\"pointer_1\").offsetTop;\r\n");
      out.write("\t \t\tdocument.getElementById(\"img3\").style.left = (pos_x - 1);\r\n");
      out.write("\t \t\tdocument.getElementById(\"img3\").style.top = (pos_y - 15);\r\n");
      out.write("\t \t\tdocument.getElementById(\"img3\").style.visibility = \"visible\";\r\n");
      out.write("\t \t\tdocument.form1.form_x1.value = pos_x;\r\n");
      out.write("\t \t\tdocument.form1.form_y1.value = pos_y; \t\r\n");
      out.write("\r\n");
      out.write("\t \t\tvar imgname = document.getElementById(\"img3\").src;\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t\twindow.location.href = \"gpcheck.jsp?no=\" + 2+\"&x=\"+pos_x+\"&y=\"+pos_y+\"&image_name=\"+imgname+\"&count=\"+countd;\r\n");
      out.write("\t }\r\n");
      out.write("\t else if(data==4)\r\n");
      out.write("\t {\r\n");
      out.write("\t\t //alert(data);\r\n");
      out.write("\t \t\tpos_x = event.offsetX ? (event.offsetX) : event.pageX\r\n");
      out.write("\t \t\t\t\t- document.getElementById(\"pointer_1\").offsetLeft;\r\n");
      out.write("\t \t\tpos_y = event.offsetY ? (event.offsetY) : event.pageY\r\n");
      out.write("\t \t\t\t\t- document.getElementById(\"pointer_1\").offsetTop;\r\n");
      out.write("\t \t\tdocument.getElementById(\"img4\").style.left = (pos_x - 1);\r\n");
      out.write("\t \t\tdocument.getElementById(\"img4\").style.top = (pos_y - 15);\r\n");
      out.write("\t \t\tdocument.getElementById(\"img4\").style.visibility = \"visible\";\r\n");
      out.write("\t \t\tdocument.form1.form_x1.value = pos_x;\r\n");
      out.write("\t \t\tdocument.form1.form_y1.value = pos_y; \t\r\n");
      out.write("\r\n");
      out.write("\t \t\tvar imgname = document.getElementById(\"img4\").src;\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t\twindow.location.href = \"gpcheck.jsp?no=\" + 2+\"&x=\"+pos_x+\"&y=\"+pos_y+\"&image_name=\"+imgname+\"&count=\"+countd;\r\n");
      out.write("\t }\r\n");
      out.write("\t else if(data==5)\r\n");
      out.write("\t {\r\n");
      out.write("\t\t// alert(data);\r\n");
      out.write("\t \t\tpos_x = event.offsetX ? (event.offsetX) : event.pageX\r\n");
      out.write("\t \t\t\t\t- document.getElementById(\"pointer_1\").offsetLeft;\r\n");
      out.write("\t \t\tpos_y = event.offsetY ? (event.offsetY) : event.pageY\r\n");
      out.write("\t \t\t\t\t- document.getElementById(\"pointer_1\").offsetTop;\r\n");
      out.write("\t \t\tdocument.getElementById(\"img5\").style.left = (pos_x - 1);\r\n");
      out.write("\t \t\tdocument.getElementById(\"img5\").style.top = (pos_y - 15);\r\n");
      out.write("\t \t\tdocument.getElementById(\"img5\").style.visibility = \"visible\";\r\n");
      out.write("\t \t\tdocument.form1.form_x1.value = pos_x;\r\n");
      out.write("\t \t\tdocument.form1.form_y1.value = pos_y; \t\r\n");
      out.write("\r\n");
      out.write("\t \t\tvar imgname = document.getElementById(\"img5\").src;\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t\twindow.location.href = \"gpcheck.jsp?no=\" + 2+\"&x=\"+pos_x+\"&y=\"+pos_y+\"&image_name=\"+imgname+\"&count=\"+countd;\r\n");
      out.write("\t }\r\n");
      out.write("\t else if(data==6)\r\n");
      out.write("\t {\r\n");
      out.write("\t\t //alert(data);\r\n");
      out.write("\t \t\tpos_x = event.offsetX ? (event.offsetX) : event.pageX\r\n");
      out.write("\t \t\t\t\t- document.getElementById(\"pointer_1\").offsetLeft;\r\n");
      out.write("\t \t\tpos_y = event.offsetY ? (event.offsetY) : event.pageY\r\n");
      out.write("\t \t\t\t\t- document.getElementById(\"pointer_1\").offsetTop;\r\n");
      out.write("\t \t\tdocument.getElementById(\"img6\").style.left = (pos_x - 1);\r\n");
      out.write("\t \t\tdocument.getElementById(\"img6\").style.top = (pos_y - 15);\r\n");
      out.write("\t \t\tdocument.getElementById(\"img6\").style.visibility = \"visible\";\r\n");
      out.write("\t \t\tdocument.form1.form_x1.value = pos_x;\r\n");
      out.write("\t \t\tdocument.form1.form_y1.value = pos_y; \t\r\n");
      out.write("\r\n");
      out.write("\t \t\tvar imgname = document.getElementById(\"img6\").src;\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t\twindow.location.href = \"gpcheck.jsp?no=\" + 2+\"&x=\"+pos_x+\"&y=\"+pos_y+\"&image_name=\"+imgname+\"&count=\"+countd;\r\n");
      out.write("\t }\r\n");
      out.write("\t else if(data==7)\r\n");
      out.write("\t {\r\n");
      out.write("\t\t //alert(data);\r\n");
      out.write("\t \t\tpos_x = event.offsetX ? (event.offsetX) : event.pageX\r\n");
      out.write("\t \t\t\t\t- document.getElementById(\"pointer_1\").offsetLeft;\r\n");
      out.write("\t \t\tpos_y = event.offsetY ? (event.offsetY) : event.pageY\r\n");
      out.write("\t \t\t\t\t- document.getElementById(\"pointer_1\").offsetTop;\r\n");
      out.write("\t \t\tdocument.getElementById(\"img7\").style.left = (pos_x - 1);\r\n");
      out.write("\t \t\tdocument.getElementById(\"img7\").style.top = (pos_y - 15);\r\n");
      out.write("\t \t\tdocument.getElementById(\"img7\").style.visibility = \"visible\";\r\n");
      out.write("\t \t\tdocument.form1.form_x1.value = pos_x;\r\n");
      out.write("\t \t\tdocument.form1.form_y1.value = pos_y; \t\r\n");
      out.write("\r\n");
      out.write("\t \t\tvar imgname = document.getElementById(\"img7\").src;\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t\twindow.location.href = \"gpcheck.jsp?no=\" + 2+\"&x=\"+pos_x+\"&y=\"+pos_y+\"&image_name=\"+imgname;\r\n");
      out.write("\t }\r\n");
      out.write("\t else if(data==8)\r\n");
      out.write("\t {\r\n");
      out.write("\t\t// alert(data);\r\n");
      out.write("\t \t\tpos_x = event.offsetX ? (event.offsetX) : event.pageX\r\n");
      out.write("\t \t\t\t\t- document.getElementById(\"pointer_1\").offsetLeft;\r\n");
      out.write("\t \t\tpos_y = event.offsetY ? (event.offsetY) : event.pageY\r\n");
      out.write("\t \t\t\t\t- document.getElementById(\"pointer_1\").offsetTop;\r\n");
      out.write("\t \t\tdocument.getElementById(\"img8\").style.left = (pos_x - 1);\r\n");
      out.write("\t \t\tdocument.getElementById(\"img8\").style.top = (pos_y - 15);\r\n");
      out.write("\t \t\tdocument.getElementById(\"img8\").style.visibility = \"visible\";\r\n");
      out.write("\t \t\tdocument.form1.form_x1.value = pos_x;\r\n");
      out.write("\t \t\tdocument.form1.form_y1.value = pos_y; \t\r\n");
      out.write("\r\n");
      out.write("\t \t\tvar imgname = document.getElementById(\"img8\").src;\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t\twindow.location.href = \"gpcheck.jsp?no=\" + 2+\"&x=\"+pos_x+\"&y=\"+pos_y+\"&image_name=\"+imgname;\r\n");
      out.write("\t }\r\n");
      out.write("\t else if(data==9)\r\n");
      out.write("\t {\r\n");
      out.write("\t\t //alert(data);\r\n");
      out.write("\t \t\tpos_x = event.offsetX ? (event.offsetX) : event.pageX\r\n");
      out.write("\t \t\t\t\t- document.getElementById(\"pointer_1\").offsetLeft;\r\n");
      out.write("\t \t\tpos_y = event.offsetY ? (event.offsetY) : event.pageY\r\n");
      out.write("\t \t\t\t\t- document.getElementById(\"pointer_1\").offsetTop;\r\n");
      out.write("\t \t\tdocument.getElementById(\"img9\").style.left = (pos_x - 1);\r\n");
      out.write("\t \t\tdocument.getElementById(\"img9\").style.top = (pos_y - 15);\r\n");
      out.write("\t \t\tdocument.getElementById(\"img9\").style.visibility = \"visible\";\r\n");
      out.write("\t \t\tdocument.form1.form_x1.value = pos_x;\r\n");
      out.write("\t \t\tdocument.form1.form_y1.value = pos_y; \t\r\n");
      out.write("\r\n");
      out.write("\t \t\tvar imgname = document.getElementById(\"img9\").src;\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t\twindow.location.href = \"gpcheck.jsp?no=\" + 2+\"&x=\"+pos_x+\"&y=\"+pos_y+\"&image_name=\"+imgname;\r\n");
      out.write("\t }\r\n");
      out.write("\t\r\n");
      out.write(" } \r\n");
      out.write(" \r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");


String num = request.getParameter("no");
System.out.println("List vxdv :"+num);
String user = session.getAttribute("userid").toString();


      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div role=\"main\" id=\"main\" class=\"cf\"><!-- headline -->\r\n");
      out.write("<div class=\"headline\">Captcha as Graphical Passwords A New\r\n");
      out.write("Security Primitive Based on Hard AI Problems</div>\r\n");
      out.write("<!-- ENDS headline --></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<form name=\"form1\">\r\n");
      out.write("\r\n");
      out.write("\r\n");

	
if(num.equals("0"))
{
	System.out.println("List zsfdf :"+num);
	
	ArrayList list = DAO.loginImageName(user);
	System.out.println("imgnm :"+list);
	
	String cou = request.getParameter("count");
	
	System.out.println("count :"+cou);
	
	
	int count = Integer.parseInt(cou);
		
	System.out.println("count :"+count);
		
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"background\" id=\"pointer_1\" style=\"position:relative;top: 100px;left:400px;width: 300px;height: 300px; \" >\r\n");
      out.write("\r\n");
      out.write("<img alt=\"\" id=\"img1\" src=\"");
      out.print(request.getContextPath());
      out.write("/Res/SourceImage/");
      out.print(list.get(0));
      out.write("\" onclick=\"test('1',");
      out.print(count);
      out.write(")\" >\r\n");
      out.write("<img alt=\"\" id=\"img2\" src=\"");
      out.print(request.getContextPath());
      out.write("/Res/SourceImage/");
      out.print(list.get(1));
      out.write("\" style=\"position: absolute;left: 100px;\" onclick=\"test('2',");
      out.print(count);
      out.write(")\">\r\n");
      out.write("<img alt=\"\" id=\"img3\" src=\"");
      out.print(request.getContextPath());
      out.write("/Res/SourceImage/");
      out.print(list.get(2));
      out.write("\" style=\"position: absolute;left: 200px;\" onclick=\"test('3',");
      out.print(count);
      out.write(")\">\r\n");
      out.write("\r\n");
      out.write("<img alt=\"\"  id=\"img4\" src=\"");
      out.print(request.getContextPath());
      out.write("/Res/SourceImage/");
      out.print(list.get(3));
      out.write("\" style=\"position: absolute;top: 100px;left:0px;\" onclick=\"test('4',");
      out.print(count);
      out.write(")\" >\r\n");
      out.write("<img alt=\"\" id=\"img5\" src=\"");
      out.print(request.getContextPath());
      out.write("/Res/SourceImage/");
      out.print(list.get(4));
      out.write("\" style=\"position: absolute;top: 100px;left: 100px;\" onclick=\"test('5',");
      out.print(count);
      out.write(")\">\r\n");
      out.write("<img alt=\"\"  id=\"img6\" src=\"");
      out.print(request.getContextPath());
      out.write("/Res/SourceImage/");
      out.print(list.get(5));
      out.write("\" style=\"position: absolute;top: 100px;left: 200px;\" onclick=\"test('6',");
      out.print(count);
      out.write(")\">\r\n");
      out.write("\r\n");
      out.write("<img alt=\"\" id=\"img7\" src=\"");
      out.print(request.getContextPath());
      out.write("/Res/SourceImage/");
      out.print(list.get(6));
      out.write("\" style=\"position: absolute;top: 200px;left: 0px;\" onclick=\"test('7',");
      out.print(count);
      out.write(")\">\r\n");
      out.write("<img alt=\"\" id=\"img8\" src=\"");
      out.print(request.getContextPath());
      out.write("/Res/SourceImage/");
      out.print(list.get(7));
      out.write("\" style=\"position: absolute;top: 200px;left: 100px;\" onclick=\"test('8',");
      out.print(count);
      out.write(")\">\r\n");
      out.write("<img alt=\"\" id=\"img9\" src=\"");
      out.print(request.getContextPath());
      out.write("/Res/SourceImage/");
      out.print(list.get(8));
      out.write("\" style=\"position: absolute;top: 200px;left: 200px;\"  onclick=\"test('9',");
      out.print(count);
      out.write(")\">\r\n");
      out.write("\r\n");
      out.write("<br></br>\r\n");
      out.write("<div style=\"position: absolute;top: 200px;left: 10px;width: 300px\">\r\n");
      out.write("  <input type=\"hidden\" name=\"form_x1\" size=\"4\" />\r\n");
      out.write(" <input type=\"hidden\" name=\"form_y1\" size=\"4\" />\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\t\r\n");
      out.write("\t");

	//}
	}

      out.write('\r');
      out.write('\n');



if(num.trim().equals("2"))
{
	
	System.out.println("===================================================");
	
	
	String x = request.getParameter("x");
	String y = request.getParameter("y");
	
	System.out.println("x val 11111111111:"+x+"y val :"+y);
	
	String img_name = request.getParameter("image_name");
	
	System.out.println("img_name :"+img_name);
	
	String cou = request.getParameter("count");
	
	if(x!=null&&y!=null&&img_name!=null&&cou!=null)
	{

		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("count :"+cou);
		
		int count = Integer.parseInt(request.getParameter("count"));
		
		System.out.println("count :"+count);
		
		
		img_name = img_name.substring(69,img_name.length());
		
		System.out.println("img_name :"+img_name);
		
		
		int xval=Integer.parseInt(x)/40;
		int yval=Integer.parseInt(y)/40;
		
		System.out.println("xval :"+xval+"yval "+yval);
		
		DAO.updateUserImage(img_name,xval,yval,x,y);
		
		System.out.println("img_name  :"+img_name+"x val :"+x+"y Val :"+y);
		
		int totalcount = UserDAO.getCount(user);
		
		if(totalcount==count)
		{
			System.out.println("Complete");
			
			RequestDispatcher rd=null;
			
		boolean flag = false;
			
			String uid = session.getAttribute("userid").toString();
			
			
			int hkey = RandomValue.hash_key();
			
			StringBuffer sb = new StringBuffer();
			List user_coordinates = UserDAO.getImagecode1(uid);
			
			 Collections.sort(user_coordinates);
			 
			 System.out.println("user_coordinates :"+user_coordinates);
			 
			 for(int i=0;i<user_coordinates.size();i++)
			 {
				 sb.append(user_coordinates.get(i)+"~"); 
			 }
			
			 System.out.println("USer Cordinated :"+sb.toString());
			// Login MAC Creation
			String has_mac = HashingTechnique.MD5(sb.toString());
			System.out.println("login has_mac------>>>"+has_mac);
			
			String dbhashmac = UserDAO.getHashMac(uid.trim());
			
			System.out.println("DB dbhashmac------>>>"+dbhashmac);
			
			if(dbhashmac.equals(has_mac))
			{
				System.out.println("------------ CGP Check Success ------------");
				
				//rd = request.getRequestDispatcher("/Res/JSP/userhome.jsp?no=1");
				//rd.forward(request,response);
				
      out.write("\r\n");
      out.write("\t\t\t\t<script>\r\n");
      out.write("\r\n");
      out.write("\t\t\t   //alert(\"Login Success!!!\");\r\n");
      out.write("\t\t\t    window.location.href = \"Res/JSP/userhome.jsp?no=1\";\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\r\n");
      out.write("\t\t\t   </script>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t");

			}
			else
			{
				System.out.println("-------------- CGP Check Failure -----------");
				
      out.write("\r\n");
      out.write("\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\twindow.location.href = \"index.jsp?no=3\";\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t");

				
			}
		}
		else
		{
			count++;
			System.out.println("count :"+count);
			System.out.println("Not Complete");	
			
		}
		

		

		
      out.write("\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\r\n");
      out.write("\tvar x=");
      out.print(count);
      out.write(";\r\n");
      out.write("\t// alert(x);\r\n");
      out.write("\t///if (confirm(\"Do you want click one more clicks\") == true)\r\n");
      out.write("\t// {\r\n");
      out.write("\t  //  x = \"OK\";\r\n");
      out.write("\t    window.location.href = \"gpcheck.jsp?no=\"+0+\"&count=\"+x;\r\n");
      out.write("\t//} \r\n");
      out.write("\t//else {\r\n");
      out.write("\t   // x = \"Cancel\";\r\n");
      out.write("\t   // window.location.href = \"gpcheck_new.jsp?no=\"+3+\"&x=\"+x;\r\n");
      out.write("\t//}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");



}
else
{
	
	
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\twindow.location.href = \"index.jsp?no=4\";\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t");

	
}


}



      out.write("\r\n");
      out.write("\r\n");
      out.write("</form>\t\r\n");
      out.write("\r\n");
      out.write("<!-- Grab Google CDN's jQuery, with a protocol relative URL; fall back to local if offline -->\r\n");
      out.write("<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\"></script>\r\n");
      out.write("<script>window.jQuery || document.write('<script src=\"js/jquery-1.7.1.min.js\"><\\/script>')</script>\r\n");
      out.write("\r\n");
      out.write("<!-- scripts concatenated and minified via build script -->\r\n");
      out.write("<script src=\"js/custom.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- superfish -->\r\n");
      out.write("<script src=\"js/superfish-1.4.8/js/hoverIntent.js\"></script>\r\n");
      out.write("<script src=\"js/superfish-1.4.8/js/superfish.js\"></script>\r\n");
      out.write("<script src=\"js/superfish-1.4.8/js/supersubs.js\"></script>\r\n");
      out.write("<!-- ENDS superfish -->\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/tweet/jquery.tweet.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.isotope.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.nivo.slider.js\"></script>\r\n");
      out.write("<script src=\"js/css3-mediaqueries.js\"></script>\r\n");
      out.write("<script src=\"js/tabs.js\"></script>\r\n");
      out.write("<script src=\"js/poshytip-1.1/src/jquery.poshytip.min.js\"></script>\r\n");
      out.write("<!-- end scripts -->\r\n");
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
