import java.io.*;
class reverse
{
   public static int reverse(int n)
   {
	   int i,mod,rev=0;
	   for(i=n;i!=0;i=i/10)
	   {
		    mod=i%10;
		   rev=rev*10+mod;
	   }
	   return rev;
   }
	   
   public static void main(String args[])
    {
      DataInputStream din = new DataInputStream(System.in);
      int n,r;
      try
       {
          System.out.println("Enter the number : ");
          n=Integer.parseInt(din.readLine());
		  r=reverse(n);
		  System.out.println("Reverse is "+r);
         
       }
      catch(Exception e)
       {
          System.out.println("Error : "+e);
       }
    }
}