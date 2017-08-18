package inventorysystem;

public class User {
    int sid;
    String Sname;

    User()
    {

    }
    User(int id, String name)
    {
        Sname = name;
        sid = id;
    }
    
    public void setId(int id) {
        this.sid = id;
    }

    public String getSname() {
        return Sname;
    }
    public int getId(){
        return sid;
    }
    public void setSname(String Sname) {
        this.Sname = Sname;
    }

       
}
