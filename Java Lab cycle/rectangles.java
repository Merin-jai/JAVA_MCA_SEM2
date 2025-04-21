// Define a class called Rectangle with member variables length and width. Use appropriate member functions to calculate the perimeter
//  and area of the rectangle. Define another member function int sameArea(Rectangle) that has one parameter of type Rectangle. 
// sameArea returns 1 if the two Rectangles have the same area, and returns 0 if they dont. 
// Use appropriate constructors to initialize the member variables(Use both default and parameterized constructor)
// 3	Write a main function to create two rectangle objects and display its area and perimeter. 
// Check whether the two Rectangles have the same area and print a message indicating the result. (Use the concept of this pointer too) 

import java.util.Scanner;

class rectangles
{
    int length,width,area;
    rectangles()
    {
        length=0;width=0;
    }
    rectangles(int l,int w)
    {
        length=l;
        width=w;
    }
    void perimeter()
    {
      System.out.println("Perimeter = "+2*(length+width));
    }
    void area()
    {
        area=length*width;
        System.out.println("Area = "+area);
    }
    int sameArea(rectangles r)
    {
        if(this.area==r.area)
           return 1;
        else
          return 0;

    }
    public static void main(String[] args)throws Exception {
        rectangles r1,r2;
        int l,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the details of Rectangle 1");
        System.out.println("Enter length and breadth");
        l=s.nextInt();
        b=s.nextInt();
        r1=new rectangles(l,b);
        r1.perimeter();
        r1.area();
        System.out.println("Enter the details of Rectangle 2");
        System.out.println("Enter length and breadth");
        l=s.nextInt();
        b=s.nextInt();
        r2=new rectangles(l,b);
        r2.perimeter();
        r2.area();
        int c=r2.sameArea(r1);
        if(c==1)
        {
            System.out.println("Same area");
        }
        else 
          System.out.println("Not same area");
    }
}

