/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadb;

/**
 *
 * @author Vicky
 */
import java.sql.*;  
public class JavaDB {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Event ID\tEvent Date \t\tEvent Event"); 
        System.out.println("--------------------------------------------------------------------------");
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/google dev","root","");  
            //here sonoo is database name, root is username and password  
            Statement s=con.createStatement();  
            ResultSet r=s.executeQuery("select * from events");  
            while(r.next())  
            System.out.println(r.getInt(1)+" \t\t"+r.getString(6)+"\t\t"+r.getString(2));  
            con.close();  
            }
        catch(Exception e){ System.out.println(e);}
    }
    
}
