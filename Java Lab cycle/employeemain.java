import java.util.Scanner; 
public class employeemain { 
 public static void main(String[] args) { 
 Scanner scanner = new Scanner(System.in); 
 // Input for Officer 
 System.out.println("Enter Officer details:"); 
 System.out.print("Name: "); 
 String officerName = scanner.nextLine(); 
 System.out.print("Age: "); 
 int officerAge = scanner.nextInt(); 
 scanner.nextLine(); // Consume newline 
 System.out.print("Phone Number: "); 
 String officerPhoneNumber = scanner.nextLine(); 
 System.out.print("Address: "); 
 String officerAddress = scanner.nextLine(); 
 System.out.print("Salary: "); 
 double officerSalary = scanner.nextDouble(); 
 scanner.nextLine(); // Consume newline 
 System.out.print("Specialization: "); 
 String officerSpecialization = scanner.nextLine(); 
 // Creating Officer object 
 Officer officer = new Officer(officerName, officerAge, officerPhoneNumber, officerAddress, 
officerSalary, officerSpecialization); 
 // Input for Manager 
 System.out.println("\nEnter Manager details:"); 
 System.out.print("Name: "); 
 String managerName = scanner.nextLine(); 
 System.out.print("Age: "); 
 int managerAge = scanner.nextInt(); 
 scanner.nextLine(); // Consume newline 
 System.out.print("Phone Number: "); 
 String managerPhoneNumber = scanner.nextLine(); 
 System.out.print("Address: "); 
 String managerAddress = scanner.nextLine(); 
 System.out.print("Salary: "); 
 double managerSalary = scanner.nextDouble(); 
 scanner.nextLine(); // Consume newline 
 System.out.print("Department: "); 
 String managerDepartment = scanner.nextLine(); 
 // Creating Manager object 
 Manager manager = new Manager(managerName, managerAge, managerPhoneNumber, 
managerAddress, managerSalary, managerDepartment); 
 // Printing details 
 System.out.println("\nOfficer details:"); 
 System.out.println("Name: " + officer.name); 
 System.out.println("Age: " + officer.age); 
 System.out.println("Phone Number: " + officer.phoneNumber); 
 System.out.println("Address: " + officer.address); 
 System.out.println("Salary: " + officer.salary); 
 System.out.println("Specialization: " + officer.specialization); 
 officer.printSalary(); 
 System.out.println("\nManager details:"); 
 System.out.println("Name: " + manager.name); 
 System.out.println("Age: " + manager.age); 
 System.out.println("Phone Number: " + manager.phoneNumber); 
 System.out.println("Address: " + manager.address); 
 System.out.println("Salary: " + manager.salary); 
 System.out.println("Department: " + manager.department); 
 manager.printSalary(); 
 scanner.close(); 
 } 
} 
class Employee { 
 String name; 
 int age; 
 String phoneNumber; 
 String address; 
 double salary; 
 // Constructor 
 public Employee(String name, int age, String phoneNumber, String address, double salary) { 
 this.name = name; 
 this.age = age; 
 this.phoneNumber = phoneNumber; 
 this.address = address; 
 this.salary = salary; 
 } 
 // Method to print salary 
 public void printSalary() { 
    System.out.println("Salary: " + salary); 
    } 
   } 
   class Officer extends Employee { 
    String specialization; 
    // Constructor 
    public Officer(String name, int age, String phoneNumber, String address, double salary, String 
   specialization) { 
    super(name, age, phoneNumber, address, salary); 
    this.specialization = specialization; 
    } 
   } 
   class Manager extends Employee { 
    String department; 
    // Constructor 
    public Manager(String name, int age, String phoneNumber, String address, double salary, String 
   department) { 
    super(name, age, phoneNumber, address, salary); 
    this.department = department; 
    } 
   } 
   
