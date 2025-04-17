import java.io.*;
class CThread extends Thread{
    int n;
    public CThread(int a)
    {
        n=a;

    }
    public void run()
    {
        int i;
        for(i=1;i<=n;i++)
        {
            System.out.println("\ti="+i);
        }
    }
}
class MTread{
    public static void main(String args[]){
        CThread t1,t2;
        t1=new CThread(10);
        t2=new CThread(15);
        System.out.println("B4 thread");
        t1.start();
        System.out.println("between thread");
        t2.start();
        System.out.println("after thread");
    }
}
