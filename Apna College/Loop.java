import java.util.*;
public class Loop {
    public static void main(String []args){
        // for (int i = 0; i < 5; i++ ) {
        //     // System.out.println(i);
        //     System.out.print(i + " ");
        // }

        // int i = 0;
        // while (i < 10) {
        //     System.out.println(i);
        //     i++;
        // }

        // int i = 0;
        // do {
        //     System.out.println(i);
        //     i++;
        // } while (i < 10);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int sum = 0;
        // int i = 1;
        // while (i <= n) {
        //     sum += i;
        //     i++;
        // }
        // System.out.println("Sum of first n natural numbers is: " + sum);

        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }
}
