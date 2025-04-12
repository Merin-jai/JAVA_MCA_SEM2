

//program to execute server program
/* ServerSocket is a class in the java.net packet 
to create a socket and establish two way connection 
**/
import java.io.*;
import java.net.*;//this package has the classes ServerSocket and Socket
class client
{
    public static void main(String args[])
    {
        Socket cs;
        DataInputStream sin;
        DataOutputStream sout;
        try{
            cs=new Socket("localhost",1234);
            sin=new DataInputStream(cs.getInputStream());
            sout=new DataOutputStream(cs.getOutputStream());
            // sout.writeUTF("WELCOME clIENT");
            String str=sin.readUTF();
            System.out.println("Server says : "+str);
            System.out.println("after server says in clinet");
            sout.writeUTF("Bye");
            System.in.read();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
