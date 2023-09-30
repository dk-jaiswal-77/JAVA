import java.util.*;

public class Functions {
    public static void printName(String name) {
        System.out.println(name);
        return;
    }

    public static void printFactorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);
    }

    // sum of all odd numbers from 1 to n
    public static void sumOfOdds(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i = i + 2) {
            sum += i;
        }
        System.out.println("sum of odds from 1 to " + n + " is: " + sum);
    }

    // greatest common divisor of 2 two numbers
    public static void gcd(int a, int b) {
        int divisor = a;
        int dividend = b;
        int remainder;
        while (divisor != 0) {
            remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        System.out.println(dividend);
    }

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // printName(name);

        // int n = sc.nextInt();
        // printFactorial(n);
        // sumOfOdds(n);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        gcd(num1, num2);
    }
}
