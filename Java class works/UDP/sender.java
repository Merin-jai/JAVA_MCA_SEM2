import java.io.*;
import java.net.*;
public class sender
{
    public static void main(String[] args) {
        DatagramSocket ds=null;
        DatagramPacket dp,reply;
        try {
            ds=new DatagramSocket(1234);
            byte[] b=new byte[200];
            dp=new DatagramPacket(b,b.length);
            ds.receive(dp);
            System.out.println("From client : "+(new String(dp.getData())).trim());
            System.out.println("Client posrt : "+dp.getPort());
            // System.out.println("SErver port "+ ds.getPort());
             reply=new DatagramPacket("from server".getBytes(),"from server".length(),dp.getAddress(),dp.getPort());
             ds.send(reply);
        }
        catch(Exception e)
        {
            System.out.println("Socket: " + e.getMessage());
        }
        finally
        {
            if(ds!=null)
              ds.close();

        }

    }
}
