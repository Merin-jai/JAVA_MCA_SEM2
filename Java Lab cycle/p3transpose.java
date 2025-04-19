import java.io.*;
import java.util.*;
public class p3transpose
{
    public static void main(String args[])
    {
        int a[][],m,n,i,j;
        Scanner s=new Scanner(System.in);
        try{
            System.out.println("Enter the order of the matrix : ");
            m=s.nextInt();
            n=s.nextInt();
            a=new int[m][n];
            System.out.println("Enter "+(m*n)+" matrix elements");
            for(i=0;i<m;i++)
             {
                for(j=0;j<n;j++)
                  a[i][j]=s.nextInt();
             }
             System.out.println("Matrix elements are : ");
             for(i=0;i<m;i++)
             {
                for(j=0;j<n;j++)
                  System.out.print(a[i][j]+"  ");
                System.out.println(" ");
             }
             System.out.println("Transpose of Matrix : ");
             for(i=0;i<n;i++)
             {
                for(j=0;j<m;j++)
                  System.out.print(a[j][i]+"  ");
                System.out.println(" ");
             }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
