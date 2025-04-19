import java.io.*;
import java.util.*;
public class p4small
{
    public static void main(String args[])
    {
        int a[],n,i,j,temp;
        Scanner s=new Scanner(System.in);
        try{
            System.out.println("Enter the size of array: ");
            n=s.nextInt();
            a=new int[n];
            System.out.println("Enter "+n+" array elements");
            for(i=0;i<n;i++)
             {
                  a[i]=s.nextInt();
             }
             System.out.println("Array elements are : ");
             for(i=0;i<n;i++)
                  System.out.print(a[i]+"  ");
             //sorting the array elements
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
             System.out.println("\nSecond smallest element : "+a[1]);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
