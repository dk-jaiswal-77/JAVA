package assignments;
import java.util.Scanner;

public class Assignment15 {
    public static void main(String[] args) {

    }
}

class Employee2 {
    private static int instanceCount;
    private static int genEmpId() {
        return ++instanceCount;
    };
    private int empid;
    private String name;
    private double salary;

    {
        empid = genEmpId();
    }
    public Employee2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your salary: ");
        salary = sc.nextDouble();
    };
    public Employee2(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

}

class Person2 {
    private String name;
    private int age;
    public Person2() {
        name = "Anonymous";
        age = 0;
    };
    public Person2(String name) {
        this.name = name;
    }
    public Person2(int age) {
        this.age = age;
    }
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
