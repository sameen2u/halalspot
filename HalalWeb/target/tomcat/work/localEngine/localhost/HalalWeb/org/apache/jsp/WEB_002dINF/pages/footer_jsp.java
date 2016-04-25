package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!---start-content---->\r\n");
      out.write("\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t<!-----start-contact----->\r\n");
      out.write("\t\t\t\t<div class=\"contact\">\r\n");
      out.write("\t\t\t\t<div class=\"section group\">\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"col span_1_of_3\">\r\n");
      out.write("\t\t\t\t\t<div class=\"contact_info\">\r\n");
      out.write("\t\t\t    \t \t<h3>Find Us Here</h3>\r\n");
      out.write("\t\t\t    \t \t\t<!-- <div class=\"map\">\r\n");
      out.write("\t\t\t\t\t   \t\t\t<iframe width=\"100%\" height=\"175\" frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" src=\"https://maps.google.co.in/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Lighthouse+Point,+FL,+United+States&amp;aq=4&amp;oq=light&amp;sll=26.275636,-80.087265&amp;sspn=0.04941,0.104628&amp;ie=UTF8&amp;hq=&amp;hnear=Lighthouse+Point,+Broward,+Florida,+United+States&amp;t=m&amp;z=14&amp;ll=26.275636,-80.087265&amp;output=embed\"></iframe><br><small><a href=\"https://maps.google.co.in/maps?f=q&amp;source=embed&amp;hl=en&amp;geocode=&amp;q=Lighthouse+Point,+FL,+United+States&amp;aq=4&amp;oq=light&amp;sll=26.275636,-80.087265&amp;sspn=0.04941,0.104628&amp;ie=UTF8&amp;hq=&amp;hnear=Lighthouse+Point,+Broward,+Florida,+United+States&amp;t=m&amp;z=14&amp;ll=26.275636,-80.087265\" style=\"color:#666;text-align:left;font-size:12px\">View Larger Map</a></small>\r\n");
      out.write("\t\t\t\t\t   \t\t</div> -->\r\n");
      out.write("      \t\t\t\t</div>\r\n");
      out.write("      \t\t\t<div class=\"company_address\">\r\n");
      out.write("\t\t\t\t     \t<h3>Company Information :</h3>\r\n");
      out.write("\t\t\t\t\t\t    \t<p>500 Lorem Ipsum Dolor Sit,</p>\r\n");
      out.write("\t\t\t\t\t\t   \t\t<p>22-56-2-9 Sit Amet, Lorem,</p>\r\n");
      out.write("\t\t\t\t\t\t   \t\t<p>USA</p>\r\n");
      out.write("\t\t\t\t   \t\t<p>Phone:(00) 222 666 444</p>\r\n");
      out.write("\t\t\t\t   \t\t<p>Fax: (000) 000 00 00 0</p>\r\n");
      out.write("\t\t\t\t \t \t<p>Email: <span>info@mycompany.com</span></p>\r\n");
      out.write("\t\t\t\t   \t\t<p>Follow on: <span>Facebook</span>, <span>Twitter</span></p>\r\n");
      out.write("\t\t\t\t   </div>\r\n");
      out.write("\t\t\t\t</div>\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"col span_2_of_3\">\r\n");
      out.write("\t\t\t\t  <div class=\"contact-form\">\r\n");
      out.write("\t\t\t\t  \t<h3>Login</h3>\r\n");
      out.write("\t\t\t\t\t    <form method=\"post\" action=\"contact-post.html\">\r\n");
      out.write("\t\t\t\t\t    \t\r\n");
      out.write("\t\t\t\t\t\t    <div>\r\n");
      out.write("\t\t\t\t\t\t    \t<span><label>E-MAIL</label></span>\r\n");
      out.write("\t\t\t\t\t\t    \t<span><input name=\"userEmail\" type=\"text\" class=\"textbox\"></span>\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t\t    <div>\r\n");
      out.write("\t\t\t\t\t\t     \t<span><label>Password</label></span>\r\n");
      out.write("\t\t\t\t\t\t    \t<span><input name=\"userPhone\" type=\"password\" class=\"textbox\"></span>\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t\t   <div>\r\n");
      out.write("\t\t\t\t\t\t   \t\t<span><input type=\"submit\" value=\"Submit\"></span>\r\n");
      out.write("\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t    </form>\r\n");
      out.write("\t\t\t\t\t    <span><input type=\"checkbox\">Remember Me</a></span>\r\n");
      out.write("\t\t\t\t\t    <span><a href=\"#\">Sign up</a></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("  \t\t\t\t</div>\t\t\t\t\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-----End-contact----->\r\n");
      out.write("\t\t\t\t<div class=\"clear\"> </div>\r\n");
      out.write("\t\t\t<!---End-content---->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!---End-wrap---->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"footer\">\r\n");
      out.write("\t\t\t\t<div class=\"top-to-page\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#top\" class=\"scroll\"> </a>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clear\"> </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<p>Design by <a href=\"http://w3layouts.com/\">W3layouts</a></p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
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
