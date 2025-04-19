import java.io.*;
import java.util.*;
public class p2_1_prime
{
    public void checkprime(int n)
    {
       int i;
       for(i=2;i<n/2;i++)
       {
        if(n%i==0)
          break;
       }
       if(i>=n/2)
         System.out.println("Prime no");
       else
         System.out.println("Not Prime");
    }
    public static void main(String args[])throws Exception
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        p2_1_prime obj =new p2_1_prime();
        obj.checkprime(n);
    }
}