import java.io.*;
class sumofdigit
{
   public static int sumd(int n)
   {
	   int i,mod,sum=0;
	   for(i=n;i!=0;i=i/10)
	   {
		    mod=i%10;
		   sum=sum+mod;
	   }
	   return sum;
   }
	   
   public static void main(String args[])
    {
      DataInputStream din = new DataInputStream(System.in);
      int n,r;
      try
       {
          System.out.println("Enter the number : ");
          n=Integer.parseInt(din.readLine());
		  r=sumd(n);
		  System.out.println("Sum of digits is "+r);
         
       }
      catch(Exception e)
       {
          System.out.println("Error : "+e);
       }
    }
}