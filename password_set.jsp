<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
     <%@ page import="java.util.*" %>
    <%@page import="com.amutha.Database.*"%>
    <%@page import="com.amutha.support.*"%>
    <%@page import="com.amutha.imageprocess.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GPCheck</title>
<script type="text/javascript" src="jquery-1.8.0.min.js">
    </script>
    
		

<link rel="stylesheet" media="screen" href="css/superfish.css" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/nivo-slider.css" media="all" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/tweet.css" media="all" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/style1.css">
<link rel="stylesheet" media="all" href="<%=request.getContextPath()%>/css/lessframework.css" />


<!-- All JavaScript at the bottom, except this Modernizr build.
	   Modernizr enables HTML5 elements & feature detects for optimal performance.
	   Create your own custom Modernizr build: www.modernizr.com/download/ -->
<script src="<%=request.getContextPath()%>/js/modernizr-2.5.3.min.js"></script>
		
		
<style type="text/css">

div.background {
position:relative;
    width: 150px;
    height: 150px;
    background: url(Test.jpg) repeat;
    border: 0px solid black;
    left: 200px;
    top: 200px;
}


}
</style>
 <%

String num = request.getParameter("no");
String userid = request.getParameter("user");

System.out.println("List vxdv :"+userid);
//ArrayList list = (ArrayList)request.getAttribute("img");



