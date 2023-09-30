package assignments;
import java.util.Scanner;
public class Assignment12 {

    public static Scanner sc = new Scanner(System.in);
    public static void printFirstNNaturalNumbers() {
        System.out.println("Enter any natural number: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        printFirstNNaturalNumbers();
    }
}
