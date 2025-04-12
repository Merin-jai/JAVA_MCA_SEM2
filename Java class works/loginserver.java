
import java.io.*;
import java.net.*;//this package has the classes ServerSocket and Socket
class loginserver
{
    public static void main(String args[])
    {
        ServerSocket ss;
        Socket as;
        DataInputStream sin;
        DataOutputStream sout;
        try{
            System.out.println("WELCOME SERVER");
            ss=new ServerSocket(1234);
            as=ss.accept();
            System.out.println("Client connected");
            sin=new DataInputStream(as.getInputStream());
            sout=new DataOutputStream(as.getOutputStream());
            sout.writeUTF("WELCOME CLIENT");
            sout.writeUTF("Enter Username : ");
            String uname=sin.readUTF();
            sout.writeUTF("Enter Password");
            String pass=sin.readUTF();
            System.out.println("USERNAME : "+uname);
            System.out.println("PASSWORD : "+pass);
            
            // System.out.println("Client says : "+str);
            System.in.read();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
