import java.util.*;

// Staff class
class Staff {
    int code;
    String name;

    public Staff(int code, String name) {
        this.code = code;
        this.name = name;
    }
}

// Faculty class
class Faculty extends Staff {
    String department;
    String subjectTaken;
    String researchArea;

    public Faculty(int code, String name, String department, String subjectTaken, String researchArea) {
        super(code, name);
        this.department = department;
        this.subjectTaken = subjectTaken;
        this.researchArea = researchArea;
    }
}

// Typist class
class Typist extends Staff {
    String office;
    int speed;

    public Typist(int code, String name, String office, int speed) {
        super(code, name);
        this.office = office;
        this.speed = speed;
    }
}

// Permanent class
class Permanent extends Typist {
    double salary;

    public Permanent(int code, String name, String office, int speed, double salary) {
        super(code, name, office, speed);
        this.salary = salary;
    }
}

// Casual class
class Casual extends Typist {
    double dailyWages;

    public Casual(int code, String name, String office, int speed, double dailyWages) {
        super(code, name, office, speed);
        this.dailyWages = dailyWages;
    }
}

// Officer class
class Officer extends Staff {
    String rank;
    String grade;

    public Officer(int code, String name, String rank, String grade) {
        super(code, name);
        this.rank = rank;
        this.grade = grade;
    }
}

public class inherit {
    public static void main(String[] args) {
        // Example usage
        Faculty faculty = new Faculty(101, "John Doe", "Computer Science", "Data Structures", "Machine Learning");
        System.out.println("Faculty: " + faculty.name);

        Permanent permanentTypist = new Permanent(201, "Alice Smith", "Administration", 60, 50000.0);
        System.out.println("Permanent Typist: " + permanentTypist.name);

        Casual casualTypist = new Casual(301, "Bob Johnson", "Accounts", 50, 1000.0);
        System.out.println("Casual Typist: " + casualTypist.name);

        Officer officer = new Officer(401, "Jane Doe", "Commander", "A");
        System.out.println("Officer: " + officer.name);
    }
}

