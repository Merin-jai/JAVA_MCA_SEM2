import java.io.*;
class prod
{
   public static void main(String args[])
    {
      DataInputStream din = new DataInputStream(System.in);
      int a,b;
      try
       {
          System.out.println("Enter first number : ");
          a=Integer.parseInt(din.readLine());
          System.out.println("Enter second number : ");
          b=Integer.parseInt(din.readLine());
          System.out.println("The Numbers are : "+a+" "+b);
          System.out.println("Product of "+a+" and "+b+" is "+ (a*b));
       }
      catch(Exception e)
       {
          System.out.println("Error : "+e);
       }
    }
}