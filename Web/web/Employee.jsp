<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>HRMS</title>
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.0/css/font-awesome.min.css">
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- Material Design Bootstrap -->
    <link href="css/mdb.min.css" rel="stylesheet">
    <!-- Your custom styles (optional) -->
    <link href="css/style.css" rel="stylesheet">
 <style>
    
    @media screen and (min-width: 480px)
    {
        .ada{
        padding:0.3%   
        }   
    }
    /* The side navigation menu */
.sidenav {
    height: 100%; /* 100% Full-height */
    width: 0; /* 0 width - change this with JavaScript */
    position: fixed; /* Stay in place */
    z-index: 1; /* Stay on top */
    top: 0;
    left: 0;
    background-color: white; /* Black*/
    overflow-x: hidden; /* Disable horizontal scroll */
    padding-top: 60px; /* Place content 60px from the top */
    transition: 0.5s; /* 0.5 second transition effect to slide in the sidenav */
}

/* The navigation menu links */
.sidenav a {
    padding: 8px 8px 8px 32px;
    text-decoration: none;
    font-size: 25px;
    color: #818181;
    display: block;
    transition: 0.3s
}

/* When you mouse over the navigation links, change their color */
.sidenav a:hover, .offcanvas a:focus{
    color: #4B515D;
}

/* Position and style the close button (top right corner) */
.sidenav .closebtn {
    position: absolute;
    top: 0;
    right: 25px;
    font-size: 36px;
    margin-left: 50px;
}

/* Style page content - use this if you want to push the page content to the right when you open the side navigation */

/* On smaller screens, where height is less than 450px, change the style of the sidenav (less padding and a smaller font size) */
@media screen and (max-height: 950px) {
    .sidenav {padding-top: 15px;}
    .sidenav a {font-size: 18px;}
}

</style>

<script>
    /* Set the width of the side navigation to 250px and the left margin of the page content to 250px and add a black background color to body */
function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
   // document.getElementById("main").style.marginLeft = "250px";
    document.body.style.backgroundColor = "rgba(0,0,0,0.4)";
}

/* Set the width of the side navigation to 0 and the left margin of the page content to 0, and the background color of body to white */
function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
//    document.getElementById("main").style.marginLeft = "0";
    document.body.style.backgroundColor = "white";
}
</script>
    
   
</head>

