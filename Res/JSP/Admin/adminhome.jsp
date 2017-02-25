<!doctype html>
<!-- paulirish.com/2008/conditional-stylesheets-vs-css-hacks-answer-neither/ -->
<!--[if lt IE 7]> <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]>    <html class="no-js lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]>    <html class="no-js lt-ie9" lang="en"> <![endif]-->
<!-- Consider adding a manifest.appcache: h5bp.com/d/Offline -->
<!--[if gt IE 8]><!-->
<html class="no-js" lang="en">
<!--<![endif]-->
<head>
<meta charset="utf-8">

<title>Admin Home</title>
<meta name="description" content="">

<!-- Mobile viewport optimized: h5bp.com/viewport -->
<meta name="viewport" content="width=device-width">


<link rel="stylesheet" media="screen" href="css/superfish.css" />
<link rel="stylesheet" href="css/nivo-slider.css" media="all" />
<link rel="stylesheet" href="css/tweet.css" media="all" />
<link rel="stylesheet" href="css/style1.css">
<link rel="stylesheet" media="all" href="css/lessframework.css" />


<!-- All JavaScript at the bottom, except this Modernizr build.
	   Modernizr enables HTML5 elements & feature detects for optimal performance.
	   Create your own custom Modernizr build: www.modernizr.com/download/ -->
<script src="js/modernizr-2.5.3.min.js"></script>
</head>
<body>

<!-- WRAPPER -->
<div class="wrapper cf">

<header class="cf"> <!-- MAIN -->
<div role="main" id="main" class="cf"><!-- headline -->
<div class="headline">Captcha as Graphical Passwords A New
Security Primitive Based on Hard AI Problems</div>
<!-- ENDS headline --></div>

<!-- nav --> <nav class="cf">
<ul id="nav" class="sf-menu">
	<li class="current-menu-item"><a
		href="<%=request.getContextPath()%>/Res/JSP/Admin/acc_type_details.jsp" target="myhome"><span>Account Type</span></a></li>
	<li><a href="<%=request.getContextPath()%>/Res/JSP/Admin/account_details.jsp" target="myhome"><span>Account Details</span></a></li>
	<li><a href="<%=request.getContextPath()%>/Res/JSP/Admin/branch_details.jsp" target="myhome"><span>Branch Details</span></a></li>
	<li><a href="<%=request.getContextPath()%>/Res/JSP/Admin/adminchangepwd.jsp" target="myhome"><span>Change Password</span></a></li>

	<li><a href="<%=request.getContextPath()%>/SignOut?no=1"><span>LogOut</span></a></li>
</ul>

</nav> <!-- ends nav -->
 </header> <!-- MAIN -->
<div role="main" id="main" class="cf">


<div><iframe
	style="position: relative; width: 900px; height: 455px;left: 50px;top: -10px;" name="myhome">

</iframe></div>



</div>
<!-- ENDS MAIN --></div>
<!-- ENDS WRAPPER -->

<!-- JavaScript at the bottom for fast page loading -->

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