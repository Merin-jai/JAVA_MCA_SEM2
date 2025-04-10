
import java.net.*
;
public class receiver {
    public static void main(String[] args) {
        DatagramSocket ds=null;
        DatagramPacket dp=null,reply=null;
        InetAddress host=null;
        try{
        ds=new DatagramSocket();
        byte[] b="bye".getBytes();
        host=InetAddress.getByName("localhost");
        dp=new DatagramPacket(b, b.length,host,1234);
        ds.send(dp);
        byte[] buff=new byte[200];
        reply=new DatagramPacket(buff,buff.length);
        ds.receive(reply);
        System.out.println("reply"+(new String(reply.getData())).trim());
        ds.close(); 
        }
        catch(Exception e)
        {
            System.out.println("Socket: " + e.getMessage());
        }
    }

}
