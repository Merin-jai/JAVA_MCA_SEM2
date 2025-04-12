import java.io.*;
public class studser {
    public static void main(String args[])throws Exception
    {
        stud s=new stud(14, "Merin");
        FileOutputStream fout =new FileOutputStream("stud.txt");
        ObjectOutputStream out=new ObjectOutputStream(fout);
        out.writeObject(s);
        out.flush();
        out.close();
    }
}