%>
<script language="JavaScript" type="text/javascript">
 
 function test(data,userid)
 {

	 if(data==1)
	 {
		 //alert(data);
	 		pos_x = event.offsetX ? (event.offsetX) : event.pageX
	 				- document.getElementById("pointer_1").offsetLeft;
	 		pos_y = event.offsetY ? (event.offsetY) : event.pageY
	 				- document.getElementById("pointer_1").offsetTop;
	 		document.getElementById("img1").style.left = (pos_x - 1);
	 		document.getElementById("img1").style.top = (pos_y - 15);
	 		document.getElementById("img1").style.visibility = "visible";
	 		document.form1.form_x1.value = pos_x;
	 		document.form1.form_y1.value = pos_y; 	

	 		var imgname = document.getElementById("img1").src;
	 		
	 		window.location.href = "password_set.jsp?no=" + 2+"&x="+pos_x+"&y="+pos_y+"&image_name="+imgname+"&userid="+userid;
	 }
	 else if(data==2)
	 {
		 //alert(data);
	 		pos_x = event.offsetX ? (event.offsetX) : event.pageX
	 				- document.getElementById("pointer_1").offsetLeft;
	 		pos_y = event.offsetY ? (event.offsetY) : event.pageY
	 				- document.getElementById("pointer_1").offsetTop;
	 		document.getElementById("img2").style.left = (pos_x - 1);
	 		document.getElementById("img2").style.top = (pos_y - 15);
	 		document.getElementById("img2").style.visibility = "visible";
	 		document.form1.form_x1.value = pos_x;
	 		document.form1.form_y1.value = pos_y; 	

	 		var imgname = document.getElementById("img2").src;
	 		
	 		window.location.href = "password_set.jsp?no=" + 2+"&x="+pos_x+"&y="+pos_y+"&image_name="+imgname+"&userid="+userid;
	 }
	 else if(data==3)
	 {
		 //alert(data);
	 		pos_x = event.offsetX ? (event.offsetX) : event.pageX
	 				- document.getElementById("pointer_1").offsetLeft;
	 		pos_y = event.offsetY ? (event.offsetY) : event.pageY
	 				- document.getElementById("pointer_1").offsetTop;
	 		document.getElementById("img3").style.left = (pos_x - 1);
	 		document.getElementById("img3").style.top = (pos_y - 15);
	 		document.getElementById("img3").style.visibility = "visible";
	 		document.form1.form_x1.value = pos_x;
	 		document.form1.form_y1.value = pos_y; 	

	 		var imgname = document.getElementById("img3").src;
	 		
	 		window.location.href = "password_set.jsp?no=" + 2+"&x="+pos_x+"&y="+pos_y+"&image_name="+imgname+"&userid="+userid;
	 }
	 else if(data==4)
	 {
		 //alert(data);
	 		pos_x = event.offsetX ? (event.offsetX) : event.pageX
	 				- document.getElementById("pointer_1").offsetLeft;
	 		pos_y = event.offsetY ? (event.offsetY) : event.pageY
	 				- document.getElementById("pointer_1").offsetTop;
	 		document.getElementById("img4").style.left = (pos_x - 1);
	 		document.getElementById("img4").style.top = (pos_y - 15);
	 		document.getElementById("img4").style.visibility = "visible";
	 		document.form1.form_x1.value = pos_x;
	 		document.form1.form_y1.value = pos_y; 	

	 		var imgname = document.getElementById("img4").src;
	 		
	 		window.location.href = "password_set.jsp?no=" + 2+"&x="+pos_x+"&y="+pos_y+"&image_name="+imgname+"&userid="+userid;
	 }
	 else if(data==5)
	 {
		 //alert(data);
	 		pos_x = event.offsetX ? (event.offsetX) : event.pageX
	 				- document.getElementById("pointer_1").offsetLeft;
	 		pos_y = event.offsetY ? (event.offsetY) : event.pageY
	 				- document.getElementById("pointer_1").offsetTop;
	 		document.getElementById("img5").style.left = (pos_x - 1);
	 		document.getElementById("img5").style.top = (pos_y - 15);
	 		document.getElementById("img5").style.visibility = "visible";
	 		document.form1.form_x1.value = pos_x;
	 		document.form1.form_y1.value = pos_y; 	

	 		var imgname = document.getElementById("img5").src;
	 		
	 		window.location.href = "password_set.jsp?no=" + 2+"&x="+pos_x+"&y="+pos_y+"&image_name="+imgname+"&userid="+userid;
	 }
	 else if(data==6)
	 {
		 //alert(data);
	 		pos_x = event.offsetX ? (event.offsetX) : event.pageX
	 				- document.getElementById("pointer_1").offsetLeft;
	 		pos_y = event.offsetY ? (event.offsetY) : event.pageY
	 				- document.getElementById("pointer_1").offsetTop;
	 		document.getElementById("img6").style.left = (pos_x - 1);
	 		document.getElementById("img6").style.top = (pos_y - 15);
	 		document.getElementById("img6").style.visibility = "visible";
	 		document.form1.form_x1.value = pos_x;
	 		document.form1.form_y1.value = pos_y; 	

	 		var imgname = document.getElementById("img6").src;
	 		
	 		window.location.href = "password_set.jsp?no=" + 2+"&x="+pos_x+"&y="+pos_y+"&image_name="+imgname+"&userid="+userid;
	 }
	 else if(data==7)
	 {
		// alert(data);
	 		pos_x = event.offsetX ? (event.offsetX) : event.pageX
	 				- document.getElementById("pointer_1").offsetLeft;
	 		pos_y = event.offsetY ? (event.offsetY) : event.pageY
	 				- document.getElementById("pointer_1").offsetTop;
	 		document.getElementById("img7").style.left = (pos_x - 1);
	 		document.getElementById("img7").style.top = (pos_y - 15);
	 		document.getElementById("img7").style.visibility = "visible";
	 		document.form1.form_x1.value = pos_x;
	 		document.form1.form_y1.value = pos_y; 	

	 		var imgname = document.getElementById("img7").src;
	 		
	 		window.location.href = "password_set.jsp?no=" + 2+"&x="+pos_x+"&y="+pos_y+"&image_name="+imgname+"&userid="+userid;
	 }
	 else if(data==8)
	 {
		// alert(data);
	 		pos_x = event.offsetX ? (event.offsetX) : event.pageX
	 				- document.getElementById("pointer_1").offsetLeft;
	 		pos_y = event.offsetY ? (event.offsetY) : event.pageY
	 				- document.getElementById("pointer_1").offsetTop;
	 		document.getElementById("img8").style.left = (pos_x - 1);
	 		document.getElementById("img8").style.top = (pos_y - 15);
	 		document.getElementById("img8").style.visibility = "visible";
	 		document.form1.form_x1.value = pos_x;
	 		document.form1.form_y1.value = pos_y; 	

	 		var imgname = document.getElementById("img8").src;
	 		
	 		window.location.href = "password_set.jsp?no=" + 2+"&x="+pos_x+"&y="+pos_y+"&image_name="+imgname+"&userid="+userid;
	 }
	 else if(data==9)
	 {
		 //alert(data);
	 		pos_x = event.offsetX ? (event.offsetX) : event.pageX
	 				- document.getElementById("pointer_1").offsetLeft;
	 		pos_y = event.offsetY ? (event.offsetY) : event.pageY
	 				- document.getElementById("pointer_1").offsetTop;
	 		document.getElementById("img9").style.left = (pos_x - 1);
	 		document.getElementById("img9").style.top = (pos_y - 15);
	 		document.getElementById("img9").style.visibility = "visible";
	 		document.form1.form_x1.value = pos_x;
	 		document.form1.form_y1.value = pos_y; 	

	 		var imgname = document.getElementById("img9").src;
	 		
	 		window.location.href = "password_set.jsp?no=" + 2+"&x="+pos_x+"&y="+pos_y+"&image_name="+imgname+"&userid="+userid;
	 }
	
 } 
 
