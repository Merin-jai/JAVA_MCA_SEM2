import java.io.*;
class swap
{
   public static void main(String args[])
    {
      DataInputStream din = new DataInputStream(System.in);
      int a,b,temp;
      try
       {
          System.out.println("Enter first number : ");
          a=Integer.parseInt(din.readLine());
          System.out.println("Enter second number : ");
          b=Integer.parseInt(din.readLine());
          System.out.println("The Numbers before Swapping : a = "+a+" b = "+b);
		  temp=a;
		  a=b;
		  b=temp;
          System.out.println("The Numbers After Swapping : a = "+a+" b = "+b);
       }
      catch(Exception e)
       {
          System.out.println("Error : "+e);
       }
    }
}