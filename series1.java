//printing elements from m to n using single while loop
import java.io.*;
public class series1
{
  public static void main(String args[])
    {
      DataInputStream din = new DataInputStream(System.in);
      int m,n;
      try
       {
          System.out.println("Enter m : ");
          m=Integer.parseInt(din.readLine());
          System.out.println("Enter n : ");
          n=Integer.parseInt(din.readLine());
		  while(m<=n)
		  {
			  System.out.println(m++);
		  }
	   }
	   catch(Exception e)
       {
          System.out.println("Error : "+e);
       }
	}
}