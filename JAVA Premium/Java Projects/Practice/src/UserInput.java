public class UserInput {
    public static void main(String[] args) {
        // assignment 6: star patterns
        /*
            *
            * *
            * * *
            * * * *
            * * * * *
        */
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
                 *
               * *
             * * *
           * * * *
         * * * * *
         */
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int s = 1; s <= (n-i); s++) {
                System.out.print("  ");
            }
            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
            A B C D E
              A B C D
                A B C
                  A B
                    A
        */

        char letter = 'A';
        for (int i = n; i > 0; i--) {
            // print spaces
            for (int s = 1; s <= (n - i); s++) {
                System.out.print("  ");
            }

            // print letters
            for (int j = 0; j < i; j++) {
                System.out.print((char)(letter + j) + " ");
            }
            System.out.println();
        }

        /*
            1
            2 3
            4 5 6
            7 8 9 10
         */
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + "    ");
                count += 1;
            }
            System.out.println();
        }

        /*
            A B C D E
              B C D E
                C D E
                  D E
                    E
         */

        /*
            * * * * *
            *       *
            *       *
            *       *
            * * * * *
         */

    }
}
