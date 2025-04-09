import java.io.*;
class max3
{
   public static void main(String args[])
    {
      DataInputStream din = new DataInputStream(System.in);
      int a,b,c;
      try
       {
          System.out.println("Enter first number : ");
          a=Integer.parseInt(din.readLine());
          System.out.println("Enter second number : ");
          b=Integer.parseInt(din.readLine());
		  System.out.println("Enter third number : ");
          c=Integer.parseInt(din.readLine());
          System.out.println("The Numbers are : "+a+" "+b+" "+c);
		  if(a>b)
		  {
			  if(a>c)
			  {
				  System.out.println("Maximum = " +a);
			  }
			  else
				  System.out.println("Maximum = " +c);
		  }
		  else
			  if(b>c)
				  System.out.println("Maximum = " +b);
			  else
				  System.out.println("Maximum = " +c);
       }
      catch(Exception e)
       {
          System.out.println("Error : "+e);
       }
    }
}