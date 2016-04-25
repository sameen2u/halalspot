<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<title>RECEIPES Bootstarp responsive Website Template| Home :: w3layouts</title>
<link href="http://localhost:9090/HalalWeb/static/css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="http://localhost:9090/HalalWeb/static/js/jquery.min.js"></script>
<!-- Custom Theme files -->
<link href="http://localhost:9090/HalalWeb/static/css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--webfont-->
<link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900,200italic,300italic,400italic,600italic,700italic,900italic' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Lobster+Two:400,400italic,700,700italic' rel='stylesheet' type='text/css'>
<!--Animation-->
<script src="http://localhost:9090/HalalWeb/static/js/wow.min.js"></script>
<script src="http://localhost:9090/HalalWeb/static/js/common.js"></script>
<link href="http://localhost:9090/HalalWeb/static/css/animate.css" rel='stylesheet' type='text/css' />
<script>
	new WOW().init();
</script>
<script src="http://localhost:9090/HalalWeb/static/js/simpleCart.min.js"> </script>	
<script type="text/javascript" src="http://localhost:9090/HalalWeb/static/js/move-top.js"></script>
<script type="text/javascript" src="http://localhost:9090/HalalWeb/static/js/easing.js"></script>
<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1200);
				});
			});
		</script>
</head>
<body>
    <!-- header-section-starts -->
	<div class="header">
		<div class="container">
			<div class="top-header">
				<div class="logo">
					<a href="http://localhost:9090/HalalWeb"><img src="http://localhost:9090/HalalWeb/static/images/logo.png" class="img-responsive" alt="" /></a>
				</div>
				
				<div class="header-right">
						<div class="login-section">
							<ul>
								<li><a href="login">Login</a>  </li> |
								<li><a href="addRestaurant">Add Restaurant</a></li>
								<div class="clearfix"></div>
							</ul>
						</div>
					</div>
				<div class="clearfix"></div>
			</div>
		</div>
		
		<div class="menu-bar">
			<div class="container">
				<form class="form-wrapper cf">
     			<input class="searchTitle" "text" placeholder="Search location" required>
			  	<input class="searchBox" type="text" placeholder="Search for... restaurant, cuisine, dish" required>
				<button type="button" onclick="search()">Search</button>
			</form>
			</div>
		</div>		