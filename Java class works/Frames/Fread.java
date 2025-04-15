import java.io.*;
import java.util.*;
public class Fread
{
    public static void main(String[] args) {
        FileInputStream fin;
        Scanner sc;
        String fname;
        String data;
        try {
            sc=new Scanner(System.in);
            System.out.println("Enter filename");
            fname=sc.nextLine();
            fin=new FileInputStream(fname);
            //reading char by char
            /*int ch;
            ch=fin.read();
            while(ch!=-1)
            {
                System.out.println((char)ch);
                ch=fin.read();
            }*/

            //reading entire block
            /*byte b[];
            b=new byte[fin.available()];
            fin.read(b);
            data=new String(b,0,b.length);
            System.out.println(data);
            fin.close();*/

            
        }
        catch(Exception e)
        {

        }}}