</script>
</head>

<body>


<div role="main" id="main" class="cf"><!-- headline -->
<div class="headline">Captcha as Graphical Passwords A New
Security Primitive Based on Hard AI Problems</div>
<!-- ENDS headline --></div>


 
<form name="form1">


<%
if(num.equals("0"))
{
	System.out.println("List zsfdf :"+num);
	//String confirm = request.getParameter("x");
	//System.out.println("confirm :"+confirm);
	//if(confirm.equals("Ok"))
	//{

		// Retrieve the Images from DB //
			Map m = DAO.retrieveImage();
			ArrayList<Integer> img_code1 =(ArrayList) m.get("Image_Code") ;
			ArrayList<String> img_name1 =(ArrayList) m.get("Image_Name") ;


			// Randomly Select 9 Images //
			ArrayList<Integer> rand=new ArrayList<Integer>();

			for(int i=0;i<9;i++)
			{
				Random r = new Random();
				
				int val = r.nextInt(img_name1.size());
				
				//System.out.println("Value :"+val);
				
				while(rand.contains(val))
				{
					// Check Same Image Code or Not ..for duplication//
					val = r.nextInt(img_name1.size());
					
					//System.out.println("Value xvcv:"+val);
				}
				
					rand.add(val);
				
			}

			System.out.println("Image List :"+rand);
			ArrayList<String> rand1=new ArrayList<String>();
			ArrayList<String> selected_imgcode=new ArrayList<String>();
			ArrayList<String> matrix=ImageProcess.MatrixValue();

			for(int j=0;j<rand.size();j++)
			{
				int r = Integer.parseInt(rand.get(j).toString());
				
				rand1.add(img_name1.get(r).toString());
				selected_imgcode.add(img_code1.get(r).toString());
			}


			System.out.println("Image Name :"+rand1);
			System.out.println("Image Code :"+selected_imgcode);
			System.out.println("Image Matrix :"+matrix);


			boolean fg = ImageProcess.UpdateSelectedImage(rand1,matrix,selected_imgcode,userid);
			
			
			
		ArrayList list = DAO.getImageName(userid);

		System.out.println("List :"+list);
		
	
	%>

<div class="background" id="pointer_1" style="position:relative;top: 100px;left:400px;width: 300px;height: 300px; ">

<img alt="" id="img1" src="<%=request.getContextPath()%>/Res/SourceImage/<%=list.get(0)%>" onclick="test('1','<%=userid%>')" >
<img alt="" id="img2" src="<%=request.getContextPath()%>/Res/SourceImage/<%=list.get(1)%>" style="position: absolute;left: 100px;" onclick="test('2','<%=userid%>')">
<img alt="" id="img3" src="<%=request.getContextPath()%>/Res/SourceImage/<%=list.get(2)%>" style="position: absolute;left: 200px;" onclick="test('3','<%=userid%>')">

<img alt=""  id="img4" src="<%=request.getContextPath()%>/Res/SourceImage/<%=list.get(3)%>" style="position: absolute;top: 100px;left:0px;" onclick="test('4','<%=userid%>')" >
<img alt="" id="img5" src="<%=request.getContextPath()%>/Res/SourceImage/<%=list.get(4)%>" style="position: absolute;top: 100px;left: 100px;" onclick="test('5','<%=userid%>')">
<img alt=""  id="img6" src="<%=request.getContextPath()%>/Res/SourceImage/<%=list.get(5)%>" style="position: absolute;top: 100px;left: 200px;" onclick="test('6','<%=userid%>')">

<img alt="" id="img7" src="<%=request.getContextPath()%>/Res/SourceImage/<%=list.get(6)%>" style="position: absolute;top: 200px;left: 0px;" onclick="test('7','<%=userid%>')">
<img alt="" id="img8" src="<%=request.getContextPath()%>/Res/SourceImage/<%=list.get(7)%>" style="position: absolute;top: 200px;left: 100px;" onclick="test('8','<%=userid%>')">
<img alt="" id="img9" src="<%=request.getContextPath()%>/Res/SourceImage/<%=list.get(8)%>" style="position: absolute;top: 200px;left: 200px;"  onclick="test('9','<%=userid%>')">

<br></br>
<div style="position: absolute;top: 200px;left: 10px;width: 300px">
 <input type="hidden" name="form_x1" size="4" />
 <input type="hidden" name="form_y1" size="4" />
</div>

</div>
	
	<%
	//}
	}
