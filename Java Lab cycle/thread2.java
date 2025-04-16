import java.util.Random;
// RandomNumberGenerator class generates random numbers every second
class RandomNumberGenerator extends Thread {
    private boolean running; // Flag to control the running state of the thread
    // Constructor initializes the running flag to true
    public RandomNumberGenerator() {
        this.running = true;
    }
    // Method to stop the thread by setting running flag to false
    public void stopGenerating() {
        this.running = false;
    }
    // Overridden run method that generates random numbers and starts appropriate threads
    @Override
    public void run() {
        Random random = new Random();
        while (running) { // Loop until running is true
            try {
                Thread.sleep(1000); // Sleep for 1 second
                int number = random.nextInt(100); // Generate random number between 0 and 99
                System.out.println("Generated number: " + number); // Print the generated number
                if (number % 2 == 0) { // Check if the number is even
                    SquareThread squareThread = new SquareThread(number); // Create SquareThread
                    squareThread.start(); // Start SquareThread
                } 
                else { // Number is odd
                    CubeThread cubeThread = new CubeThread(number); // Create CubeThread
                    cubeThread.start(); // Start CubeThread
                }
            } catch (InterruptedException e) {
                e.printStackTrace(); // Print stack trace if interrupted
            }
        }
    }
}
// SquareThread class computes and prints the square of a number
class SquareThread extends Thread {
    private int number; // Number for which square is to be computed
    // Constructor initializes the number
    public SquareThread(int number) {
        this.number = number;
    }
    // Overridden run method that computes and prints the square
    @Override
    public void run() {
        System.out.println("Square of " + number + ": " + (number * number)); // Print square of the number
    }
}
// CubeThread class computes and prints the cube of a number
class CubeThread extends Thread {
    private int number; // Number for which cube is to be computed
    // Constructor initializes the number
    public CubeThread(int number) {
        this.number = number;
    }
    // Overridden run method that computes and prints the cube
    @Override
    public void run() {
        System.out.println("Cube of " + number + ": " + (number * number * number)); // Print cube of the number
    }
}
// Main class to test the program
public class thread2 {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(); // Create RandomNumberGenerator
        randomNumberGenerator.start(); // Start RandomNumberGenerator
        try {
            Thread.sleep(10000); // Sleep for 10 seconds to allow the program to run
        } catch (InterruptedException e) {
            e.printStackTrace(); // Print stack trace if interrupted
        }
        randomNumberGenerator.stopGenerating(); // Stop generating random numbers
    }
}


