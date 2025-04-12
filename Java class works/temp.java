import java.util.*;
 public class temp {
    public static void main(String[] args) {
        double c,f,cc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temp :");
        c = sc.nextDouble();
        double d=9/5;
        f=(double)(9/5*c)+32;
        System.out.println("temp in f : "+f);
        cc=(f-32)*(5.0/9.0);
        System.out.println("temp in c : "+cc);
    }
}
