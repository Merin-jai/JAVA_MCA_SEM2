//sum of 1+2/2!+3/3!+4/4!++n/n! using a single for loop
import java.io.*;
public class area
{
     
  public static void areacal()throws IOException
  {
	  int r;
	  DataInputStream din = new DataInputStream(System.in);
	  System.out.println("Enter radius : ");
      r=Integer.parseInt(din.readLine());
	  System.out.println("Area of Circle = "+(3.14*r*r));
	  
  }
  public static void main(String args[])
    {
	 try
	 {
      areacal();
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
	}
}