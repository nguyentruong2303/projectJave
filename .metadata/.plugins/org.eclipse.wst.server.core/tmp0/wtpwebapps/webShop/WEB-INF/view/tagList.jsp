<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.List"
	import="tp.kits3.livedinner.vo.Tag"
    pageEncoding="UTF-8"%>
    
<%
String contextPath = request.getContextPath();
List<Tag> listtag = (List<Tag>)request.getAttribute("TagList");
%>
<!DOCTYPE html>
<html lang="en"><!-- Basic -->
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">   
   
    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
 
     <!-- Site Metas -->
    <title>Live Dinner Restaurant</title>  
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Site Icons -->
    <link rel="shortcut icon" href="<%=contextPath%>/images/favicon.ico" type="image/x-icon">
    <link rel="apple-touch-icon" href="<%=contextPath%>/images/apple-touch-icon.png">

	<!-- Site CSS -->
    <link rel="stylesheet" href="<%=contextPath%>/css/style.css">    
    <!-- Custom CSS -->
    <link rel="stylesheet" href="<%=contextPath%>/css/custom.css">

    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
	<!-- Start header -->
	<header>
		<nav>
			<div class="header-box">
				<a href="/webShop/index">
					<img src="<%=contextPath%>/images/logo.png" alt="" />
				</a>
				<!-- <button type="button" data-toggle="collapse" data-target="#navbars-rs-food" aria-controls="navbars-rs-food" aria-expanded="false" aria-label="Toggle navigation">
				  <span></span>
				</button> -->
				<div id="navbars-rs-food">
					<ul>
						<li><a href="/webShop/index">Home</a></li>
						<li><a href="/webShop/menu/list">Menu</a></li>
						<li><a href="/webShop/category/list">About</a></li>
						<li class="sub-li">
							<a href="#" onclick="showMenuHeader('s1')" id="dropdown-a" data-toggle="dropdown">Pages</a>
							<div class= "header-submenu" id= "s1" style="position:relative;display:none" aria-labelledby="dropdown-a">
								<a href="/webShop/book/list">Reservation</a>
								<a href="/webShop/post/list">Stuff</a>
								<a href="/webShop/post/list">Gallery</a>
							</div>
						</li>
						<li class="sub-li">
							<a href="#" onclick="showMenuHeader('s2')" id="dropdown-a" data-toggle="dropdown">Blog</a>
							<div class="header-submenu" id="s2" style="position:relative;display:none" aria-labelledby="dropdown-a">
								<a href="/webShop/tag/list">blog</a>
								<a href="/webShop/tag/list">blog Single</a>
							</div>
						</li>
						<li><a href="/webShop/contact/list">Contact</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<!-- End header -->
	
	<!-- Start All Pages -->
	<div >
		<div >
			<div >
				<div >
					<h1>Reservation</h1>
				</div>
			</div>
		</div>
	</div>
	<!-- End All Pages -->
	
	<!-- Start Reservation -->
	<div>
		<div >
			<div >
				<div >
					<div >
						<h2>Reservation</h2>
						<p>Lorem Ipsum is simply dummy text of the printing and typesetting</p>
					</div>
				</div>
			</div>
			<div >
				<div >
					<div >
						<form id="contactForm">
							<div >
								<div >
									<h3>Book a table</h3>
									<div >
										<div >
											<input id="input_date" name="date" type="text" value="" equired data-error="Please enter Date">
											<div ></div>
										</div>                                 
									</div>
									<div >
										<div >
											<input id="input_time" required data-error="Please enter time">
											<div ></div>
										</div>                                 
									</div>
									<div >
										<div >
											<select id="person" required data-error="Please select Person">
											  <option disabled selected>Select Person*</option>
											  <option value="1">1</option>
											  <option value="2">2</option>
											  <option value="3">3</option>
											  <option value="4">4</option>
											  <option value="5">5</option>
											  <option value="6">6</option>
											  <option value="7">7</option>
											</select>
											<div ></div>
										</div> 
									</div>
								</div>
								<div >
									<h3>Contact Details</h3>
									<div >
										<div >
											<input type="text" id="name" name="name" placeholder="Your Name" required data-error="Please enter your name">
											<div ></div>
										</div>                                 
									</div>
									<div >
										<div >
											<input type="text" placeholder="Your Email" id="email" name="email" required data-error="Please enter your email">
											<div ></div>
										</div> 
									</div>
									<div >
										<div >
											<input type="text" placeholder="Your Numbar" id="phone" name="phone" required data-error="Please enter your Numbar">
											<div ></div>
										</div> 
									</div>
								</div>
								<div >
									<div >
										<button id="submit" type="submit">Book Table</button>
										<div id="msgSubmit" ></div> 
										<div ></div> 
									</div>
								</div>
							</div>            
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End Reservation -->
	
	<!-- Start Customer Reviews -->
	<div>
		<div >
			<div >
				<div >
					<div>
						<h2>Customer Reviews</h2>
						<p>Lorem Ipsum is simply dummy text of the printing and typesetting</p>
					</div>
				</div>
			</div>
			<div >
				<div>
					<div id="reviews" data-ride="carousel">
						<div>
							<div>
								<div>
									<img src="<%=contextPath%>/images/quotations-button.png" alt="">
								</div>
								<h5><strong >Paul Mitchel</strong></h5>
								<h6>Web Developer</h6>
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eu sem tempor, varius quam at, luctus dui. Mauris magna metus, dapibus nec turpis vel, semper malesuada ante. Idac bibendum scelerisque non non purus. Suspendisse varius nibh non aliquet.</p>
							</div>
							<%-- <div >
								<div>
									<img src="<%=contextPath%>/images/quotations-button.png" alt="">
								</div>
								<h5><strong>Steve Fonsi</strong></h5>
								<h6>Web Designer</h6>
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eu sem tempor, varius quam at, luctus dui. Mauris magna metus, dapibus nec turpis vel, semper malesuada ante. Idac bibendum scelerisque non non purus. Suspendisse varius nibh non aliquet.</p>
							</div>
							<div >
								<div>
									<img src="<%=contextPath%>/images/quotations-button.png" alt="">
								</div>
								<h5><strong >Daniel vebar</strong></h5>
								<h6>Seo Analyst</h6>
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eu sem tempor, varius quam at, luctus dui. Mauris magna metus, dapibus nec turpis vel, semper malesuada ante. Idac bibendum scelerisque non non purus. Suspendisse varius nibh non aliquet.</p>
							</div> --%>
						</div>
						<a href="#reviews" role="button" data-slide="prev">
							<i aria-hidden="true"></i>
							<span >Previous</span>
						</a>
						<a href="#reviews" role="button" data-slide="next">
							<i aria-hidden="true"></i>
							<span>Next</span>
						</a>
                    </div>
				</div>
			</div>
		</div>
	</div>
	<!-- End Customer Reviews -->

	
	<!-- Start Contact info -->
	<div class="contact-total">
		<div  class="contact-1">
			<div class="contact-2">
				<div class="sub-contact">
					<i class="fa fa-volume-control-phone"></i>
					<div class="title-contact">
						<h4>Phone</h4>
						<p>
							+01 123-456-4590
						</p>
					</div>
				</div>
				<div class="sub-contact">
					<i class="fa fa-envelope"></i>
					<div class="title-contact">
						<h4>Email</h4>
						<p>
							yourmail@gmail.com
						</p>
					</div>
				</div>
				<div class="sub-contact">
					<i class="fa fa-map-marker"></i>
					<div class="title-contact">
						<h4>Location</h4>
						<p>
							800, Lorem Street, US
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End Contact info -->
	
	<!-- Start Footer -->
	<footer>
		<div class="footer-top" >
			<div class="footer-main-top">
				<div class="footer-title">
					<h3>About Us</h3>
					<p>Integer cursus scelerisque ipsum id <br/> efficitur. Donec a dui fringilla, <br/> gravida lorem ac, semper magna. <br/> Aenean rhoncus ac lectus a <br/> interdum. Vivamus semper posuere <br/> dui.</p>
				</div>
				<div class="footer-center1">
					<h3>Subscribe</h3>
					<div>
						<form>
							<input name="EMAIL" id="subs-email" placeholder="Email Address..." type="email">
							<button type="submit" >SUBSCRIBE</button>
							<div ></div>
						</form>
					</div>
					<ul>
						<li><a href="#"><i class="fa fa-facebook"aria-hidden="true"></i></a></li>
						<li><a href="#"><i class="fa fa-instagram"aria-hidden="true"></i></a></li>
						<li><a href="#"><i class="fa fa-youtube"aria-hidden="true"></i></a></li>
						<li><a href="#"><i class="fa fa-google"aria-hidden="true"></i></a></li>
						<li><a href="#"><i class="fa fa-linkedin"aria-hidden="true"></i></a></li>
					</ul>
				</div>
				<div class="footer-center2">
					<h3>Contact information</h3>
					<p>Ipsum Street, Lorem Tower, <br> MO, Columbia, 508000</p>
					<p><a href="#">+01 2000 800 9999</a></p>
					<p><a href="#"> info@admin.com</a></p>
				</div>
				<div class="footer-right">
					<h3>Opening hours</h3>
					<p><span>Monday: </span>Closed</p>
					<p><span>Tue-Wed :</span> 9:Am - 10PM</p>
					<p><span>Thu-Fri :</span> 9:Am - 10PM</p>
					<p><span>Sat-Sun :</span> 5:PM - 10PM</p>
				</div>
			</div>
		</div>
		
		<div class="footer-bottom">
			<div >
				<div >
					<div class="footer-bottom-title">
						<p>All Rights Reserved. &copy; 2018 <a href="#">Live Dinner Restaurant</a> Design By : 
					<a href="#">html design</a></p>
					</div>
				</div>
			</div>
		</div>
		
	</footer>
	<!-- End Footer -->
	
	<a href="#" id="back-to-top" title="Back to top" style="display: none;"><i aria-hidden="true"></i></a>

	<!-- ALL JS FILES -->
    <!-- ALL PLUGINS -->
    <script type="text/javascript" src="<%=contextPath%>/js/custom.js"></script>
    <script type="text/javascript" src="<%=contextPath%>/js/menuHeader.js"></script>
    <script type="text/javascript" src="<%=contextPath%>/js/specialMenu.js"></script>
    <script type="text/javascript" src="<%=contextPath%>/js/subMenu.js"></script>
</body>
</html>