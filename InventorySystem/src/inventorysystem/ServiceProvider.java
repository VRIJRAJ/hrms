package inventorysystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

interface userService {

    boolean checkLogin(String username, String password);

    List<User> getUser();

    void setUser(User u);
}

public class ServiceProvider implements userService {

    Connection con;

    @Override
    public List<User> getUser() {

        List<User> list = new ArrayList<User>();
        list = InventoryDao.getUser();
        return list;

    }

    @Override
    public void setUser(User u) {
        InventoryDao.setUser(u);
    }

    @Override
    public boolean checkLogin(String username, String password) {
        con = ConnectionTest.testConnection();
        
       // System.out.println("<h1>"+con+"</h1>"); 
        

        if (con != null) {
            try {
                Statement st = null;
                st = con.createStatement();
                
                ResultSet rs = null;
                
                rs = st.executeQuery("select * from admin");
                
                
                
                while (rs.next()) 
                {
                    if (rs.getString(6).equals(username) && rs.getString(5).equals(password))
                    {
                        System.out.println("asdfghjkl"); 
                        return true;
                    }
                    
                } 
            } catch (SQLException ex) {
                Logger.getLogger(ServiceProvider.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

}
