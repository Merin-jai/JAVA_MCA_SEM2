import java.io.*;
import java.net.Socket;
import java.util.*;
class client_tcpip
{
    public static void main(String[] args) {
        Socket ss;
        DataInputStream dis;
        DataOutputStream dos;
        try{
            ss=new Socket("localhost",1234);
            dis=new DataInputStream(ss.getInputStream());
            dos=new DataOutputStream(ss.getOutputStream());
            String str=dis.readUTF();
            System.out.println(str);
            dos.writeUTF("Bye");
            System.in.read();
        }   
        catch(Exception e)
        {}
    }
}