<body>
    
                <!--Navbar primary-color-dark    -->
        <nav class="navbar navbar-toggleable-md navbar-dark z-depth-1 primary-color-dark fixed-top ada" style="z-index:5;">
            <div class="container ">

                <button class="navbar-toggler navbar-toggler-left" onclick="openNav()" type="button" data-toggle="" data-target="#collapseEx12" aria-controls="collapseEx2" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <a class="navbar-brand mx-auto d-block hidden-sm-down" href="#" style="">
                    <img src="img/logo.png"  class="img-responsive"  style="margin:0px;padding:0px;width: 100%">
                </a>


                <a class="navbar-brand mx-auto d-block hidden-md-up" href="#"><CENTER>HRMS</center></a>

                <div class="collapse navbar-collapse" id="collapseEx12">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item  " style="margin:0%;padding:0%" id="HomeMenu" >
                            <a class="nav-link" style="font-size:90%" href="home.jsp"><i class="fa fa-home" aria-hidden="true"></i>&nbsp;Home</a>
                        </li>
                        <li class="nav-item btn-group" style="margin:0%;padding:0%">
                            <a class="nav-link dropdown-toggle" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="font-size:90%"><i class="fa fa-users" aria-hidden="true"></i>&nbsp;Employee</a>
                            <div class="dropdown-menu" aria-labelledby="dropdownMenu1">
                                <a class="dropdown-item" href="AddEmployee.jsp">Add Employee</a>
                                <a class="dropdown-item" href="Employee.jsp">Manage Employee</a>
                            </div>
                        </li>

                        <li class="nav-item btn-group" style="margin:0%;padding:0%">
                            <a class="nav-link dropdown-toggle" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="font-size:90%"><i class="fa fa-empire" aria-hidden="true"></i>&nbsp;Departments</a>
                            <div class="dropdown-menu" aria-labelledby="dropdownMenu1">
                                <a class="dropdown-item" href="AddDepartment.jsp">Add Department</a>
                                <a class="dropdown-item" href="departments.jsp">Manage Department</a>
                            </div>
                        </li>

                        <li class="nav-item btn-group" style="margin:0%;padding:0%">
                            <a class="nav-link dropdown-toggle" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="font-size:90%"><i class="fa fa-industry" aria-hidden="true"></i>&nbsp;Position</a>
                            <div class="dropdown-menu" aria-labelledby="dropdownMenu1">
                                <a class="dropdown-item" href="AddPosition.jsp">Add Position</a>
                                <a class="dropdown-item" href="position.jsp">Manage Position</a>
                            </div>
                        </li>


                        <li class="nav-item" id="BlogMenu" style="margin:0%;padding:0%">
                            <a class="nav-link" style="font-size:90%"><i class="fa fa-rocket" aria-hidden="true"></i>&nbsp;Support</a>
                        </li>

                        <li class="nav-item" id="BlogMenu" style="margin:0%;padding:0%">
                            <a class="nav-link" style="font-size:90%"><i class="fa fa-file-text-o" aria-hidden="true"></i>&nbsp;Docs</a>
                        </li>


                    </ul>

                    <ul class="navbar-nav ml-auto " style="backgroud-color:red">
                        <li class="nav-item avatar dropdown">
                            <a class="nav-link dropdown-toggle waves-effect waves-light" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-user" aria-hidden="true"></i>&nbsp;Profile</a>
                            <div class="dropdown-menu dropdown-warning dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink" data-dropdown-in="fadeIn" data-dropdown-out="fadeOut">
                             <a class="dropdown-item waves-effect waves-light" href="profile.jsp">Manage Profile</a>
                                <a class="dropdown-item waves-effect waves-light" href="index.html">Logout</a>
                                <a class="dropdown-item waves-effect waves-light" href="#">Developer Mode</a>
                            </div>
                        </li>
                    </ul>


                </div>
            </div>
        </nav>
        <!--/.Navbar-->


        <div id="mySidenav" class="sidenav z-depth-3" style="z-index:8">
          <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
          <a href="#">Home</a>
          <a href="#">Manage Employees</a>
          <a href="#">Add Employee</a>
          <a href="#">Manage Departments</a>
          <a href="#">Add Departments</a>
          <a href="#">Manage Position</a>
          <a href="#">Add Position</a>
          <a href="#">Support</a>
          <a href="#">Docs</a>
          <a href="#">Profile</a>
          <a href="#">Logout</a>
        </div>


    <br>
    <br>
    
    
    <div class="container">
    <div class="row">
        <div class="col-md-12   ">
            <div class="container-fluid">
                <div class="row" style="padding-top: 1%">
                    <div class="col-md-6 col-6" style="padding-top:1%;padding-bottom:0px">
                        <h5 class="h5-responsive" style="padding:0px;margin:0px">
                        <i class="fa fa-2x fa-users" aria-hidden="true" style="color:#4B515D"></i> Manage Employee
                        </h5>
                    </div>
                    <div class="col-md-6 col-6" style="padding-top:2%;padding-bottom:0px">
                        <img src="img/logoColor.png" style="width:20%" class="float-right">
                    </div>
                </div>
                <div class="row" style="padding-top:0%">
                    <div class="col-md-12" style="padding:0px">
                        <hr>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

    
    <div class="container">
        <div class="row">
            <div class="col-md-12 ">
                <div class="container-fluid" style="padding:0px">
                    <div class="row" style="padding:0px">
                        
                         <%
                                try{  
                                        Class.forName("com.mysql.jdbc.Driver");  
                                        Connection con1=DriverManager.getConnection(  
                                        "jdbc:mysql://localhost:3306/hrms","root","");  
                                        //here sonoo is database name, root is username and password  
                                        Statement s=con1.createStatement();  
                                        ResultSet r=s.executeQuery("SELECT A.e_id, A.e_fname, A.e_lname, A.e_dept, A.e_position, B.Dept_id, B.DEPT_NAME, C.POS_ID, C.POS_NAME FROM employee as A, department as B, position as C WHERE A.e_dept=B.Dept_id AND A.e_position=C.POS_ID");  
                                       
                                        while(r.next()){ 
                                            out.println("<section class='col-md-4' style='margin-top:1%'>");
                                                out.println("<div>");
                                                    out.println(" <div class='container-fluid z-depth-1 stylish-color' style='padding:0px'>");
                                                        out.println("<div class='row' style='padding:0px'>");
                                                            
                                                            out.println("<div class='col-md-5'>");
                                                                   out.println("<img src='img/user.gif' class='z-depth-1 img-responsive' style='margin:0%;width: 100%'> ");
                                                            out.println("</div>");   
                                                            
                                                            out.println("<div class='col-md-7' style='padding-top:5%'>");
                                                                out.println("<h5 class='text-white'>"+r.getString(2)+" "+r.getString(3)+"</h5>");
                                                                out.println("<h6 class='text-white' style='color:#eceff1;font-size:80%'>"+r.getString(9)+"</h6>"); 
                                                                out.println("<h6 class='text-white' style='color:#eceff1;font-size:80%'>"+r.getString(7)+"</h6>"); 
                                                                out.println("<a href='showEmployee.jsp?id="+r.getInt(1)+"' class='float-right' style='color:white;margin-right:7%'>See More</a>");
                                                            out.println("</div>");   
                                                        out.println("</div>");
                                                    out.println("</div>");
                                                out.println("</div>");
                                            out.println("</section>");
                                            
                                        } 
                                        con1.close();  
                                        }
                                    catch(Exception e){ System.out.println(e);}

                                              //out.println(count);

                                    %>
                        
                        
                    </div>
                    
                    
                    
                    
                    
                </div>
            </div>
        </div>
    </div>
    
    <br>
    <br>
    <br>
    <br>
    


    <!-- SCRIPTS -->
    <!-- JQuery -->
    <script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
    <!-- Bootstrap tooltips -->
    <script type="text/javascript" src="js/tether.min.js"></script>
    <!-- Bootstrap core JavaScript -->
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <!-- MDB core JavaScript -->
    <script type="text/javascript" src="js/mdb.min.js"></script>
</body>

</html>
