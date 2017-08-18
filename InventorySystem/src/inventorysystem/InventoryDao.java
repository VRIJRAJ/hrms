package inventorysystem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class InventoryDao {
    
    public static List<User> getUser()
    {
        List<User> list = new ArrayList<User>();
        Connection con = ConnectionTest.testConnection();
        
        try
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from admin");
            
            while(rs.next())
            {
                int ShopId = rs.getInt(1);
                String Sname = rs.getString(2);
                
                User u = new User();
                u.setId(ShopId);
                u.setSname(Sname);
                list.add(u);
            }
        }
        catch(Exception e)
        {
            System.out.println("Invenory1");
        }
        return list;
    }
    
    public static void setUser(User u)
    {
        try{
           Connection con = ConnectionTest.testConnection();
           PreparedStatement pst = con.prepareStatement("insert into data values (?,?,?,?)");
           
           pst.setInt(1,u.getId());
           pst.setString(2,u.getSname());
           pst.setString(3,"shobhit");
           pst.setString(4,"root");
           pst.execute();
        }
        catch(Exception e)
        {
            System.out.println("Error ghjk "+e.getMessage());
        }
    }
    
}
