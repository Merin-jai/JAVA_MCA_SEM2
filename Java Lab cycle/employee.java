import java.util.Scanner; 
class Employee { 
 public void display() { 
 System.out.println("Name of class is Employee."); 
 } 
 public void calcSalary() { 
 System.out.println("Salary of employee is 10000."); 
 } 
} 
class Engineer extends Employee { 
 @Override 
 public void calcSalary() { 
 System.out.println("Salary of employee is 20000."); 
 } 
} 
public class employee { 
 public static void main(String[] args) { 
 Engineer emp = new Engineer(); // Polymorphism: Employee reference, Engineer object 
 emp.display(); // Calls display method of Employee class 
 emp.calcSalary(); // Calls calcSalary method of Engineer class 
 } 
}
