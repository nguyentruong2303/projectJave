/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.37
 * Generated at: 2020-08-14 13:03:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import tp.kits3.livedinner.vo.Tag;

public final class tagList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("tp.kits3.livedinner.vo.Tag");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");

String contextPath = request.getContextPath();
List<Tag> listtag = (List<Tag>)request.getAttribute("TagList");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\"><!-- Basic -->\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">   \r\n");
      out.write("   \r\n");
      out.write("    <!-- Mobile Metas -->\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write(" \r\n");
      out.write("     <!-- Site Metas -->\r\n");
      out.write("    <title>Live Dinner Restaurant</title>  \r\n");
      out.write("    <meta name=\"keywords\" content=\"\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Site Icons -->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"");
      out.print(contextPath);
      out.write("/images/favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("    <link rel=\"apple-touch-icon\" href=\"");
      out.print(contextPath);
      out.write("/images/apple-touch-icon.png\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Site CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(contextPath);
      out.write("/css/style.css\">    \r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(contextPath);
      out.write("/css/custom.css\">\r\n");
      out.write("\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- Start header -->\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<nav>\r\n");
      out.write("\t\t\t<div class=\"header-box\">\r\n");
      out.write("\t\t\t\t<a href=\"/webShop/index\">\r\n");
      out.write("\t\t\t\t\t<img src=\"");
      out.print(contextPath);
      out.write("/images/logo.png\" alt=\"\" />\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<!-- <button type=\"button\" data-toggle=\"collapse\" data-target=\"#navbars-rs-food\" aria-controls=\"navbars-rs-food\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t\t  <span></span>\r\n");
      out.write("\t\t\t\t</button> -->\r\n");
      out.write("\t\t\t\t<div id=\"navbars-rs-food\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/webShop/index\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/webShop/menu/list\">Menu</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/webShop/category/list\">About</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"sub-li\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" onclick=\"showMenuHeader('s1')\" id=\"dropdown-a\" data-toggle=\"dropdown\">Pages</a>\r\n");
      out.write("\t\t\t\t\t\t\t<div class= \"header-submenu\" id= \"s1\" style=\"position:relative;display:none\" aria-labelledby=\"dropdown-a\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"/webShop/book/list\">Reservation</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"/webShop/post/list\">Stuff</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"/webShop/post/list\">Gallery</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"sub-li\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" onclick=\"showMenuHeader('s2')\" id=\"dropdown-a\" data-toggle=\"dropdown\">Blog</a>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"header-submenu\" id=\"s2\" style=\"position:relative;display:none\" aria-labelledby=\"dropdown-a\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"/webShop/tag/list\">blog</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"/webShop/tag/list\">blog Single</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/webShop/contact/list\">Contact</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<!-- End header -->\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Start All Pages -->\r\n");
      out.write("\t<div >\r\n");
      out.write("\t\t<div >\r\n");
      out.write("\t\t\t<div >\r\n");
      out.write("\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t\t<h1>Reservation</h1>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- End All Pages -->\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Start Reservation -->\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<div >\r\n");
      out.write("\t\t\t<div >\r\n");
      out.write("\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t\t\t<h2>Reservation</h2>\r\n");
      out.write("\t\t\t\t\t\t<p>Lorem Ipsum is simply dummy text of the printing and typesetting</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div >\r\n");
      out.write("\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t\t\t<form id=\"contactForm\">\r\n");
      out.write("\t\t\t\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>Book a table</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input id=\"input_date\" name=\"date\" type=\"text\" value=\"\" equired data-error=\"Please enter Date\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div ></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>                                 \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input id=\"input_time\" required data-error=\"Please enter time\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div ></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>                                 \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select id=\"person\" required data-error=\"Please select Person\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <option disabled selected>Select Person*</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <option value=\"1\">1</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <option value=\"2\">2</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <option value=\"3\">3</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <option value=\"4\">4</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <option value=\"5\">5</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <option value=\"6\">6</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <option value=\"7\">7</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div ></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>Contact Details</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"name\" name=\"name\" placeholder=\"Your Name\" required data-error=\"Please enter your name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div ></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>                                 \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Your Email\" id=\"email\" name=\"email\" required data-error=\"Please enter your email\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div ></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Your Numbar\" id=\"phone\" name=\"phone\" required data-error=\"Please enter your Numbar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div ></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button id=\"submit\" type=\"submit\">Book Table</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"msgSubmit\" ></div> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div ></div> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>            \r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- End Reservation -->\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Start Customer Reviews -->\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<div >\r\n");
      out.write("\t\t\t<div >\r\n");
      out.write("\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<h2>Customer Reviews</h2>\r\n");
      out.write("\t\t\t\t\t\t<p>Lorem Ipsum is simply dummy text of the printing and typesetting</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div >\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<div id=\"reviews\" data-ride=\"carousel\">\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"");
      out.print(contextPath);
      out.write("/images/quotations-button.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5><strong >Paul Mitchel</strong></h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6>Web Developer</h6>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eu sem tempor, varius quam at, luctus dui. Mauris magna metus, dapibus nec turpis vel, semper malesuada ante. Idac bibendum scelerisque non non purus. Suspendisse varius nibh non aliquet.</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"");
      out.print(contextPath);
      out.write("/images/quotations-button.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5><strong>Steve Fonsi</strong></h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6>Web Designer</h6>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eu sem tempor, varius quam at, luctus dui. Mauris magna metus, dapibus nec turpis vel, semper malesuada ante. Idac bibendum scelerisque non non purus. Suspendisse varius nibh non aliquet.</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"");
      out.print(contextPath);
      out.write("/images/quotations-button.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5><strong >Daniel vebar</strong></h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6>Seo Analyst</h6>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam eu sem tempor, varius quam at, luctus dui. Mauris magna metus, dapibus nec turpis vel, semper malesuada ante. Idac bibendum scelerisque non non purus. Suspendisse varius nibh non aliquet.</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#reviews\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("\t\t\t\t\t\t\t<i aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t<span >Previous</span>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#reviews\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("\t\t\t\t\t\t\t<i aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t<span>Next</span>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- End Customer Reviews -->\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Start Contact info -->\r\n");
      out.write("\t<div class=\"contact-total\">\r\n");
      out.write("\t\t<div  class=\"contact-1\">\r\n");
      out.write("\t\t\t<div class=\"contact-2\">\r\n");
      out.write("\t\t\t\t<div class=\"sub-contact\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-volume-control-phone\"></i>\r\n");
      out.write("\t\t\t\t\t<div class=\"title-contact\">\r\n");
      out.write("\t\t\t\t\t\t<h4>Phone</h4>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t+01 123-456-4590\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"sub-contact\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-envelope\"></i>\r\n");
      out.write("\t\t\t\t\t<div class=\"title-contact\">\r\n");
      out.write("\t\t\t\t\t\t<h4>Email</h4>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\tyourmail@gmail.com\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"sub-contact\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-map-marker\"></i>\r\n");
      out.write("\t\t\t\t\t<div class=\"title-contact\">\r\n");
      out.write("\t\t\t\t\t\t<h4>Location</h4>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t800, Lorem Street, US\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- End Contact info -->\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Start Footer -->\r\n");
      out.write("\t<footer>\r\n");
      out.write("\t\t<div class=\"footer-top\" >\r\n");
      out.write("\t\t\t<div class=\"footer-main-top\">\r\n");
      out.write("\t\t\t\t<div class=\"footer-title\">\r\n");
      out.write("\t\t\t\t\t<h3>About Us</h3>\r\n");
      out.write("\t\t\t\t\t<p>Integer cursus scelerisque ipsum id <br/> efficitur. Donec a dui fringilla, <br/> gravida lorem ac, semper magna. <br/> Aenean rhoncus ac lectus a <br/> interdum. Vivamus semper posuere <br/> dui.</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"footer-center1\">\r\n");
      out.write("\t\t\t\t\t<h3>Subscribe</h3>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t\t\t<input name=\"EMAIL\" id=\"subs-email\" placeholder=\"Email Address...\" type=\"email\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" >SUBSCRIBE</button>\r\n");
      out.write("\t\t\t\t\t\t\t<div ></div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-facebook\"aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-instagram\"aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-youtube\"aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-google\"aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-linkedin\"aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"footer-center2\">\r\n");
      out.write("\t\t\t\t\t<h3>Contact information</h3>\r\n");
      out.write("\t\t\t\t\t<p>Ipsum Street, Lorem Tower, <br> MO, Columbia, 508000</p>\r\n");
      out.write("\t\t\t\t\t<p><a href=\"#\">+01 2000 800 9999</a></p>\r\n");
      out.write("\t\t\t\t\t<p><a href=\"#\"> info@admin.com</a></p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"footer-right\">\r\n");
      out.write("\t\t\t\t\t<h3>Opening hours</h3>\r\n");
      out.write("\t\t\t\t\t<p><span>Monday: </span>Closed</p>\r\n");
      out.write("\t\t\t\t\t<p><span>Tue-Wed :</span> 9:Am - 10PM</p>\r\n");
      out.write("\t\t\t\t\t<p><span>Thu-Fri :</span> 9:Am - 10PM</p>\r\n");
      out.write("\t\t\t\t\t<p><span>Sat-Sun :</span> 5:PM - 10PM</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"footer-bottom\">\r\n");
      out.write("\t\t\t<div >\r\n");
      out.write("\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t\t<div class=\"footer-bottom-title\">\r\n");
      out.write("\t\t\t\t\t\t<p>All Rights Reserved. &copy; 2018 <a href=\"#\">Live Dinner Restaurant</a> Design By : \r\n");
      out.write("\t\t\t\t\t<a href=\"#\">html design</a></p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t<!-- End Footer -->\r\n");
      out.write("\t\r\n");
      out.write("\t<a href=\"#\" id=\"back-to-top\" title=\"Back to top\" style=\"display: none;\"><i aria-hidden=\"true\"></i></a>\r\n");
      out.write("\r\n");
      out.write("\t<!-- ALL JS FILES -->\r\n");
      out.write("    <!-- ALL PLUGINS -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(contextPath);
      out.write("/js/custom.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(contextPath);
      out.write("/js/menuHeader.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(contextPath);
      out.write("/js/specialMenu.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(contextPath);
      out.write("/js/subMenu.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}