%>
<%

if(num.equals("2"))
{
	String x = request.getParameter("x");
	String y = request.getParameter("y");
	
	String user = request.getParameter("userid");
	String img_name = request.getParameter("image_name");
	
	System.out.println("Image Name :"+img_name);
	
	img_name = img_name.substring(69,img_name.length());
	
	int xval=Integer.parseInt(x)/40;
	int yval=Integer.parseInt(y)/40;
	
	DAO.updateSeImage(img_name,xval,yval,x,y);
	
	session.setAttribute("userid",user);
	System.out.println("userid  :"+user);
	
	%>
	
	<script>

    var x;
    if (confirm("Do you want click one more click for more security of your account transaction") == true)
     {
        x = "OK";
        window.location.href = "password_set.jsp?no="+3+"&x="+x;
    } 
    else {
        x = "Cancel";
        window.location.href = "password_set.jsp?no="+3+"&x="+x;
    }
   

   
	

</script>

	<%
	
}
if(Utility.parse(request.getParameter("no"))==3)
{
	System.out.println("xvxv");
	String val = request.getParameter("x");
	
	String user = session.getAttribute("userid").toString();
	
	System.out.println("xvxv   cxbcv cxbvcb :"+val+"User Id :"+user);
	
	if(val.trim().equals("OK"))
	{
		
		System.out.println("xvxv");
		ArrayList list = DAO.getImageName(user);

		System.out.println("List :"+list);
	
	%>
	
	
<div class="background" id="pointer_1" style="position:relative;top: 100px;left:400px;width: 300px;height: 300px; " >

<img alt="" id="img1" src="<%=request.getContextPath()%>/Res/SourceImage/<%=list.get(0)%>" onclick="test('1','<%=user%>')" >
<img alt="" id="img2" src="<%=request.getContextPath()%>/Res/SourceImage/<%=list.get(1)%>" style="position: absolute;left: 100px;" onclick="test('2','<%=user%>')">
<img alt="" id="img3" src="<%=request.getContextPath()%>/Res/SourceImage/<%=list.get(2)%>" style="position: absolute;left: 200px;" onclick="test('3','<%=user%>')">

<img alt=""  id="img4" src="<%=request.getContextPath()%>/Res/SourceImage/<%=list.get(3)%>" style="position: absolute;top: 100px;left:0px;" onclick="test('4','<%=user%>')" >
<img alt="" id="img5" src="<%=request.getContextPath()%>/Res/SourceImage/<%=list.get(4)%>" style="position: absolute;top: 100px;left: 100px;" onclick="test('5','<%=user%>')">
<img alt=""  id="img6" src="<%=request.getContextPath()%>/Res/SourceImage/<%=list.get(5)%>" style="position: absolute;top: 100px;left: 200px;" onclick="test('6','<%=user%>')">

<img alt="" id="img7" src="<%=request.getContextPath()%>/Res/SourceImage/<%=list.get(6)%>" style="position: absolute;top: 200px;left: 0px;" onclick="test('7','<%=user%>')">
<img alt="" id="img8" src="<%=request.getContextPath()%>/Res/SourceImage/<%=list.get(7)%>" style="position: absolute;top: 200px;left: 100px;" onclick="test('8','<%=user%>')">
<img alt="" id="img9" src="<%=request.getContextPath()%>/Res/SourceImage/<%=list.get(8)%>" style="position: absolute;top: 200px;left: 200px;"  onclick="test('9','<%=user%>')">

<br></br>
<div style="position: absolute;top: 200px;left: 10px;width: 300px">
 <input type="hidden" name="form_x1" size="4" />
 <input type="hidden" name="form_y1" size="4" />

</div>

</div>
	
	
	<%
	}
	else
	{
		String uid = session.getAttribute("userid").toString();
		System.out.println("+++++++++++= No =+++++++++++++++" +uid);
		
	int hkey = RandomValue.hash_key();
		
		StringBuffer sb = new StringBuffer();
		List user_coordinates = UserDAO.getImagecode(uid);
		
		System.out.println("+++++++++++= No =+++++++++++++++" +user_coordinates);
		
		
		 Collections.sort(user_coordinates);
		 
		 for(int i=0;i<user_coordinates.size();i++)
		 {
			 sb.append(user_coordinates.get(i)+"~"); 
		 }
		
		// MAC Creation
		String has_mac = HashingTechnique.MD5(sb.toString());
		System.out.println("has_mac------>>>"+has_mac);
		
		 boolean flag = UserDAO.updateHMAC(uid,has_mac);
		 
		 System.out.println("+++++++++++= No =+++++++++++++++" +flag);
		
		if(flag)
		{
			
		%>
		<script>

		alert("Captcha Graphical Password have Setted Successfully!!");
   
        window.location.href = "index1.jsp";
	
		</script>
		
		<%
	}
	}
}

%>

</form>	

<!-- Grab Google CDN's jQuery, with a protocol relative URL; fall back to local if offline -->
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="js/jquery-1.7.1.min.js"><\/script>')</script>

<!-- scripts concatenated and minified via build script -->
<script src="js/custom.js"></script>

<!-- superfish -->
<script src="js/superfish-1.4.8/js/hoverIntent.js"></script>
<script src="js/superfish-1.4.8/js/superfish.js"></script>
<script src="js/superfish-1.4.8/js/supersubs.js"></script>
<!-- ENDS superfish -->

<script src="js/tweet/jquery.tweet.js"></script>
<script src="js/jquery.isotope.min.js"></script>
<script src="js/jquery.nivo.slider.js"></script>
<script src="js/css3-mediaqueries.js"></script>
<script src="js/tabs.js"></script>
<script src="js/poshytip-1.1/src/jquery.poshytip.min.js"></script>
<!-- end scripts -->
</body>
</html>