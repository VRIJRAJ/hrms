<%-- 
    Document   : addEmployeeData
    Created on : 8 Jun, 2017, 2:15:05 PM
    Author     : Vicky
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String fname=request.getParameter("e_fname");
            String lname=request.getParameter("e_lname");
            String mail=request.getParameter("e_mail");
            String country=request.getParameter("e_country");
            String state=request.getParameter("e_state");
            String city=request.getParameter("e_city");
            String skills=request.getParameter("e_skills");
            String gender=request.getParameter("e_gender");
            String domain=request.getParameter("e_domain");
            int dept=Integer.parseInt(request.getParameter("e_dept"));
            int position=Integer.parseInt(request.getParameter("e_position"));
            String salary=request.getParameter("e_salary");
            String hireDate=request.getParameter("e_Hire_Date");       
            String dob=request.getParameter("e_dob");
            String linkedin=request.getParameter("e_linkedin_id");
            String github=request.getParameter("e_github_id");
            String twitter=request.getParameter("e_twitter_id");
            String fb=request.getParameter("e_fb_id");           
            String schoolName=request.getParameter("e_school_name");
            String collegeName=request.getParameter("e_clg_name");
            String schoolDesc=request.getParameter("e_school_desc");
            String collegeDesc=request.getParameter("e_clg_desc");
            String about=request.getParameter("e_about");
            String mobile=request.getParameter("e_mob");
            
//            out.println(fname +"<br>" );
//            out.println(lname +"<br>" );
//            out.println( mail +"<br>" );
//            out.println(country +"<br>" );
//            out.println(state +"<br>" );
//            out.println(city +"<br>" );
//            out.println(skills +"<br>" );
//            out.println(gender +"<br>" );
//            out.println(domain +"<br>" );
//            out.println(dept +"<br>" );
//            out.println(position +"<br>" );
//            out.println(salary +"<br>" );
//            out.println(hireDate +"<br>" );
//            out.println(dob +"<br>" );
//            out.println(linkedin +"<br>" );
//            out.println(github +"<br>" );
//            out.println(twitter +"<br>" );
//            out.println(fb +"<br>" );
//            out.println(schoolName +"<br>" );
//            out.println(collegeName +"<br>" );
//            out.println(schoolDesc +"<br>" );
//            out.println(collegeDesc +"<br>" );
//            out.println(about +"<br>" );
//            out.println(mobile +"<br>" );
            
            Connection con = null; 
            try{ 
                Class.forName("com.mysql.jdbc.Driver"); 
                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/hrms", "root", ""); 
                Statement st=con.createStatement(); 
                int i=st.executeUpdate("insert into employee(e_fname,e_lname,e_mail,e_username,e_password,e_sec_pin,e_img,e_mb,e_state,e_city,e_address,e_country,e_fblink,e_linkedin,e_twitter,e_skills,e_dob,e_github,e_salary,e_domain,e_dept,e_position,e_Hire_Date,e_gender,e_about,e_school_name,e_clg_name,e_school_info,e_clg_info) values('"+fname+"','"+lname+"','"+mail+"','"+fname+"','123456','1477','default.jpg','"+mobile+"','"+state+"','"+city+"','xyz','"+country+"','"+fb+"','"+linkedin+"','"+twitter+"','"+skills+"','"+dob+"','"+github+"','"+salary+"','"+domain+"','"+dept+"','"+position+"','"+hireDate+"','"+gender+"','"+about+"','"+schoolName+"','"+collegeName+"','"+schoolDesc+"','"+collegeDesc+"')"); 
                //out.println("Data is successfully inserted!");
                    RequestDispatcher requestDispatcher; 
                    requestDispatcher = request.getRequestDispatcher("/Employee.jsp");
                    requestDispatcher.forward(request, response);
                //System.out.println("rows affected by insert "+st.executeUpdate(i)); 
            } 
            catch(Exception e){ 
                System.out.print(e); 
                out.println(e);
                e.printStackTrace(); 
            } 
        %>
    </body>
</html>
