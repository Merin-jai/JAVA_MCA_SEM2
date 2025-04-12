import java.net.URL;

class curl 
{
   public static void main(String[] args)  throws Exception 
   {
      URL url = new URL(args[0]);
      System.out.println("URL is " + url.toString());
      System.out.println("protocol is "       + url.getProtocol());
      System.out.println("file name is " + url.getFile());
      System.out.println("host is " + url.getHost());
      System.out.println("path is " + url.getPath());
      System.out.println("port is " + url.getPort());
      System.out.println("default port is "    + url.getDefaultPort());
      System.out.println("Query String: "+url.getQuery());    
    System.out.println("Path: "+url.getPath());    
    System.out.println("File: "+url.getFile());  
   }
}
