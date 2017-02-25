<!DOCTYPE HTML>
<!--
	Twenty by HTML5 UP
	html5up.net | @n33co
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
  <%@page import="com.amutha.support.Utility"%>
  
<html>
	<head>
		<title>Login Page</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		
		<script src="js/jquery.min.js"></script>
		<script src="js/skel.min.js"></script>
		<script src="js/skel-layers.min.js"></script>
		<script src="js/init.js"></script>
		
		<noscript>
			<link rel="stylesheet" href="css/skel.css" />
			<link rel="stylesheet" href="css/style.css" />
			<link rel="stylesheet" href="css/style-wide.css" />
			<link rel="stylesheet" href="css/style-noscript.css" />
		</noscript>
		
		
		<script src="<%=request.getContextPath()%>/jquery.toastmessage.js" type="text/javascript"></script>
    <link href="<%=request.getContextPath()%>/jquery.toastmessage.css" rel="stylesheet" type="text/css" />
	
	
	
		<link href='http://fonts.googleapis.com/css?family=Bowlby+One+SC' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/normalize.css" type="text/css">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" type="text/css">
	<link rel="author" href="https://plus.google.com/107766061849006545830"/>
	
	<script src="<%=request.getContextPath()%>/js/jquery-1.9.1.min.js"></script>
	<script src="<%=request.getContextPath()%>/js/jquery.lettering-0.6.1.min.js"></script>
	<script src="<%=request.getContextPath()%>/js/jquery.scrollorama.js"></script>
	<style type="text/css">
	.main
	{
	font-family: mensch;
  line-height: 1.3em;
  font-size: 46px;
  color: #ffffff;
  text-shadow: 5px 5px 5px #d96c4b;
  text-align: center;
  margin-bottom: 20px;
  margin-top: -140px;
  margin-right: 20px;
  margin-left:50px;
	}
	
	</style>
		
	</head>
	<%!

	String signoutstatus="";
%>

<%
signoutstatus=request.getParameter("signoutstatus");
System.out.println("signoutstatus "+signoutstatus);



%>

<%!

	String loginstatus="",passstatus="",mergeSatus="",mergingStatus="",share1_file="",share2_file="";
%>

<%
	loginstatus=request.getParameter("loginstatus");
	passstatus=(String)request.getAttribute("passstatus");
	mergeSatus=(String)request.getAttribute("mergeSatus");
	mergingStatus=(String)request.getAttribute("mergingStatus");
%>
	
	
	<body class="index">
	
		<!-- Header -->
			<header id="header" class="alt">
				
				<nav id="nav">
					<ul>
						<li><a href="index.jsp" class="button special">Admin</a></li>
						<li><a href="index1.jsp" class="button special">User</a></li>
					</ul>
				</nav>
			</header>

		<!-- Banner -->		
		
			<section id="banner" >
			
				<div class="main">
			
				<h>Captcha as Graphical Passwords A New Security Primitive Based on Hard AI Problems</h>
				
				</div>
				<!--
					".inner" is set up as an inline-block so it automatically expands
					in both directions to fit whatever's inside it. This means it won't
					automatically wrap lines, so be sure to use line breaks where
					appropriate (<br />).
				-->
				<div class="inner">
					
					<form action="<%=request.getContextPath()%>/AdminLogin" method="post">
					<header>
						<h2>Admin Login</h2>
					</header>
					
					ID
					<input type="text" name="adminid" placeholder="Please Enter Id" >
					Password
					<input type="password" name="pwd" placeholder="Please Enter Password">
					
					
						<input type="submit" value="Login" class="button fit scrolly" style="position: relative;top: 10px;" >
							
					
				</form>
				
				</div>
				
			</section>
		

<%
	if(signoutstatus==null)
	{
		
	}

	else if(signoutstatus.equals("success"))
	{
		%>
		<div style="top:500px;position: absolute;left: 100px;"><font color=red>Logged out Successfully!!!</font></div>
	
<%	
	session.removeAttribute("signoutstatus");
	}

%>
<%
	if(loginstatus==null)
	{
		
	}

	else if(loginstatus.equals("failed"))
	{
		%>
	<br><br><br>	
	<center><h4><font color=red>Login Failed, Invalid User!!!</font></h4></center>
<%
	}

%> 	   
 <%
			if(Utility.parse(request.getParameter("no"))==5)
			{%>
				
				<div  style="position: absolute;top: 500px;left: 300px;color: #336633;font-size: 20px; ">	
		<script type="text/javascript">
		 $().toastmessage('showErrorToast', "Sorry this user id is already exists.....!");
		
		</script></div>		
			<%}

		%>
		
<%	
		int no=Utility.parse(request.getParameter("no"));
System.out.println("No :"+no);
		if(no==1)
		{%>
		<script type="text/javascript">
		
			 alert("Invalid id and password or Your account is blocked!");
			 
		</script>	
					
		<%}
		if(no==3)
		{%>
		
		<script type="text/javascript">
		 alert("Captcha Click Point is wrong,Please try again!");
		
		</script>		
		<%}
		if(no==4)
		{%>
		
		<script type="text/javascript">
		 alert("Please Click Properly!");
		
		</script>		
		<%}
			
			
		if(no==2)
		{
			
		%>
			
					
		<script type="text/javascript">
		 alert("You have Logged Out Successfully!");
		
		</script>		
		<%
		}
		
		
	%>
             


	</body>
</html>