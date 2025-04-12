

//program to execute server program
/* ServerSocket is a class in the java.net packet 
to create a socket and establish two way connection 
**/
import java.io.*;
import java.net.*;//this package has the classes ServerSocket and Socket
import java.util.Scanner;
class loginclient
{
    public static void main(String args[])
    {
        Socket cs;
        DataInputStream sin;
        DataOutputStream sout;
        Scanner s = new Scanner(System.in);
        try{
            cs=new Socket("localhost",1234);
            sin=new DataInputStream(cs.getInputStream());
            sout=new DataOutputStream(cs.getOutputStream());
            // sout.writeUTF("WELCOME clIENT");
            String str=sin.readUTF();
            System.out.println("Server says : "+str);
            str=sin.readUTF();
            String str2=s.nextLine();
            sout.writeUTF("Tom");
            System.out.println("Server says : "+str);
            String str1=s.nextLine();
            sout.writeUTF("123");
            System.in.read();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}

