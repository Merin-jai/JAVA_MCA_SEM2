import java.io.*;
import java.util.*;
public class Fwrite
{
    public static void main(String[] args) {
        FileOutputStream fout;
        Scanner sc;
        String fname;
        String data;
        try {
            sc=new Scanner(System.in);
            System.out.println("Enter filename");
            fname=sc.nextLine();
            fout=new FileOutputStream(fname);
            System.out.println("Enter the contents or quit to terminate");
            data=sc.nextLine();
            while(!data.equalsIgnoreCase("Quit"))
            {
                fout.write(data.getBytes());
                data=sc.nextLine();
            }
            fout.close();
        }
        catch(Exception e)
        {

        }
    }
}
