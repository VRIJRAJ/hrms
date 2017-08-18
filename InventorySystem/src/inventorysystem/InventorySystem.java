package inventorysystem;

import java.util.List;

public class InventorySystem {

    public static void main(String[] args) 
    {
       User us = new User();
       // User us = new User();
       ServiceProvider sp = new ServiceProvider();
       sp.setUser(us);
       List<User> li = sp.getUser();
       /*
       for(User u : li)
       {
           System.out.println(u.getId());
           System.out.println(u.getSname());
        }*/    }
}
