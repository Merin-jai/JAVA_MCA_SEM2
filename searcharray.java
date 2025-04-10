import java.io.*;
class searcharray
{
   public static void main(String args[])
    {
      DataInputStream din = new DataInputStream(System.in);
      int a[],n,i;
      try
       {
          System.out.println("Enter array limit : ");
          n=Integer.parseInt(din.readLine());
		  a=new int[n];
          System.out.println("Enter array elements : ");
          for(i=0;i<n;i++)
		  {
			  a[i]=Integer.parseInt(din.readLine());
		  }
		  System.out.println("Enter number to search : ");
		  s=Integer.parseInt(din.readLine());
		  for(i=0;i<n;i++)
		  {
			  if(a[i]==s)
			  {
				  System.out.println("Element found at Position : "+(i+1));
				  break;
			  }
		  }
		  if(i>=n)
		  {
			  System.out.println("Element not found");
		  }
       }
      catch(Exception e)
       {
          System.out.println("Error : "+e);
       }
    }
}