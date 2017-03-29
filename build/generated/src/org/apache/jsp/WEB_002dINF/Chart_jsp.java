package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Chart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/../index.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Charts</title>\n");
      out.write("        <script src='../css/Chart.min.js'></script>\n");
      out.write("        <style>\n");
      out.write("            .container1 {\n");
      out.write("                 width: 50%;\n");
      out.write("                 height: 30%;\n");
      out.write("                 margin: auto;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title></title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/adminPanel.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("<!-- horizontal nav bar --> \n");
      out.write("    \n");
      out.write("<nav class=\"navbar he navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">  \n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("        <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<!--horizontal navbar completed-->\n");
      out.write("<!-- vertical navbar starts -->\n");
      out.write("\n");
      out.write("<div class=\"nav-side-menu\">\n");
      out.write("    <div class=\"brand\">\n");
      out.write("      <img class=\"img-thumbnail\" alt=\"Stroy Bulletin\" src=\"img/logo.jpg\" height=\"50px\" width=\"50px\">\n");
      out.write("      &nbsp;&nbsp;&nbsp;<b>Admin Panel</b>\n");
      out.write("    </div> \n");
      out.write("    <i class=\"fa fa-bars fa-2x toggle-btn\" data-toggle=\"collapse\" data-target=\"#menu-content\"></i>\n");
      out.write("  \n");
      out.write("        <div class=\"menu-list\">\n");
      out.write("  \n");
      out.write("            <ul id=\"menu-content\" class=\"menu-content collapse out\">\n");
      out.write("                <li id=\"li1\">\n");
      out.write("                  <a href=\"c.html\">\n");
      out.write("                  <i class=\"fa fa-dashboard fa-lg\"></i> Dashboard\n");
      out.write("                  </a>  \n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li  data-toggle=\"collapse\" data-target=\"#products\" class=\"collapsed active\">\n");
      out.write("                  <a href=\"#\"><i class=\"fa fa-gift fa-lg\"></i> UI Elements <span class=\"arrow\"></span></a>\n");
      out.write("                </li>\n");
      out.write("                <ul class=\"sub-menu collapse\" id=\"products\">\n");
      out.write("                    <li class=\"active\"><a href=\"#\">CSS3 Animation</a></li>\n");
      out.write("                    <li><a href=\"#\">General</a></li>\n");
      out.write("                    <li><a href=\"#\">Buttons</a></li>\n");
      out.write("                    <li><a href=\"#\">Tabs & Accordions</a></li>\n");
      out.write("                    <li><a href=\"#\">Typography</a></li>\n");
      out.write("                    <li><a href=\"#\">FontAwesome</a></li>\n");
      out.write("                    <li><a href=\"#\">Slider</a></li>\n");
      out.write("                    <li><a href=\"#\">Panels</a></li>\n");
      out.write("                    <li><a href=\"#\">Widgets</a></li>\n");
      out.write("                    <li><a href=\"#\">Bootstrap Model</a></li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <li data-toggle=\"collapse\" data-target=\"#service\" class=\"collapsed\">\n");
      out.write("                  <a href=\"#\"><i class=\"fa fa-bar-chart-o fa-fw\"></i> Charts <span class=\"arrow\"></span></a>\n");
      out.write("                </li>  \n");
      out.write("                <ul class=\"sub-menu collapse\" id=\"service\">\n");
      out.write("                    <li><a href=\"WEB-INF/Chart.jsp\">Demo</a></li>\n");
      out.write("                  <li>New Service 2</li>\n");
      out.write("                  <li>New Service 3</li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <li data-toggle=\"collapse\" data-target=\"#new\" class=\"collapsed\">\n");
      out.write("                  <a href=\"#\"><i class=\"fa fa-users fa-lg\"></i>  Users <span class=\"arrow\"></span></a>\n");
      out.write("                </li>\n");
      out.write("                <ul class=\"sub-menu collapse\" id=\"new\">\n");
      out.write("                  <li><a href=\"OnlineUsers.html\">Online Users</a></li>\n");
      out.write("                  <li>All Users</li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                 <li>\n");
      out.write("                  <a href=\"#\">\n");
      out.write("                  <i class=\"fa fa-user fa-lg\"></i> Profile\n");
      out.write("                  </a>\n");
      out.write("                  </li>\n");
      out.write("\n");
      out.write("                 <li>\n");
      out.write("                  <a href=\"#\">\n");
      out.write("                  <i class=\"fa fa-users fa-lg\"></i> Users\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("     </div>\n");
      out.write("</div>\n");
      out.write("<!-- vertical navbar completed>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write(" \n");
      out.write("        <div class=\"container1\">\n");
      out.write("            <div>\n");
      out.write("                  <canvas id=\"myChart\" width=\"600\" height=\"400\"></canvas>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("       <div class=\"c1\">\n");
      out.write("            <div>\n");
      out.write("                <canvas id=\"myChart2\" width=\"600\" height=\"400\"></canvas>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("    var ctx = document.getElementById(\"myChart\").getContext('2d');\n");
      out.write("    var myChart = new Chart(ctx, {\n");
      out.write("        type: 'doughnut',\n");
      out.write("        data: {\n");
      out.write("        labels: [\"7AM-3PM\", \"3PM-11PM\", \"11PM-7AM\"],\n");
      out.write("        datasets: [{\n");
      out.write("            backgroundColor: [\n");
      out.write("                \"#2ecc71\",\n");
      out.write("                \"#3498db\",\n");
      out.write("                \"#95a5a6\",\n");
      out.write("            ],\n");
      out.write("            data: [12, 19, 3]\n");
      out.write("        }]\n");
      out.write("       }\n");
      out.write("    });\n");
      out.write("   \n");
      out.write("    var ctx1 = document.getElementById('myChart2').getContext('2d');\n");
      out.write("    var myChart1 = new Chart(ctx1, {\n");
      out.write("      type: 'line',\n");
      out.write("      data: {\n");
      out.write("        labels: [\"7AM-3PM\", \"3PM-11PM\", \"11PM-7AM\"],\n");
      out.write("        datasets: [{\n");
      out.write("          label: 'no. of views',\n");
      out.write("          data: [12, 19, 3],\n");
      out.write("          backgroundColor: \"rgba(153,255,51,0.4)\",\n");
      out.write("          borderColor: \"rgba(153,255,51,1)\"\n");
      out.write("        }]\n");
      out.write("      }\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
