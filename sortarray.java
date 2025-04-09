import java.io.*;
class sortarray
{
   public static void main(String args[])
    {
      DataInputStream din = new DataInputStream(System.in);
      int a[],n,i,j,temp;
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
		  for(i=0;i<n;i++)
		  {
			  for(j=0;j<n-1;j++)
			  {
				  if(a[j]>a[j+1])
				  {
					  temp=a[j];
					  a[j]=a[j+1];
					  a[j+1]=temp;
				  }
			  }
		  }
		  System.out.println("Array elements after sorting : ");
		  for(i=0;i<n;i++)
			  System.out.print(" "+a[i]);

       }
      catch(Exception e)
       {
          System.out.println("Error : "+e);
       }
    }
}