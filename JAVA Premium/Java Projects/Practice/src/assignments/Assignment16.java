package assignments;
import java.util.Scanner;
import p1.Account;

public class Assignment16 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.inputData();
        emp1.displayData();
    }
}

class Person {
    private String name;
    protected void setName(String n) {
        name = n;
    }
    protected String getName() {
        return name;
    }
}

class Employee extends Person {
    private int salary;
    public void setSalary(int s) {
        salary = s;
    }
    public int getSalary() {
        return salary;
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee name and salary: ");
        setName(sc.nextLine());
        setSalary(sc.nextInt());
    }
    public void displayData() {
        System.out.println("name: " + getName());
        System.out.println("salary: " + getSalary());
    }
}

class Customer {
    private Account account = new Account();
    private String customerName;
    public void Deposit(double amt) {
        account.setBalance(amt);
    }
}
