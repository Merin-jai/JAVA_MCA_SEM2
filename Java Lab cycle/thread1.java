import java.util.Scanner;

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println("Odd Thread: " + i);
            try {
                Thread.sleep(100); // Just for demonstration purposes
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println("Even Thread: " + i);
            try {
                Thread.sleep(100); // Just for demonstration purposes
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class thread1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter to start displaying odd and even numbers...");
        scanner.nextLine();

        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting...");
    }
}

