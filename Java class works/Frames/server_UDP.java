import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
class server_UDP
{
    public static void main(String[] args) {
        DatagramPacket dp=null,reply;
        DatagramSocket ds=null;
        try{
            ds=new DatagramSocket(1234);
            byte b[]=new byte[200];
            dp=new DatagramPacket(b, b.length);
            ds.receive(dp);

            System.out.println("Client says : "+(new String(dp.getData()).trim()));
            
            reply=new DatagramPacket("From Server ok".getBytes(),"From Server ok".length(),dp.getAddress(),dp.getPort());
            ds.send(reply);
            
        }
        catch(Exception e)
        {
            ds.close();
        }
    }
}
