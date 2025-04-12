//program to execute server program
/* ServerSocket is a class in the java.net packet 
to create a socket and establish two way connection 
**/
import java.io.*;
import java.net.*;//this package has the classes ServerSocket and Socket
class server
{
    public static void main(String args[])
    {
        ServerSocket ss;
        Socket as;
        DataInputStream sin;
        DataOutputStream sout;
        InetAddress i;
        try{
            ss=new ServerSocket(1234);
            as=ss.accept();
            i=as.getInetAddress();
            System.out.println("Clinet address : "+i.getHostAddress());
            sin=new DataInputStream(as.getInputStream());
            sout=new DataOutputStream(as.getOutputStream());
            sout.writeUTF("WELCOME clIENT");
            System.out.println("ater welcome client in server");
            String str=sin.readUTF();
            System.out.println("Client says : "+str);
            System.in.read();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}