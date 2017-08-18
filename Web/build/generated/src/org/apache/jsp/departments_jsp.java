package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class departments_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\r\n");
      out.write("    <title>HRMS</title>\r\n");
      out.write("    <!-- Font Awesome -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.0/css/font-awesome.min.css\">\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Material Design Bootstrap -->\r\n");
      out.write("    <link href=\"css/mdb.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Your custom styles (optional) -->\r\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write(" \r\n");
      out.write("<style>\r\n");
      out.write("    \r\n");
      out.write("    @media screen and (min-width: 480px)\r\n");
      out.write("    {\r\n");
      out.write("        .ada{\r\n");
      out.write("        padding:0.3%   \r\n");
      out.write("        }   \r\n");
      out.write("    }\r\n");
      out.write("    /* The side navigation menu */\r\n");
      out.write(".sidenav {\r\n");
      out.write("    height: 100%; /* 100% Full-height */\r\n");
      out.write("    width: 0; /* 0 width - change this with JavaScript */\r\n");
      out.write("    position: fixed; /* Stay in place */\r\n");
      out.write("    z-index: 1; /* Stay on top */\r\n");
      out.write("    top: 0;\r\n");
      out.write("    left: 0;\r\n");
      out.write("    background-color: white; /* Black*/\r\n");
      out.write("    overflow-x: hidden; /* Disable horizontal scroll */\r\n");
      out.write("    padding-top: 60px; /* Place content 60px from the top */\r\n");
      out.write("    transition: 0.5s; /* 0.5 second transition effect to slide in the sidenav */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* The navigation menu links */\r\n");
      out.write(".sidenav a {\r\n");
      out.write("    padding: 8px 8px 8px 32px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    font-size: 25px;\r\n");
      out.write("    color: #818181;\r\n");
      out.write("    display: block;\r\n");
      out.write("    transition: 0.3s\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* When you mouse over the navigation links, change their color */\r\n");
      out.write(".sidenav a:hover, .offcanvas a:focus{\r\n");
      out.write("    color: #4B515D;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Position and style the close button (top right corner) */\r\n");
      out.write(".sidenav .closebtn {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 0;\r\n");
      out.write("    right: 25px;\r\n");
      out.write("    font-size: 36px;\r\n");
      out.write("    margin-left: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Style page content - use this if you want to push the page content to the right when you open the side navigation */\r\n");
      out.write("\r\n");
      out.write("/* On smaller screens, where height is less than 450px, change the style of the sidenav (less padding and a smaller font size) */\r\n");
      out.write("@media screen and (max-height: 950px) {\r\n");
      out.write("    .sidenav {padding-top: 15px;}\r\n");
      out.write("    .sidenav a {font-size: 18px;}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    /* Set the width of the side navigation to 250px and the left margin of the page content to 250px and add a black background color to body */\r\n");
      out.write("function openNav() {\r\n");
      out.write("    document.getElementById(\"mySidenav\").style.width = \"250px\";\r\n");
      out.write("   // document.getElementById(\"main\").style.marginLeft = \"250px\";\r\n");
      out.write("    document.body.style.backgroundColor = \"rgba(0,0,0,0.4)\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Set the width of the side navigation to 0 and the left margin of the page content to 0, and the background color of body to white */\r\n");
      out.write("function closeNav() {\r\n");
      out.write("    document.getElementById(\"mySidenav\").style.width = \"0\";\r\n");
      out.write("//    document.getElementById(\"main\").style.marginLeft = \"0\";\r\n");
      out.write("    document.body.style.backgroundColor = \"white\";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <!--Navbar primary-color-dark    -->\r\n");
      out.write("<nav class=\"navbar navbar-toggleable-md navbar-dark z-depth-1 primary-color-dark fixed-top ada\" style=\"z-index:5;\">\r\n");
      out.write("    <div class=\"container \">\r\n");
      out.write("        \r\n");
      out.write("        <button class=\"navbar-toggler navbar-toggler-left\" onclick=\"openNav()\" type=\"button\" data-toggle=\"\" data-target=\"#collapseEx12\" aria-controls=\"collapseEx2\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        \r\n");
      out.write("        <a class=\"navbar-brand mx-auto d-block hidden-sm-down\" href=\"#\" style=\"\">\r\n");
      out.write("            <img src=\"img/logo.png\"  class=\"img-responsive\" style=\"margin:0px;padding:0px;width: 100%\">\r\n");
      out.write("        </a>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <a class=\"navbar-brand mx-auto d-block hidden-md-up\" href=\"#\"><center><img src=\"img/logo.png\" class=\"\" style=\"width:50%\">&nbsp;&nbsp;</center></a>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"collapseEx12\">\r\n");
      out.write("            <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("                <li class=\"nav-item  \" style=\"margin:0%;padding:0%\" id=\"HomeMenu\" >\r\n");
      out.write("                    <a class=\"nav-link\" style=\"font-size:90%\" href=\"home.html\">Home</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item btn-group\" style=\"margin:0%;padding:0%\">\r\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" id=\"dropdownMenu1\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\" style=\"font-size:90%\">Employee</a>\r\n");
      out.write("                    <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenu1\">\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"AddEmployee.html\">Add Employee</a>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"Employee.html\">Manage Employee</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                \r\n");
      out.write("                <li class=\"nav-item btn-group\" style=\"margin:0%;padding:0%\">\r\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" id=\"dropdownMenu1\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\" style=\"font-size:90%\">Departments</a>\r\n");
      out.write("                    <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenu1\">\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"AddDepartment.html\">Add Department</a>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"departments.html\">Manage Department</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                \r\n");
      out.write("                <li class=\"nav-item btn-group\" style=\"margin:0%;padding:0%\">\r\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" id=\"dropdownMenu1\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\" style=\"font-size:90%\">Position</a>\r\n");
      out.write("                    <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenu1\">\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"AddPosition.html\">Add Position</a>\r\n");
      out.write("                        <a class=\"dropdown-item\" href=\"position.html\">Manage Position</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                <li class=\"nav-item\" id=\"BlogMenu\" style=\"margin:0%;padding:0%\">\r\n");
      out.write("                    <a class=\"nav-link\" style=\"font-size:90%\">Support</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                \r\n");
      out.write("                <li class=\"nav-item\" id=\"BlogMenu\" style=\"margin:0%;padding:0%\">\r\n");
      out.write("                    <a class=\"nav-link\" style=\"font-size:90%\">Docs</a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("            \r\n");
      out.write("            <ul class=\"navbar-nav ml-auto \" style=\"backgroud-color:red\">\r\n");
      out.write("                <li class=\"nav-item avatar dropdown\">\r\n");
      out.write("                    <a class=\"nav-link dropdown-toggle waves-effect waves-light\" href=\"#\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Profile</a>\r\n");
      out.write("                    <div class=\"dropdown-menu dropdown-warning dropdown-menu-right\" aria-labelledby=\"navbarDropdownMenuLink\" data-dropdown-in=\"fadeIn\" data-dropdown-out=\"fadeOut\">\r\n");
      out.write("                        <a class=\"dropdown-item waves-effect waves-light\" href=\"#\">Manage Profile</a>\r\n");
      out.write("                        <a class=\"dropdown-item waves-effect waves-light\" href=\"#\">Logout</a>\r\n");
      out.write("                        <a class=\"dropdown-item waves-effect waves-light\" href=\"#\">Developer Mode</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<!--/.Navbar-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"mySidenav\" class=\"sidenav z-depth-3\" style=\"z-index:8\">\r\n");
      out.write("  <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\r\n");
      out.write("  <a href=\"index.php\">Home</a>\r\n");
      out.write("  <a href=\"Events.php\">Events</a>\r\n");
      out.write("  <a href=\"#\">Gallery</a>\r\n");
      out.write("  <a href=\"index.php#aboutGDG\">About</a>\r\n");
      out.write("  <a href=\"team.php\">Team</a>\r\n");
      out.write("  <a href=\"contact.php\">Contact Us</a>\r\n");
      out.write("  <a href=\"http://blog.gdgjalandhar.com\">Blog</a>\r\n");
      out.write("</div>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12   \">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"row\" >\r\n");
      out.write("                        <div class=\"col-md-6 col-6\" style=\"padding-top:1%;padding-bottom:0px\">\r\n");
      out.write("                            <h5 class=\"h5-responsive\" style=\"padding:0px;margin:0px\">\r\n");
      out.write("                            <i class=\"fa fa-2x fa-dashboard\" aria-hidden=\"true\" style=\"color:#4B515D\"></i> Manage Departments\r\n");
      out.write("                            </h5>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-6 col-6\" style=\"padding-top:2%;padding-bottom:0px\">\r\n");
      out.write("                            <img src=\"img/logoColor.png\" style=\"width:20%\" class=\"float-right\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\" style=\"padding-top:0%\">\r\n");
      out.write("                        <div class=\"col-md-12\" style=\"padding:0px\">\r\n");
      out.write("                            <hr>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12 \">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                 \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <br>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12 \">\r\n");
      out.write("                <div class=\"container-fluid\" style=\"padding:0px\">\r\n");
      out.write("                  \r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-12\">\r\n");
      out.write("                            <table class=\"table table-striped table-hover\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th>Department ID</th>\r\n");
      out.write("                                        <th>Department Name</th>\r\n");
      out.write("                                        <th>Actions</th>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                                <tbody>\r\n");
      out.write("                                    \r\n");
      out.write("                                    ");

                                        int count=0;
                                        try{  
                                                Class.forName("com.mysql.jdbc.Driver");  
                                                Connection con1=DriverManager.getConnection(  
                                                "jdbc:mysql://localhost:3306/hrms","root","");  
                                                //here sonoo is database name, root is username and password  
                                                Statement s=con1.createStatement();  
                                                ResultSet r=s.executeQuery("select count(*) from department");  
                                                int i=0;
                                                while(r.next()){ 
                                                    count = r.getInt(1);
                                                    out.println("<tr>");
                                                        out.println("<th scope='row'>"+i+++"</th>");
                                                        out.println("<td>"+r.getString(2)+"</td>");
                                                        out.println("<td>");
                                                            out.println("<a class='teal-text' href='"+r.getInt(1)+"'><i class='fa fa-pencil'></i></a>");
                                                            out.println("<a class='teal-text' href='"+r.getInt(1)+"'><i class='fa fa-pencil'></i></a>");
                                                        out.println("</td>");
                                                        out.println("</tr>");
                                                             //out.println("<a class='teal-text'><i class='fa fa-pencil'></i></a>");
                                                        //out.println("<tr><td>"+r.getInt(1)+"</td><td>"+r.getString(2)+"</td><td>"+r.getString(3)+"</td></tr>");
                                               // System.out.println(r.getInt(1)+" \t\t"+r.getString(6)+"\t\t"+r.getString(2)); 
                                                } 
                                                con1.close();  
                                                }
                                            catch(Exception e){ System.out.println(e);}

                                              //out.println(count);

                                    
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                </tbody>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>  \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Start your project here-->\r\n");
      out.write("<!--\r\n");
      out.write("    <div style=\"height: 100vh\">\r\n");
      out.write("        <div class=\"flex-center flex-column\">\r\n");
      out.write("            <h1 class=\"animated fadeIn mb-2\">Material Design for Bootstrap</h1>\r\n");
      out.write("\r\n");
      out.write("            <h5 class=\"animated fadeIn mb-1\">Thank you for using our product. We're glad you're with us.</h5>\r\n");
      out.write("\r\n");
      out.write("            <p class=\"animated fadeIn text-muted\">MDB Team</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("-->\r\n");
      out.write("    <!-- /Start your project here-->\r\n");
      out.write("\r\n");
      out.write("    <!-- SCRIPTS -->\r\n");
      out.write("    <!-- JQuery -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("    <!-- Bootstrap tooltips -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/tether.min.js\"></script>\r\n");
      out.write("    <!-- Bootstrap core JavaScript -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- MDB core JavaScript -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/mdb.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
