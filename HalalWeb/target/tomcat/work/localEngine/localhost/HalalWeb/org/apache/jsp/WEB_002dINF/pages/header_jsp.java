package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>cuision Website Template | Contact :: W3layouts</title>\r\n");
      out.write("\t\t<link href=\"http://localhost:9090/HalalWeb/static/css/style.css\" rel=\"stylesheet\" type=\"text/css\"  media=\"all\" />\r\n");
      out.write("\t\t<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>\r\n");
      out.write("\t\t <script type=\"text/javascript\" src=\"http://localhost:9090/HalalWeb/static/js/move-top.js\"></script>\r\n");
      out.write("\t\t<link href=\"http://localhost:9090/HalalWeb/static/css/slider.css\" rel=\"stylesheet\" type=\"text/css\"  media=\"all\" />\r\n");
      out.write("\t\t  <link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>\r\n");
      out.write("\t\t  <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script>\r\n");
      out.write("\t\t  <script type=\"text/javascript\" src=\"http://localhost:9090/HalalWeb/static/js/jquery.easing.1.3.js\"></script> \r\n");
      out.write("\t\t    <script type=\"text/javascript\" src=\"http://localhost:9090/HalalWeb/static/js/camera.min.js\"></script>\r\n");
      out.write("\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t   jQuery(function(){\r\n");
      out.write("\t\t\t\tjQuery('#camera_wrap_1').camera({\r\n");
      out.write("\t\t\t\t\theight: '350px',\r\n");
      out.write("\t\t\t\t\tpagination: false,\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t  </script>\r\n");
      out.write("\t\t  <script type=\"text/javascript\">\r\n");
      out.write("\t\t\tjQuery(document).ready(function($) {\r\n");
      out.write("\t\t\t\t$(\".scroll\").click(function(event){\t\t\r\n");
      out.write("\t\t\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1200);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<!---start-wrap---->\r\n");
      out.write("\t\t\t<!---start-header---->\r\n");
      out.write("\t\t\t<!----start--imageslider----->\r\n");
      out.write("\t\t       <!--start-image-slider---->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"slider\"  id=\"top\">\t\t\t\t\t     \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"camera_wrap camera_azure_skin\" id=\"camera_wrap_1\">\t\t\t\t\t\t\t\t\t           \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t      <div data-src=\"http://localhost:9090/HalalWeb/static/images/slider1.jpg\">  </div> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t      <div data-src=\"http://localhost:9090/HalalWeb/static/images/slider2.jpg\">  </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t      <div data-src=\"http://localhost:9090/HalalWeb/static/images/slider3.jpg\">  </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t      <div data-src=\"http://localhost:9090/HalalWeb/static/images/slider4.jpg\">  </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t   \t\t   <div class=\"clear\"> </div>\t\t\t\t\t       \r\n");
      out.write("\t\t\t\t\t\t\t \t\t</div>\r\n");
      out.write("\t\t      \t\t\t<!--End-image-slider---->\r\n");
      out.write("\t\t        <div class=\"clear\"> </div>\r\n");
      out.write("\t\t\t<!----End--imageslider----->\r\n");
      out.write("\t\t\t<!----start-top-header----->\r\n");
      out.write("\t\t\t<div class=\"wrap\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("     \t\t <div class=\"top-header top-head\">\r\n");
      out.write("     \t\t \t<div class=\"top-search\">\r\n");
      out.write("     \t\t \t\t<form>\r\n");
      out.write("     \t\t \t\t\t<input type=\"text\"><input type=\"submit\" value=\"\" />\r\n");
      out.write("     \t\t \t\t</form>\r\n");
      out.write("     \t\t \t</div>\r\n");
      out.write("     \t\t \t<div class=\"clear\"> </div>\r\n");
      out.write("     \t\t \t<div class=\"main-header\">\r\n");
      out.write("     \t\t \t\t<div class=\"logo\">\r\n");
      out.write("     \t\t \t\t\t<h1><a href=\"index.html\"><img src=\"http://localhost:9090/HalalWeb/static/images/logo.png\" title=\"logo\" /></a></h1>\r\n");
      out.write("     \t\t \t\t</div>\r\n");
      out.write("     \t\t \t\t<div class=\"top-nav\">\r\n");
      out.write("     \t\t \t\t\t<ul>\r\n");
      out.write("     \t\t \t\t\t\t<li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("     \t\t \t\t\t\t<li><a href=\"about.html\">About us</a></li>\r\n");
      out.write("     \t\t \t\t\t\t<li><a href=\"tips.html\">Cooking tips</a></li>\r\n");
      out.write("     \t\t \t\t\t\t<li><a href=\"services.html\">Services</a></li>\r\n");
      out.write("     \t\t \t\t\t\t<li><a href=\"gallery.html\">Gallery</a></li>\r\n");
      out.write("     \t\t \t\t\t\t<li class=\"active\"><a href=\"contact.html\">Contact</a></li>\r\n");
      out.write("     \t\t \t\t\t\t<div class=\"clear\"> </div>\r\n");
      out.write("     \t\t \t\t\t</ul>\r\n");
      out.write("     \t\t \t\t</div>\r\n");
      out.write("     \t\t \t\t<div class=\"clear\"> </div>\r\n");
      out.write("     \t\t \t</div>\r\n");
      out.write("     \t\t </div>\r\n");
      out.write("     \t\t  <!----End-top-header----->\r\n");
      out.write("\t\t\t<!---End-header---->");
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
