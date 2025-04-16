// Importing Scanner class to take user input
import java.util.Scanner;

// Runnable implementation
class MyRunnable implements Runnable {
    // Run method that will be executed when the thread starts
    public void run() {
        try {
            // Print the name of the current thread running
            System.out.println(Thread.currentThread().getName() + " is running.");
            // Pause the thread for 500 milliseconds
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // Print stack trace if the thread is interrupted
            e.printStackTrace();
        }
    }
}

// Main class
public class thread3 {
    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        // Prompting the user to enter the number of threads
        System.out.print("Enter the number of threads: ");
        // Reading the number of threads entered by the user
        int numThreads = scanner.nextInt();
        // Closing the scanner object
        scanner.close();
        
        // Creating an array to hold the threads
        Thread[] threads = new Thread[numThreads];
        
        // Creating and starting each thread
        for (int i = 0; i < numThreads; i++) {
            // Creating a new thread with MyRunnable instance as target
            threads[i] = new Thread(new MyRunnable());
            // Starting the thread
            threads[i].start();
        }
        // Waiting for each thread to finish
        for (Thread thread : threads) {
            try {
                // Waiting for the thread to finish its execution
                thread.join();
            } catch (InterruptedException e) {
                // Print stack trace if the thread is interrupted while waiting
                e.printStackTrace();
            }
        }
        // Printing message indicating all threads have terminated
        System.out.println("All threads have terminated.");
    }
}

