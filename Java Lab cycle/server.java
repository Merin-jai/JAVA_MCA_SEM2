import java.io.*;
import java.net.*;
import java.util.Scanner;
class server
{
    public static void main(String args[])
    {
        ServerSocket ss;
        Socket as;
        DataInputStream sin;
        DataOutputStream sout;
        Scanner s;
        try{
            s=new Scanner(System.in);
            ss=new ServerSocket(1234);
            as=ss.accept();
            sin=new DataInputStream(as.getInputStream());
            sout=new DataOutputStream(as.getOutputStream());
            sout.writeUTF("Welcome Client");
            String str=sin.readUTF();
            while(!str.equals("Bye"))
            {
                System.out.println("Maria : "+ str);
                System.out.println("Enter text to send : ");
                str=s.nextLine();
                sout.writeUTF(str);
                str=sin.readUTF();
            }
            
            System.in.read();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }

}