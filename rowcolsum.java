import java.io.*;
class rowcolsum
{
   public static void main(String args[])
    {
      DataInputStream din = new DataInputStream(System.in);
      int a[][],n,m,i,j,row,col[];
      try
       {
          System.out.println("Enter order of matrix : ");
          n=Integer.parseInt(din.readLine());
		  m=Integer.parseInt(din.readLine());
		  a=new int[n][m];
		  col=new int[m];
          System.out.println("Enter matrix elements : ");
          for(i=0;i<n;i++)
		  {
			  for(j=0;j<m;j++)
			  {
				  a[i][j]=Integer.parseInt(din.readLine());
				  col[j]=0;
			  }
			      
		  }
		  for(i=0;i<n;i++)
		  {
			  row=0;
			  for(j=0;j<m;j++)
			  {
				  System.out.print(a[i][j]+" ");
				  row=row+a[i][j];
				  col[j]=col[j]+a[i][j];
			  }
			  System.out.println(" | " + row);
			  
		  }
		  System.out.println("-------");
		  for(i=0;i<m;i++)
		  {
			  System.out.print(col[i]+" ");
		  }

       }
      catch(Exception e)
       {
          System.out.println("Error : "+e);
       }
    }
}