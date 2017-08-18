<%-- 
    Document   : UpdateDept
    Created on : 9 Jun, 2017, 1:25:44 AM
    Author     : Vicky
--%>

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
            int id =Integer.parseInt(request.getParameter("did"));
            out.println(id);
            String dept_name =request.getParameter("e_dept");
            
            
            Connection con = null; 
            try{ 
                Class.forName("com.mysql.jdbc.Driver"); 
                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/hrms", "root", ""); 
                Statement st=con.createStatement(); 
                int i=st.executeUpdate("UPDATE department SET DEPT_NAME='"+dept_name+"' WHERE Dept_Id='"+id+"'"); 
                    RequestDispatcher requestDispatcher; 
                    requestDispatcher = request.getRequestDispatcher("/departments.jsp");
                    requestDispatcher.forward(request, response);
            } 
            catch(Exception e){ 
                System.out.print(e); 
                out.println(e);
                e.printStackTrace(); 
            } 
        %>
    </body>
</html>
