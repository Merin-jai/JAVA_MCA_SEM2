// Import statements
import java.util.*;

// Define interface P
interface P {
    void methodP(); // method declaration
}

// Interface P1 extends P
interface P1 extends P {
    void methodP1(); // method declaration
}

// Interface P2 extends P
interface P2 extends P {
    void methodP2(); // method declaration
}

// Interface P12 inherits from both P1 and P2
interface P12 extends P1, P2 {
    // No additional constants or methods here
}

// Class Q implements P12
class Q implements P12 {
    // Member variables to store constants
    private int constantP;
    private int constantP1;
    private int constantP2;
    
    // Constructor to receive constants
    public Q(int constantP, int constantP1, int constantP2) {
        this.constantP = constantP;
        this.constantP1 = constantP1;
        this.constantP2 = constantP2;
    }
    
    // Implementing method from P1 interface
    public void methodP1() {
        System.out.println("Constant from P1: " + constantP1);
    }
    
    // Implementing method from P2 interface
    public void methodP2() {
        System.out.println("Constant from P2: " + constantP2);
    }
    
    // Implementing method from P interface
    public void methodP() {
        System.out.println("Constant from P: " + constantP);
    }
}

public class interface1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for constants
        System.out.print("Enter constant value for P: ");
        int constantP = scanner.nextInt();
        
        System.out.print("Enter constant value for P1: ");
        int constantP1 = scanner.nextInt();
        
        System.out.print("Enter constant value for P2: ");
        int constantP2 = scanner.nextInt();
        
        // Instantiating Q with constants passed to its constructor
        Q q = new Q(constantP, constantP1, constantP2);
        
        // Invoking methods from Q
        q.methodP();
        q.methodP1();
        q.methodP2();
        
        scanner.close();
    }
}
