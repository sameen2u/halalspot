<%@ include file="../header.jsp"%>
 <script type="text/javascript">
	function ownerCheck(){
		if($('.rest-is-owner').is(":checked")){
	  		$('.owner').show();
	  	}
		else{
			$('.owner').hide();
		}
	}
</script>
	<!-- content-section-starts -->
	<div class="content">
	<div class="main">
	   <div class="container">
		  <div class="register-but">
		  	  <form action="biz/add" method="post"> 
				 <div class="register-top-grid">
					<h3>Add Restaurant</h3>
					 <div class="wow fadeInLeft" data-wow-delay="0.4s">
						<span>RESTAURANT NAME<label>*</label></span>
						<input name="rest-name" type="text"> 
					 </div>
					  <div class="wow fadeInRight" data-wow-delay="0.4s">
						<span>DESCRIPTION<label></label></span>
						<textarea name="rest-desc"></textarea>
					 </div>
					 <div class="wow fadeInLeft" data-wow-delay="0.4s">
						<span>STREET ADDRESS<label>*</label></span>
						<input name="rest-st-addr" type="text"> 
					 </div>
					 <div class="wow fadeInLeft" data-wow-delay="0.4s">
						 <span>CITY<label>*</label></span>
						 <input name="rest-city" type="text"> 
					 </div>
					  <div class="wow fadeInRight" data-wow-delay="0.4s">
						 <span>PINCODE<label></label></span>
						 <input name="rest-pincode" type="text"> 
					 </div>
					 <div class="wow fadeInLeft" data-wow-delay="0.4s">
						 <span>LANDMARK (This will quickly help to locate the location)<label></label></span>
						 <input name="rest-landmark" type="text"> 
					 </div>
					 <div class="wow fadeInLeft" data-wow-delay="0.4s">
						 <span>RESTAURANT PHONE NUMBER<label></label></span>
						 <input name="rest-phone" type="text"> 
					 </div>
					  <div class="wow fadeInRight" data-wow-delay="0.4s">
						 <span>RESTAURANT EMAIL<label></label></span>
						 <input name="rest-email" type="text"> 
					 </div>
					 <div class="clearfix"> </div>
					   <a class="news-letter" href="#">
						 <label class="checkbox"><input type="checkbox" name="rest-is-owner" class="rest-is-owner" onchange="ownerCheck()"><i> </i>ARE YOU THE OWNER</label>
					   </a>
					  <div class="clearfix"> </div><div class="clearfix"> </div>
				      <div class="wow fadeInLeft owner" data-wow-delay="0.1s" style="display: none;">
						 <span>OWNER PHONE NUMBER<label></label></span>
						 <input name="rest-owner-phone" type="text"> 
					  </div> 
				      <div class="wow fadeInRight owner" data-wow-delay="0.1s" style="display: none;">
						 <span>OWNER EMAIL<label></label></span>
						 <input name="rest-owner-email" type="text"> 
					  </div>
					  <div class="wow fadeInRight" data-wow-delay="0.4s">
						 <span>OPENING STATUS<label>*</label></span>
					  <select name="rest-opening-status">
						  <option >Select Status</option>
						  <option value="opened">Opened</option>
						  <option value="opening soon">Opening Soon</option>
						  <option value="temporary closed">Temporary Closed</option>
						  <option value="renovating">Renovating In Progress</option>
						</select> 
						</div>
						
					  <div class="wow fadeInLeft" data-wow-delay="0.4s">
						 <span>YOUR EMAIL<label>*</label></span>
						 <input name="rest-user-email" type="text"> 
					  </div> 
					  <div class="wow fadeInRight" data-wow-delay="0.4s">
						 <span>CUISINE<label>*</label></span>
						 <input name="rest-cuisine" type="text"> 
					  </div>
					    <div class="wow fadeInRight" data-wow-delay="0.4s">
						 <span>WEBSITE<label></label></span>
						 <input name="rest-website" type="text"> 
					  </div>
					  <div class="wow fadeInLeft" data-wow-delay="0.4s">
						 <span>FACEBOOK PAGE<label></label></span>
						 <input name="rest-fb-page" type="text"> 
					  </div> 
					  <div class="wow fadeInRight" data-wow-delay="0.4s">
						 <span>TWITTER PAGE<label></label></span>
						 <input name="rest-tw-page" type="text"> 
					  </div>
					  <div class="wow fadeInRight" data-wow-delay="0.4s">
						 <span>HALAL AUTHENTICITY<label>*</label></span>
					  <select name="rest-authenticity">
						  <option value="volvo">Select Authenticity</option>
						  <option value="saab">Owners are Muslim</option>
						  <option value="mercedes">Halal Sign Board</option>
						  <option value="audi">Halal Certificate</option>
						</select> 
						</div>
						<div class="wow fadeInRight" data-wow-delay="0.4s">
						 <span>HALAL Offerings<label>*</label></span>
					  <select name="rest-halal-serving">
						  <option value="volvo">Select Options</option>
						  <option value="saab">Full Halal</option>
						  <option value="mercedes">Partial Halal</option>
						</select> 
						</div>
					 <!--  <div class="wow fadeInRight" data-wow-delay="0.4s">
						 <span>OTHER DETAILS<label></label></span>
						 <textarea name="rest-other-detail"></textarea>
					  </div>
					  <div class="wow fadeInRight">
						 <span>OTHER DETAILS<label></label></span>
						 <textarea name="rest-other-detail"></textarea>
					  </div> -->
					  <div class="clearfix"> </div>
					   <br>
					   <br>
					   <br>
					   <!-- #need to correct full functionality of all below facilities -->
					<table style="width:100%; background-color:white;">
					<tr ><span ><label>Facility</label></span></tr>
					
					  <tr>
					    <td style="width:25%"><label class="checkbox"><input type="checkbox" name="rest-is-owner" class="rest-is-owner"><i> </i>Takeaway/to-go</label></td>
					    <td style="width:25%"><label class="checkbox"><input type="checkbox" name="rest-is-owner" class="rest-is-owner"><i> </i>Breakfast</label></td>		
					    <td style="width:25%"><label class="checkbox"><input type="checkbox" name="rest-is-owner" class="rest-is-owner"><i> </i>Outdoor seating</label></td>
					    <td style="width:25%"><label class="checkbox"><input type="checkbox" name="rest-is-owner" class="rest-is-owner"><i> </i>Home/business delivery</label></td>
					  </tr>
					  <tr>
					    <td><label class="checkbox"><input type="checkbox" name="rest-is-owner" class="rest-is-owner"><i> </i>Parking available</label></td>
					    <td><label class="checkbox"><input type="checkbox" name="rest-is-owner" class="rest-is-owner"><i> </i>Shisha/hookah</label></td>		
					    <td><label class="checkbox"><input type="checkbox" name="rest-is-owner" class="rest-is-owner"><i> </i>Cafe</label></td>
					    <td><label class="checkbox"><input type="checkbox" name="rest-is-owner" class="rest-is-owner"><i> </i>Credit Cards Accepted</label></td>
					  </tr>
					  <tr>
					    <td><label class="checkbox"><input type="checkbox" name="rest-is-owner" class="rest-is-owner"><i> </i>Indoor Seating</label></td>
					    <td><label class="checkbox"><input type="checkbox" name="rest-is-owner" class="rest-is-owner"><i> </i>A.C Rooms</label></td>		
					    <td><label class="checkbox"><input type="checkbox" name="rest-is-owner" class="rest-is-owner"><i> </i>Self Service</label></td>
					    <td><label class="checkbox"><input type="checkbox" name="rest-is-owner" class="rest-is-owner"><i> </i>Luxury Dining</label></td>
					  </tr>
					</table>
					
					
					
					<br>
					<input type="submit" value="Add the Restaurant">
				</form>
		   </div>
	     </div>
	    </div>
