import java.io.*;
class CThread extends Thread 
{
   int n;
   public CThread (int a)
{
   n=a;
}
   public void run()
{
   int i;
   for(i=1;i<=n;i++)
{
  System.out.print("\ti=" +i);
//   try{
//     sleep(400);
//   }
//   catch(Exception e){}
  
     }  
   }
}
 class Mthread {
            public static void main(String args[]){
            CThread t1,t2;
            t1=new CThread(100);
            t2=new CThread(150);
            System.out.println("B4 Thread");
            t1.start();
             System.out.println("Between Thread");
			 System.out.println("Thread priority is : "+t1.getPriority());
             t1.setPriority(1);
             t2.start();
             try{
                t1.join();
                t2.join();
             }catch(Exception e){}
             System.out.println("Thread priority is : "+t1.getPriority());
             System.out.println("After Thread");
        }
}
