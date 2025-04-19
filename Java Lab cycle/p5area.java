// Write a Java progWrite a Java program to calculate the area of different shapes namely circle, rectangle, trapezoid and triangle. 
// (Use the concepts of JAVA like this keyword, constructor overloading and method overloading) 
import java.io.*;
import java.util.*;

import javafx.scene.shape.Rectangle;
interface shape
{
    void area();
}
class Rectangl
{
    int l,b;
    Rectangl()
    {
       this.l=0;
       this.b=0;
    }
    Rectangl(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    public void area()
    {
        System.out.println("Area of Rectangle : "+(l*b));
    }
}
class circle
{
    int r;
    circle(int r)
    {
        this.r=r;
    }
    public void area()
    {
        System.out.println("Area of circle : "+(3.14*r*r));
    }
}
class triangle
{
    int b,h;
    triangle(int b,int h)
    {
        this.b=b;
        this.h=h;
    }
    public void area()
    {
        System.out.println("Area of triangle : "+(0.5*b*h));
    }
}
class trapezium
{
    int a,b,h;
    trapezium(int a,int b,int h)
    {
        this.a=a;
        this.b=b;
        this.h=h;
    }
    public void area()
    {
        System.out.println("Area of trapezium : "+(0.5*(a+b)*h));
    }
}
public class p5area
{
    public static void main(String args[])
    {
       int ch;
       int l,b,h,a;
       Scanner s=new Scanner(System.in);
       try
       {
          System.out.println("1.Circle\n2.Rectangle\n3.Trapezium\n4.Triangle\n5.Quit");
          System.out.println("Enter your choice : ");
          ch=s.nextInt();
          switch(ch)
          {
            case 1 : System.out.println("Enter radius");
                     a=s.nextInt();
                     circle c=new circle(a);
                     c.area();break;
            case 2 : System.out.println("Enter length and breadth");
                     l=s.nextInt();
                     b=s.nextInt();
                     Rectangl r=new Rectangl(l,b);
                     r.area();break;
            case 3 : System.out.println("Enter a,b,h");
                     a=s.nextInt();
                     b=s.nextInt();
                     h=s.nextInt();
                     trapezium ta=new trapezium(a,b,h);
                     ta.area();break;
            case 4 : System.out.println("Enter base and height");
                     l=s.nextInt();
                     b=s.nextInt();
                     triangle t=new triangle(l,b);
                     t.area();break;
            default : System.out.println("Invalid choice");
          }
       }
       catch(Exception e)
       {
        System.out.println(e);
       }
    }
}
