import java.io.*;
class min3
{
   public static void main(String args[])
    {
      DataInputStream din = new DataInputStream(System.in);
      int a,b,c,min;
      try
       {
          System.out.println("Enter first number : ");
          a=Integer.parseInt(din.readLine());
          System.out.println("Enter second number : ");
          b=Integer.parseInt(din.readLine());
		  System.out.println("Enter third number : ");
          c=Integer.parseInt(din.readLine());
          System.out.println("The Numbers are : "+a+" "+b+" "+c);
		  min=(a<b)?(a<c)?a:c:(b<c)?b:c;
		  System.out.println("Minimum = "+min);
       }
      catch(Exception e)
       {
          System.out.println("Error : "+e);
       }
    }
}