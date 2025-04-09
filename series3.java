//sum of 1+2/2!+3/3!+4/4!++n/n! using a single for loop
import java.io.*;
public class series3
{
  public static int fact(int n)
  {
	  int i,f=1;
	  for(i=1;i<=n;i++)
		  f=f*i;
	  return f;
  }
  public static void main(String args[])
    {
      DataInputStream din = new DataInputStream(System.in);
      int n,i;
	  float sum;
      try
       {
          System.out.println("Enter n : ");
          n=Integer.parseInt(din.readLine());
		  sum=0;
		  for(i=1;i<=n;i++)
		  {
			  sum=(float)sum+(i/fact(i));
		  }
		  System.out.println("\nSum of series : "+ sum);
	   }
	   catch(Exception e)
       {
          System.out.println("Error : "+e);
       }
	}
}