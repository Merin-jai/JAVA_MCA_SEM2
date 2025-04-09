import java.io.*;
class palinfunc
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
   public static int checkp(int n)
   {
	   if(reverse(n)==n)
		   return 1;
	   else
		   return 0;
   }
	   
   public static void main(String args[])
    {
      DataInputStream din = new DataInputStream(System.in);
      int n,c;
      try
       {
          System.out.println("Enter the number : ");
          n=Integer.parseInt(din.readLine());
		  c=checkp(n);
		  if(c==1)
			 System.out.println("Palindrome");
		  else
			 System.out.println("Not palindrome");
         
       }
      catch(Exception e)
       {
          System.out.println("Error : "+e);
       }
    }
}