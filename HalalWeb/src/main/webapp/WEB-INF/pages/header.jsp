<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
Spoon graphic by <a href="http://www.freepik.com">Freepik</a> from <a href="http://www.flaticon.com/">Flaticon</a> is licensed under <a href="http://creativecommons.org/licenses/by/3.0/" title="Creative Commons BY 3.0">CC BY 3.0</a>. Made with <a href="http://logomakr.com" title="Logo Maker">Logo Maker</a>
-->
<!DOCTYPE html>
<html>
<head>
<title>Halal Spot</title>
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
<!-- <script src="http://localhost:9090/HalalWeb/static/js/simpleCart.min.js"> </script>	 -->
<script type="text/javascript" src="http://localhost:9090/HalalWeb/static/js/move-top.js"></script>
<script type="text/javascript" src="http://localhost:9090/HalalWeb/static/js/easing.js"></script>
<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1200);
				});
			});
			
			// Google address type ahead functionality
			 var placeSearch, autocomplete;
		      var componentForm = {
		        street_number: 'short_name',
		        route: 'long_name',
		        locality: 'long_name',
		        administrative_area_level_1: 'short_name',
		        country: 'long_name',
		        postal_code: 'short_name'
		      };
		      var options = {
		    		  types: ['(cities)'],
		    		  componentRestrictions: {country: "us"}
		    		 };

		      function initAutocomplete() {
		        // Create the autocomplete object, restricting the search to geographical
		        // location types.
		        autocomplete = new google.maps.places.Autocomplete(
		            /** @type {!HTMLInputElement} */(document.getElementById('autocomplete')),
		            {types: ['geocode'],componentRestrictions: {country: "in"}});

		        // When the user selects an address from the dropdown, populate the address
		        // fields in the form.
		        autocomplete.addListener('place_changed', fillInAddress);
		      }

		      function fillInAddress() {
		        // Get the place details from the autocomplete object.
		        var place = autocomplete.getPlace();

		        for (var component in componentForm) {
		          document.getElementById(component).value = '';
		          document.getElementById(component).disabled = false;
		        }

		        // Get each component of the address from the place details
		        // and fill the corresponding field on the form.
		        for (var i = 0; i < place.address_components.length; i++) {
		          var addressType = place.address_components[i].types[0];
		          if (componentForm[addressType]) {
		            var val = place.address_components[i][componentForm[addressType]];
		            document.getElementById(addressType).value = val;
		          }
		        }
		      }

		      // Bias the autocomplete object to the user's geographical location,
		      // as supplied by the browser's 'navigator.geolocation' object.
		      function geolocate() {
		        if (navigator.geolocation) {
		          navigator.geolocation.getCurrentPosition(function(position) {
		            var geolocation = {
		              lat: position.coords.latitude,
		              lng: position.coords.longitude
		            };
		            var circle = new google.maps.Circle({
		              center: geolocation,
		              radius: position.coords.accuracy
		            });
		            autocomplete.setBounds(circle.getBounds());
		          });
		        }
		      }
		    </script>
		    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBuJaCyenO4k6lpxrMxSDyzE52aa5tR4b8&libraries=places&callback=initAutocomplete"
		        async defer></script>
</head>
<body>
    <!-- header-section-starts -->
	<div class="header">
		<div class="container">
			<div class="top-header">
				<div class="logo">
					<a href="http://localhost:9090/HalalWeb"><img src="http://localhost:9090/HalalWeb/static/images/fullLogo.png" class="img-responsive" alt="" /></a>
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
				<div class="search-form-header">
				<form class="form-wrapper cf">
	     			<input class="searchTitle" id="autocomplete" type="text" onFocus="geolocate()"  placeholder="Search location">
				  	<input class="searchBox" type="text" placeholder="Search for... restaurant, cuisine, dish">
					<button type="button" onclick="search()">Search</button>
				</form>
				</div>
			</div>
		</div>		