import java.util.*;

class Student {
    // Attributes
    String name;
    int age;
    double gpa;

    // Constructor
    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Method to print detailed info
    void printInfo() {
        System.out.println("---- Student Information ----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("-----------------------------");
    }
}

public class Main21 {
    public static void main(String[] args) {
        // Create two student objects
        Student student1 = new Student("zayed", 21, 6.8);
        Student student2 = new Student("saif", 19, 7.5);

        // Print individual fields
        System.out.println("Student 1 -> Name: " + student1.name + ", Age: " +
                student1.age + ", GPA: " + student1.gpa);
        System.out.println("Student 2 -> Name: " + student2.name + ", Age: " +
                student2.age + ", GPA: " + student2.gpa);

        // Call printInfo() method
        student1.printInfo();
        student2.printInfo();
    }
}
