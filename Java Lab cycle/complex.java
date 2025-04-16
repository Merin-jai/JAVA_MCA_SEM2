// Write the definition for a class called Complex that has floating point data members for storing real and imaginary parts. 
// Define a function Complex sum(Complex) to add two complex numbers  & return complex number. Write main function to 
// create three complex number objects. Set the value in two objects and call sum() 
// to calculate sum and assign it in third object. 
// Display all complex numbers. (Use the concept of this pointer too.) 

import java.util.Scanner;
class complex{
    float real,imaginary;
    complex()
    {
        real=imaginary=0;
    }
    complex(float r,float imaginary)
    {
        real=r;
        this.imaginary=imaginary;
    }
    complex sum(complex s)
    {
        complex c=new complex();
        c.real=this.real+s.real;
        c.imaginary=this.imaginary+s.imaginary;
        return c;
    }
    public static void main(String[] args)throws Exception {
        float r,i;
        Scanner s=new Scanner(System.in);
        complex c1,c2,c3;
        System.out.println("Enter the real part of first complex number");
        r=s.nextFloat();
        System.out.println("Enter the imaginary part of first complex number");
        i=s.nextFloat();
        c1=new complex(r,i);
        System.out.println("Enter the real part of second complex number");
        r=s.nextFloat();
        System.out.println("Enter the imaginary part of second complex number");
        i=s.nextFloat();
        c2=new complex(r, i);
        c3=c1.sum(c2);
        System.out.println("Complex no 1 :"+c1.real+"+"+c1.imaginary+"i");
        System.out.println("Complex no 2 :"+c2.real+"+"+c2.imaginary+"i");
        System.out.println("Sum of complex nos :"+c3.real+"+"+c3.imaginary+"i");

    }
}