<div class="special-offers-section">
			<div class="container">
				<div class="special-offers-section-head text-center dotted-line">
					<h4>Special Offers</h4>
				</div>
				<div class="special-offers-section-grids">
				 <div class="m_3"><span class="middle-dotted-line"> </span> </div>
				   <div class="container">
					  <ul id="flexiselDemo3">
						<li>
							<div class="offer">
								<div class="offer-image">	
									<img src="http://localhost:9090/HalalWeb/static/images/p1.jpg" class="img-responsive" alt=""/>
								</div>
								<div class="offer-text">
									<h4>Olister Combo pack lorem</h4>
									<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. </p>
									<input type="button" value="Grab It">
									<span></span>
								</div>
								<div class="clearfix"></div>
							</div>
						</li>
						<li>
							<div class="offer">
								<div class="offer-image">	
									<img src="http://localhost:9090/HalalWeb/static/images/p2.jpg" class="img-responsive" alt=""/>
								</div>
								<div class="offer-text">
									<h4>Chicken Jumbo pack lorem</h4>
									<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. </p>
									<input type="button" value="Grab It">
									<span></span>
								</div>
								<div class="clearfix"></div>
							</div>
						</li>
						<li>
							<div class="offer">
								<div class="offer-image">	
									<img src="http://localhost:9090/HalalWeb/static/images/p3.jpg" class="img-responsive" alt=""/>
								</div>
								<div class="offer-text">
									<h4>Crab Combo pack lorem</h4>
									<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. </p>
									<input type="button" value="Grab It">
									<span></span>
								</div>
								
								<div class="clearfix"></div>
								</div>
						</li>
						<li>
							<div class="offer">
								<div class="offer-image">	
									<img src="http://localhost:9090/HalalWeb/static/images/p2.jpg" class="img-responsive" alt=""/>
								</div>
								<div class="offer-text">
									<h4>Chicken Jumbo pack lorem</h4>
									<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. </p>
									<input type="button" value="Grab It">
									<span></span>
								</div>
								
								<div class="clearfix"></div>
								</div>
					    </li>
					 </ul>
				 <script type="text/javascript">
					$(window).load(function() {
						
						$("#flexiselDemo3").flexisel({
							visibleItems: 3,
							animationSpeed: 1000,
							autoPlay: true,
							autoPlaySpeed: 3000,    		
							pauseOnHover: true,
							enableResponsiveBreakpoints: true,
							responsiveBreakpoints: { 
								portrait: { 
									changePoint:480,
									visibleItems: 1
								}, 
								landscape: { 
									changePoint:640,
									visibleItems: 2
								},
								tablet: { 
									changePoint:768,
									visibleItems: 3
								}
							}
						});
						
					});
				    </script>
				    <script type="text/javascript" src="http://localhost:9090/HalalWeb/static/js/jquery.flexisel.js"></script>
				</div>
			</div>
		</div>
		</div>

	<!-- content-section-ends -->
<%@ include file="../footer.jsp"%>