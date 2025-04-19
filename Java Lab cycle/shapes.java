import java.util.Scanner;

// Abstract Shape class
abstract class Shape {
    // Abstract method to get the number of sides
    abstract void numberOfSides();
}

// Rectangle class
class Rectangle extends Shape {
    // Implementation of the numberOfSides method for Rectangle
    @Override
    void numberOfSides() {
        System.out.println("A rectangle has 4 sides.");
    }
}

// Triangle class
class Triangle extends Shape {
    // Implementation of the numberOfSides method for Triangle
    @Override
    void numberOfSides() {
        System.out.println("A triangle has 3 sides.");
    }
}

// Hexagon class
class Hexagon extends Shape {
    // Implementation of the numberOfSides method for Hexagon
    @Override
    void numberOfSides() {
        System.out.println("A hexagon has 6 sides.");
    }
}

public class shapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose a shape (1. Rectangle, 2. Triangle, 3. Hexagon):");
        int choice = scanner.nextInt();
        
        Shape shape;
        switch (choice) {
            case 1:
                shape = new Rectangle();
                break;
            case 2:
                shape = new Triangle();
                break;
            case 3:
                shape = new Hexagon();
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        
        shape.numberOfSides();
        
        scanner.close();
    }
}
