import java.io.*;
public class studdeser {
    public static void main(String args[])throws Exception
    {
        FileInputStream fin=new FileInputStream("stud.txt");
        ObjectInputStream oin=new ObjectInputStream(fin);
        stud s=(stud)oin.readObject();
        s.disp();
    }
}
