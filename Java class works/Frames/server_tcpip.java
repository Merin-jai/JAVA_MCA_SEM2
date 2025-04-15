import java.io.*;
import java.net.*;
class server_tcpip
{
    public static void main(String[] args) {
        ServerSocket ss;
        Socket as;
        DataInputStream dis;
        DataOutputStream dos;
        try{
            ss=new ServerSocket(1234);
            as=ss.accept();
            dis=new DataInputStream(as.getInputStream());
            dos=new DataOutputStream(as.getOutputStream());
            dos.writeUTF("Welcome");
            String str=dis.readUTF();
            System.out.println(str);
            System.in.read(); 
        }
        catch(Exception e)
        {
            
        }
    }
}
