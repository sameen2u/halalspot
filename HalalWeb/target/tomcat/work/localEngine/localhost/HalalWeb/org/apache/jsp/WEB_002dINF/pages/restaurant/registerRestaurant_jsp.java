package org.apache.jsp.WEB_002dINF.pages.restaurant;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registerRestaurant_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/pages/restaurant/../header.jsp");
    _jspx_dependants.add("/WEB-INF/pages/restaurant/../footer.jsp");
  }

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

      out.write("<!--\r\n");
      out.write("Author: W3layouts\r\n");
      out.write("Author URL: http://w3layouts.com\r\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\r\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>RECEIPES Bootstarp responsive Website Template| Home :: w3layouts</title>\r\n");
      out.write("<link href=\"http://localhost:9090/HalalWeb/static/css/bootstrap.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("<script src=\"http://localhost:9090/HalalWeb/static/js/jquery.min.js\"></script>\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<link href=\"http://localhost:9090/HalalWeb/static/css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<!--webfont-->\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900,200italic,300italic,400italic,600italic,700italic,900italic' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Lobster+Two:400,400italic,700,700italic' rel='stylesheet' type='text/css'>\r\n");
      out.write("<!--Animation-->\r\n");
      out.write("<script src=\"http://localhost:9090/HalalWeb/static/js/wow.min.js\"></script>\r\n");
      out.write("<script src=\"http://localhost:9090/HalalWeb/static/js/common.js\"></script>\r\n");
      out.write("<link href=\"http://localhost:9090/HalalWeb/static/css/animate.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<script>\r\n");
      out.write("\tnew WOW().init();\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"http://localhost:9090/HalalWeb/static/js/simpleCart.min.js\"> </script>\t\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://localhost:9090/HalalWeb/static/js/move-top.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://localhost:9090/HalalWeb/static/js/easing.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tjQuery(document).ready(function($) {\r\n");
      out.write("\t\t\t\t$(\".scroll\").click(function(event){\t\t\r\n");
      out.write("\t\t\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1200);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- header-section-starts -->\r\n");
      out.write("\t<div class=\"header\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"top-header\">\r\n");
      out.write("\t\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t\t<a href=\"http://localhost:9090/HalalWeb\"><img src=\"http://localhost:9090/HalalWeb/static/images/logo.png\" class=\"img-responsive\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"header-right\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"login-section\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"login\">Login</a>  </li> |\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"addRestaurant\">Add Restaurant</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"menu-bar\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<form class=\"form-wrapper cf\">\r\n");
      out.write("     \t\t\t<input class=\"searchTitle\" \"text\" placeholder=\"Search location\" required>\r\n");
      out.write("\t\t\t  \t<input class=\"searchBox\" type=\"text\" placeholder=\"Search for... restaurant, cuisine, dish\" required>\r\n");
      out.write("\t\t\t\t<button type=\"button\" onclick=\"search()\">Search</button>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- content-section-starts -->\r\n");
      out.write("\t<div class=\"content\">\r\n");
      out.write("\t<div class=\"main\">\r\n");
      out.write("\t   <div class=\"container\">\r\n");
      out.write("\t\t  <div class=\"register\">\r\n");
      out.write("\t\t  \t  <form> \r\n");
      out.write("\t\t\t\t <div class=\"register-top-grid\">\r\n");
      out.write("\t\t\t\t\t<h3>Add Restaurant</h3>\r\n");
      out.write("\t\t\t\t\t <div class=\"wow fadeInLeft\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t<span>RESTAURANT NAME<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\"> \r\n");
      out.write("\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t<span>STREET ADDRESS<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\"> \r\n");
      out.write("\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t <div class=\"wow fadeInLeft\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t <span>CITY<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t\t <input type=\"text\"> \r\n");
      out.write("\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t  <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t <span>PINCODE<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t\t <input type=\"text\"> \r\n");
      out.write("\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t <div class=\"wow fadeInLeft\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t <span>LANDMARK<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t\t <input type=\"text\"> \r\n");
      out.write("\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t <div class=\"wow fadeInLeft\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t <span>RESTAURANT PHONE NUMBER<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t\t <input type=\"text\"> \r\n");
      out.write("\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t  <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t <span>RESTAURANT EMAIL<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t\t <input type=\"text\"> \r\n");
      out.write("\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t <div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t   <a class=\"news-letter\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\" checked=\"false\"><i> </i>ARE YOU THE OWNER</label>\r\n");
      out.write("\t\t\t\t\t   </a>\r\n");
      out.write("\t\t\t\t\t  <div class=\"clearfix\"> </div><div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t      <div class=\"wow fadeInLeft\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t <span>OWNER PHONE NUMBER<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t\t <input type=\"text\"> \r\n");
      out.write("\t\t\t\t\t  </div> \r\n");
      out.write("\t\t\t\t      <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t <span>OWNER EMAIL<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t\t <input type=\"text\"> \r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t  <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t <span>OPENING STATUS<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t  <select>\r\n");
      out.write("\t\t\t\t\t\t  <option value=\"volvo\">Select Status</option>\r\n");
      out.write("\t\t\t\t\t\t  <option value=\"saab\">Opened</option>\r\n");
      out.write("\t\t\t\t\t\t  <option value=\"mercedes\">Opening Soon</option>\r\n");
      out.write("\t\t\t\t\t\t  <option value=\"audi\">Temporary Closed</option>\r\n");
      out.write("\t\t\t\t\t\t   <option value=\"audi\">Renovating In Progress</option>\r\n");
      out.write("\t\t\t\t\t\t</select> \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t  <div class=\"wow fadeInLeft\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t <span>YOUR EMAIL<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t\t <input type=\"text\"> \r\n");
      out.write("\t\t\t\t\t  </div> \r\n");
      out.write("\t\t\t\t\t  <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t <span>CUISINE<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t\t <input type=\"text\"> \r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t    <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t <span>WEBSITE<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t\t <input type=\"text\"> \r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t  <div class=\"wow fadeInLeft\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t <span>FACEBOOK PAGE<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t\t <input type=\"text\"> \r\n");
      out.write("\t\t\t\t\t  </div> \r\n");
      out.write("\t\t\t\t\t  <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t <span>TWITTER PAGE<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t\t <input type=\"text\"> \r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t  <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t <span>HALAL AUTHENTICITY<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t  <select>\r\n");
      out.write("\t\t\t\t\t\t  <option value=\"volvo\">Select Authenticity</option>\r\n");
      out.write("\t\t\t\t\t\t  <option value=\"saab\">Owners are Muslim</option>\r\n");
      out.write("\t\t\t\t\t\t  <option value=\"mercedes\">Halal Sign Board</option>\r\n");
      out.write("\t\t\t\t\t\t  <option value=\"audi\">Halal Certificate</option>\r\n");
      out.write("\t\t\t\t\t\t</select> \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t <span>HALAL SERVING<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t  <select>\r\n");
      out.write("\t\t\t\t\t\t  <option value=\"volvo\">Select Options</option>\r\n");
      out.write("\t\t\t\t\t\t  <option value=\"saab\">Full Halal</option>\r\n");
      out.write("\t\t\t\t\t\t  <option value=\"mercedes\">Partial Halal</option>\r\n");
      out.write("\t\t\t\t\t\t</select> \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t  <div class=\"wow fadeInRight\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t <span>OTHER DETAILS<label>*</label></span>\r\n");
      out.write("\t\t\t\t\t\t <textarea></textarea>\r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t  </p>\r\n");
      out.write("\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t<div class=\"register-but\">\r\n");
      out.write("\t\t\t\t   <form>\r\n");
      out.write("\t\t\t\t\t   <input type=\"submit\" value=\"Add the Restaurant\">\r\n");
      out.write("\t\t\t\t\t   <div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t   </form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t   </div>\r\n");
      out.write("\t     </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("<div class=\"special-offers-section\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"special-offers-section-head text-center dotted-line\">\r\n");
      out.write("\t\t\t\t\t<h4>Special Offers</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"special-offers-section-grids\">\r\n");
      out.write("\t\t\t\t <div class=\"m_3\"><span class=\"middle-dotted-line\"> </span> </div>\r\n");
      out.write("\t\t\t\t   <div class=\"container\">\r\n");
      out.write("\t\t\t\t\t  <ul id=\"flexiselDemo3\">\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"offer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"offer-image\">\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"http://localhost:9090/HalalWeb/static/images/p1.jpg\" class=\"img-responsive\" alt=\"\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"offer-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>Olister Combo pack lorem</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. </p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"button\" value=\"Grab It\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"offer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"offer-image\">\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"http://localhost:9090/HalalWeb/static/images/p2.jpg\" class=\"img-responsive\" alt=\"\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"offer-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>Chicken Jumbo pack lorem</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. </p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"button\" value=\"Grab It\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"offer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"offer-image\">\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"http://localhost:9090/HalalWeb/static/images/p3.jpg\" class=\"img-responsive\" alt=\"\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"offer-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>Crab Combo pack lorem</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. </p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"button\" value=\"Grab It\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"offer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"offer-image\">\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"http://localhost:9090/HalalWeb/static/images/p2.jpg\" class=\"img-responsive\" alt=\"\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"offer-text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>Chicken Jumbo pack lorem</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. </p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"button\" value=\"Grab It\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t    </li>\r\n");
      out.write("\t\t\t\t\t </ul>\r\n");
      out.write("\t\t\t\t <script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\t$(window).load(function() {\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t$(\"#flexiselDemo3\").flexisel({\r\n");
      out.write("\t\t\t\t\t\t\tvisibleItems: 3,\r\n");
      out.write("\t\t\t\t\t\t\tanimationSpeed: 1000,\r\n");
      out.write("\t\t\t\t\t\t\tautoPlay: true,\r\n");
      out.write("\t\t\t\t\t\t\tautoPlaySpeed: 3000,    \t\t\r\n");
      out.write("\t\t\t\t\t\t\tpauseOnHover: true,\r\n");
      out.write("\t\t\t\t\t\t\tenableResponsiveBreakpoints: true,\r\n");
      out.write("\t\t\t\t\t\t\tresponsiveBreakpoints: { \r\n");
      out.write("\t\t\t\t\t\t\t\tportrait: { \r\n");
      out.write("\t\t\t\t\t\t\t\t\tchangePoint:480,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvisibleItems: 1\r\n");
      out.write("\t\t\t\t\t\t\t\t}, \r\n");
      out.write("\t\t\t\t\t\t\t\tlandscape: { \r\n");
      out.write("\t\t\t\t\t\t\t\t\tchangePoint:640,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvisibleItems: 2\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\ttablet: { \r\n");
      out.write("\t\t\t\t\t\t\t\t\tchangePoint:768,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvisibleItems: 3\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t    </script>\r\n");
      out.write("\t\t\t\t    <script type=\"text/javascript\" src=\"http://localhost:9090/HalalWeb/static/js/jquery.flexisel.js\"></script>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- content-section-ends -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"contact-section\" id=\"contact\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"contact-section-grids\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 contact-section-grid wow fadeInLeft\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t<h4>Site Links</h4>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"point\"></i></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"data\"><a href=\"#\">About Us</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"point\"></i></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"data\"><a href=\"#\">Contact Us</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"point\"></i></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"data\"><a href=\"#\">Privacy Policy</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"point\"></i></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"data\"><a href=\"#\">Terms of Use</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 contact-section-grid wow fadeInLeft\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t<h4>Site Links</h4>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"point\"></i></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"data\"><a href=\"#\">About Us</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"point\"></i></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"data\"><a href=\"#\">Contact Us</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"point\"></i></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"data\"><a href=\"#\">Privacy Policy</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"point\"></i></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"data\"><a href=\"#\">Terms of Use</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 contact-section-grid wow fadeInRight\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t<h4>Follow Us On...</h4>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"fb\"></i></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"data\"> <a href=\"#\">  Facebook</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"tw\"></i></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"data\"> <a href=\"#\">Twitter</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"in\"></i></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"data\"><a href=\"#\"> Linkedin</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"gp\"></i></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"data\"><a href=\"#\">Google Plus</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 contact-section-grid nth-grid wow fadeInRight\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t\t\t\t<h4>Subscribe Newsletter</h4>\r\n");
      out.write("\t\t\t\t\t\t<p>To get latest updates and food deals every week</p>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"text\" value=\"\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = '';}\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"submit\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- content-section-ends -->\r\n");
      out.write("\t<!-- footer-section-starts -->\r\n");
      out.write("\t<div class=\"footer\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<p class=\"wow fadeInLeft\" data-wow-delay=\"0.4s\">&copy; 2014  All rights  Reserved | Template by &nbsp;<a href=\"http://w3layouts.com\" target=\"target_blank\">W3Layouts</a></p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- footer-section-ends -->\r\n");
      out.write("\t  <script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t\t\t\t\t/*\r\n");
      out.write("\t\t\t\t\t\t\tvar defaults = {\r\n");
      out.write("\t\t\t\t\t  \t\t\tcontainerID: 'toTop', // fading element id\r\n");
      out.write("\t\t\t\t\t\t\t\tcontainerHoverID: 'toTopHover', // fading element hover id\r\n");
      out.write("\t\t\t\t\t\t\t\tscrollSpeed: 1200,\r\n");
      out.write("\t\t\t\t\t\t\t\teasingType: 'linear' \r\n");
      out.write("\t\t\t\t\t \t\t};\r\n");
      out.write("\t\t\t\t\t\t\t*/\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t$().UItoTop({ easingType: 'easeOutQuart' });\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t<a href=\"#\" id=\"toTop\" style=\"display: block;\"> <span id=\"toTopHover\" style=\"opacity: 1;\"> </span></a>\r\n");
      out.write("\r\n");
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
