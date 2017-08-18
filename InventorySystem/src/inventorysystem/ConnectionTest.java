package inventorysystem;

import java.sql.*;

public class ConnectionTest {

    static Connection con = null;

    public static Connection testConnection() {
        try {
            if (con != null) {
                return con;
            }
            //System.out.println("Hello");
            Class.forName("com.mysql.jdbc.Driver");
            //System.out.println("World");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hrms", "root", "");
            

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return con;
    }
}
