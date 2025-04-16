public class bitwiseop {
    public static void main(String[] args) {
        int a = 5; 
        int b = 3; 
        int resultAnd = a & b; // 001
        System.out.println("Bitwise AND: " + resultAnd); // Output: 1
        
        int resultOr = a | b; // 111
        System.out.println("Bitwise OR: " + resultOr); // Output: 7
  
        int resultXor = a ^ b; // 110
        System.out.println("Bitwise XOR: " + resultXor); // Output: 6
  
        int resultComplementA = ~a; // 11111111111111111111111111111010
        int resultComplementB = ~b; // 11111111111111111111111111111100
        System.out.println("Bitwise Complement of a: " + resultComplementA); // Output: -6
        System.out.println("Bitwise Complement of b: " + resultComplementB); // Output: -4
     
        int resultLeftShift = a << 1; // 
        System.out.println("Left Shift: " + resultLeftShift); // Output: 10
       
        int resultRightShift = a >> 1; // 
        System.out.println("Right Shift: " + resultRightShift); // Output: 2
    }
}

