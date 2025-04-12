import java.io.*;

public class stud implements Serializable {
    transient int id;
    String name;
    stud(int id,String s)
    {
        this.id=id;
        name=s;
    }
    void disp()
    {
        System.out.println("Name : "+name+" Id : "+id);
    }
}
