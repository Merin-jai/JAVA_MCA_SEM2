import java.io.*;
import java.util.*;
import java.net.*;
class dwnld
{
    public static void main(String[] args)throws Exception {
        URL u=new URL(args[0]);
        URLConnection uc=u.openConnection();
        int len=uc.getContentLength();
        int c;
        if(len>0)
        {
            FileOutputStream fout=new FileOutputStream("sample.txt");
            InputStream input=uc.getInputStream();
            int i=0;
            while(((c=input.read())!=-1)&&i<len)
            {
                fout.write((char)c);
                i++;
            }
            input.close();
            fout.close();
        }
        else
        {
            System.out.println("NO content");
        }
        

    }
}
