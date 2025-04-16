import java.lang.Thread;
import java.util.Scanner;

class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName() +
                ", Priority: " + Thread.currentThread().getPriority());
    }
}
public class threadpri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take user input for priorities
        System.out.print("Enter priority for Thread 1 (1-10): ");
        int priority1 = scanner.nextInt();
        
        System.out.print("Enter priority for Thread 2 (1-10): ");
        int priority2 = scanner.nextInt();
        
        System.out.print("Enter priority for Thread 3 (1-10): ");
        int priority3 = scanner.nextInt();

        PriorityThread thread1 = new PriorityThread("Thread 1");
        PriorityThread thread2 = new PriorityThread("Thread 2");
        PriorityThread thread3 = new PriorityThread("Thread 3");
        thread1.setPriority(priority1); 
        thread2.setPriority(priority2); 
        thread3.setPriority(priority3); 
        thread1.start();
        thread2.start();
        thread3.start();

        scanner.close();
    }
}



