// Define a class called Time that has hours and minutes as integer. T
// he class has the following member function: Time sum(Time) to sum two time object & return time a.
//  Use the concept of constructor overloading to initialize the time
// 6.1 Write the definitions for each of the above member functions.
// 6.2 Write main function to create three time objects. Set the value in two objects and 
// call sum() to calculate sum and assign it in third object. Display all time objects. (Use theconcept of this pointer too)

import java.util.Scanner;
class time{
    int hr,mins;
    time()
    {
        hr=mins=0;
    }
    time(int hr,int mins)
    {
        this.hr=hr;
        this.mins=mins;
    }
    time sum(time t)
    {
        time t1=new time();
        t1.hr=t.hr+this.hr;
        t1.mins=t.mins+this.mins;
        return t1;
    }
    public static void main(String[] args)throws Exception {
        int hr,mins;
        Scanner s=new Scanner(System.in);
        time c1,c2,c3;
        System.out.println("Enter the time 1(hrs,mins)");
        hr=s.nextInt();
        mins=s.nextInt();
        c1=new time(hr,mins);
        System.out.println("Enter the time 2(hr,mins)");
        hr=s.nextInt();
        mins=s.nextInt();
        c2=new time(hr, mins);
        c3=c1.sum(c2);
        System.out.println("TIME  1 :"+c1.hr+":"+c1.mins);
        System.out.println("TIME  2 :"+c2.hr+":"+c2.mins);
        System.out.println("Sum of time :"+c3.hr+":"+c3.mins);

    }
}

