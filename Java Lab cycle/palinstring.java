import java.util.*;
class palinstring
{
  public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in); 
     String s,r="";
     int i;
     try //try catch is used to catch any error that occurs at RUNTIME
      {
        System.out.println("Enter a string : ");
        s=sc.nextLine();
        for(i=s.length()-1;i>=0;i--)
        {
           r = r+s.charAt(i);
        }
        if(s.equalsIgnoreCase(r))
        {
            System.out.println("Palindrome");
        }
        else 
        {
            System.out.println("Not Palindrome");
        }
      }
    catch(Exception e)
    {
        System.out.println(e);
    }
   }
}
