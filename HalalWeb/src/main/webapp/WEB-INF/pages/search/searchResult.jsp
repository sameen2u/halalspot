<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ include file="../header.jsp"%>
<style>
 .cuisineUl{
	display: inline; list-style: none; 
}
.cuisineUl li{
	display: inline; 
}
.cuisineUl li:AFTER {
content: ", ";
} 
	
/* Pagination style */

a {
    color: #4A4A4A;
    border: 0; outline: 0;
}

.pagination {
    text-align: center;
    width: 100%;
}
.pagination a, .pagination strong {
    background: #fff;
    display: inline-block;
    margin-right: 3px;
    padding: 4px 12px;
    text-decoration: none;
	line-height: 1.5em;
	
    -webkit-border-radius: 3px;
    -moz-border-radius: 3px;
    border-radius: 3px;
}
.pagination a:hover {
    background-color: #BEBEBE;
    color: #fff;
}
.pagination a:active {
	background: rgba(190, 190, 190, 0.75);
}
.pagination strong {
    color: #fff;
    background-color: #d83c3c;
}
					
</style>
	<!-- header-section-ends -->
	<!-- content-section-starts -->
	<div class="Popular-Restaurants-content">
		<div class="Popular-Restaurants-grids">
			<div class="container">
			<!-- globalmap - ${globalMap} --> 
			<c:forEach var="business" items="${globalMap.searchBusinesses}" >
				<div class="Popular-Restaurants-grid wow fadeInRight" data-wow-delay="0.2s">
					<div class="col-md-3 restaurent-logo">
						<img src="http://localhost:9090/HalalWeb/static/images/restaurent-logo1.jpg" class="img-responsive" alt="" />
					</div>
					<div class="col-md-2 restaurent-title">
						<div class="logo-title">
							<h4><a href="#">${business.name}</a></h4>
						</div>
						<div class="search-biz-address"><b>${business.address.locality}, ${business.address.city}</b></div>
						
						<div class="search-biz-cuisine"><label>Cuisine:</label>&emsp;
							<c:forEach var="cuisine" items="${business.cuisine}" >
								<ul class="cuisineUl"><li>${cuisine}</li></ul>
							</c:forEach>
						</div>	
						<div class="search-biz-hours"><label>Working Hours:</label>&emsp; 11 am to 10 pm</div>
						<div class="search-biz-authenticity"><label>Halal Authenticity:</label>&emsp; ${business.authenticity}</div>
						<!-- <div class="search-biz-feature"><label>Features:</label>&emsp; Outdoor seating, Take away, Home delivery ...</div> -->
					</div>
					<div class="col-md-7 buy">	
						<div class="search-biz-distance"><label>Distance:</label>&emsp; ${business.distance} Km</div>
						
						<div class="rating">
							<span>ratings</span>
							<a href="#"> <img src="http://localhost:9090/HalalWeb/static/images/star1.png" class="img-responsive" alt="">(004)</a>
						</div>
						
					</div>
					<div class="clearfix"></div>
				</div>
				</c:forEach>
				
				<div class="pagination clearfix">
					
					<ul class="pagination-ul">
						<c:forEach var="page" items="${globalMap.pagination}" >
							<!-- <li><a href="#">�</a>&nbsp;</li> selected = ${page.isSelectedPage}-->
							<li><a href="${page.paginationUrl}">
								<c:if test="${page.isSelectedPage}"><strong></c:if>	
									${page.label}
								<c:if test="${page.isSelectedPage}"></strong></c:if>	
							</a>&nbsp;</li>
							<!-- <li><strong>2</strong>&nbsp;</li>
							<li><a href="#">3</a>&nbsp;</li> -->
							<!-- <li><a href="#">�</a>&nbsp;</li> -->
							</c:forEach>
						</ul>
						
						
						<!-- <a href="#">1</a>
						<strong>2</strong>
						<a href="#">3</a>
						
						<a href="#">�</a>
						&nbsp;<a href="#">Last</a> -->
				</div>
				
				<!-- <div class="Popular-Restaurants-grid wow fadeInLeft" data-wow-delay="0.4s">
					<div class="col-md-3 restaurent-logo">
						<img src="http://localhost:9090/HalalWeb/static/images/restaurent-logo2.jpg" class="img-responsive" alt="" />
					</div>
					<div class="col-md-2 restaurent-title">
						<div class="logo-title logo-title-1">
							<h4><a href="#">Subway</a></h4>
						</div>
						<div class="rating">
							<span>ratings</span>
							<a href="#"> <img src="http://localhost:9090/HalalWeb/static/images/star2.png" class="img-responsive" alt="">(005)</a>
						</div>
					</div>
					<div class="col-md-7 buy">
						<span>$45</span>
						<a class="morebtn hvr-rectangle-in" href="orders-list.html">buy</a>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="Popular-Restaurants-grid wow fadeInRight" data-wow-delay="0.4s">
					<div class="col-md-3 restaurent-logo">
						<img src="http://localhost:9090/HalalWeb/static/images/restaurent-logo3.jpg" class="img-responsive" alt="" />
					</div>
					<div class="col-md-2 restaurent-title">
						<div class="logo-title logo-title-2">
							<h4><a href="#">Barista</a></h4>
						</div>
						<div class="rating">
							<span>ratings</span>
							<a href="#"> <img src="http://localhost:9090/HalalWeb/static/images/star1.png" class="img-responsive" alt="">(004)</a>
						</div>
					</div>
					<div class="col-md-7 buy">
						<span>$45</span>
						<a class="morebtn hvr-rectangle-in" href="orders-list.html">buy</a>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="Popular-Restaurants-grid wow fadeInLeft" data-wow-delay="0.4s">
					<div class="col-md-3 restaurent-logo">
						<img src="http://localhost:9090/HalalWeb/static/images/restaurent-logo4.jpg" class="img-responsive" alt="" />
					</div>
					<div class="col-md-2 restaurent-title">
						<div class="logo-title logo-title-3">
							<h4><a href="#">papa johns</a></h4>
						</div>
						<div class="rating">
							<span>ratings</span>
							<a href="#"> <img src="http://localhost:9090/HalalWeb/static/images/star2.png" class="img-responsive" alt="">(005)</a>
						</div>
					</div>
					<div class="col-md-7 buy">
						<span>$45</span>
						<a class="morebtn hvr-rectangle-in" href="orders-list.html">buy</a>
					</div>
					<div class="clearfix"></div>
				</div> 
				<div class="Popular-Restaurants-grid wow fadeInRight" data-wow-delay="0.4s">
					<div class="col-md-3 restaurent-logo">
						<img src="http://localhost:9090/HalalWeb/static/images/restaurent-logo5.jpg" class="img-responsive" alt="" />
					</div>
					<div class="col-md-2 restaurent-title">
						<div class="logo-title logo-title-4">
							<h4><a href="#">Domino's pizza</a></h4>
						</div>
						<div class="rating">
							<span>ratings</span>
							<a href="#"> <img src="http://localhost:9090/HalalWeb/static/images/star1.png" class="img-responsive" alt="">(004)</a>
						</div>
					</div>
					<div class="col-md-7 buy">
						<span>$45</span>
						<a class="morebtn hvr-rectangle-in" href="orders-list.html">buy</a>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="Popular-Restaurants-grid wow fadeInLeft" data-wow-delay="0.4s">
					<div class="col-md-3 restaurent-logo">
						<img src="http://localhost:9090/HalalWeb/static/images/restaurent-logo6.jpg" class="img-responsive" alt="" />
					</div>
					<div class="col-md-2 restaurent-title">
						<div class="logo-title logo-title-5">
							<h4><a href="#">kfc</a></h4>
						</div>
						<div class="rating">
							<span>ratings</span>
							<a href="#"> <img src="http://localhost:9090/HalalWeb/static/images/star2.png" class="img-responsive" alt="">(005)</a>
						</div>
					</div>
					<div class="col-md-7 buy">
						<span>$45</span>
						<a class="morebtn hvr-rectangle-in" href="orders-list.html">buy</a>
					</div>
					<div class="clearfix"></div>
				</div>-->
			</div>
		</div>
	</div>
	<div class="contact-section" id="contact">
			<div class="container">
				<div class="contact-section-grids">
					<div class="col-md-3 contact-section-grid wow fadeInLeft" data-wow-delay="0.4s">
						<h4>Site Links</h4>
						<ul>
							<li><i class="point"></i></li>
							<li class="data"><a href="#">About Us</a></li>
						</ul>
						<ul>
							<li><i class="point"></i></li>
							<li class="data"><a href="#">Contact Us</a></li>
						</ul>
						<ul>
							<li><i class="point"></i></li>
							<li class="data"><a href="#">Privacy Policy</a></li>
						</ul>
						<ul>
							<li><i class="point"></i></li>
							<li class="data"><a href="#">Terms of Use</a></li>
						</ul>
					</div>
					<div class="col-md-3 contact-section-grid wow fadeInLeft" data-wow-delay="0.4s">
						<h4>Site Links</h4>
						<ul>
							<li><i class="point"></i></li>
							<li class="data"><a href="#">About Us</a></li>
						</ul>
						<ul>
							<li><i class="point"></i></li>
							<li class="data"><a href="#">Contact Us</a></li>
						</ul>
						<ul>
							<li><i class="point"></i></li>
							<li class="data"><a href="#">Privacy Policy</a></li>
						</ul>
						<ul>
							<li><i class="point"></i></li>
							<li class="data"><a href="#">Terms of Use</a></li>
						</ul>
					</div>
					<div class="col-md-3 contact-section-grid wow fadeInRight" data-wow-delay="0.4s">
						<h4>Follow Us On...</h4>
						<ul>
							<li><i class="fb"></i></li>
							<li class="data"> <a href="#">  Facebook</a></li>
						</ul>
						<ul>
							<li><i class="tw"></i></li>
							<li class="data"> <a href="#">Twitter</a></li>
						</ul>
						<ul>
							<li><i class="in"></i></li>
							<li class="data"><a href="#"> Linkedin</a></li>
						</ul>
						<ul>
							<li><i class="gp"></i></li>
							<li class="data"><a href="#">Google Plus</a></li>
						</ul>
					</div>
					<div class="col-md-3 contact-section-grid nth-grid wow fadeInRight" data-wow-delay="0.4s">
						<h4>Subscribe Newsletter</h4>
						<p>To get latest updates and food deals every week</p>
						<input type="text" class="text" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}">
						<input type="submit" value="submit">
						</div>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
	<!-- content-section-ends -->
	<!-- footer-section-starts -->
	<div class="footer">
		<div class="container">
			<p class="wow fadeInLeft" data-wow-delay="0.4s">&copy; 2014  All rights  Reserved | Template by &nbsp;<a href="http://w3layouts.com" target="target_blank">W3Layouts</a></p>
		</div>
	</div>
	<!-- footer-section-ends -->
	  <script type="text/javascript">
						$(document).ready(function() {
							/*
							var defaults = {
					  			containerID: 'toTop', // fading element id
								containerHoverID: 'toTopHover', // fading element hover id
								scrollSpeed: 1200,
								easingType: 'linear' 
					 		};
							*/
							
							$().UItoTop({ easingType: 'easeOutQuart' });
							
						});
					</script>
				<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>

</body>
</html>