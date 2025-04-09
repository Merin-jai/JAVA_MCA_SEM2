//1+(1+2)+(1+2+3)+............ +(1+2+3+…+n) using a single while loop.

import java.io.*;
public class series2
{
  public static void main(String args[])
    {
      DataInputStream din = new DataInputStream(System.in);
      int n,i,s,sum;
      try
       {
          System.out.println("Enter n : ");
          n=Integer.parseInt(din.readLine());
		  i=1;s=0;sum=0;
		  while(i<=n)
		  {
			  s=s+i;
			  sum=sum+s;
			  i++;
		  }
		  System.out.println("\nSum of series : "+ sum);
	   }
	   catch(Exception e)
       {
          System.out.println("Error : "+e);
       }
	}
}