import java.io.*;
import java.net.*;
import java.util.*;
class Client{
    public static void main(String args[]){
        Socket cs;
        DataInputStream sin;
        DataOutputStream sout;
        Scanner s=new Scanner(System.in);
        try{
            cs=new Socket("localhost",1234);
            sin = new DataInputStream(cs.getInputStream());
            sout =new DataOutputStream(cs.getOutputStream());
            String str = sin.readUTF();
            System.out.println("Merrin :"+str);
            while(!str.equals("Bye"))
            {
                System.out.println("Enter text to send :");
                str=s.nextLine();
                sout.writeUTF(str);
                str=sin.readUTF();
                System.out.println("Merrin:"+str);


            }
         
            System.in.read();

        }
        catch(Exception e){
            System.out.println("Error :"+e);
        }
    }
}