public class Pattern {
    public static void main(String []args){
        int row = 4;
        int col = 5;
        // solid rectangle
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // hollow rectangle 4 * 5
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // half-pyramid
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // inverted half pyramid
        for (int i = row; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 
        for (int i = 1; i <= row; i++) {
            int emptySpaces = row - i;
            for (int j = 1; j <= row; j++) {
                if (j <= emptySpaces) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        //
        row = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // 
        for (int i = row; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*
        1
        2 3
        4 5 6
        7 8 9 10
        */
        int num = 17;
        int limit = 1;
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            if (counter == limit) {
                System.out.println();
                limit++;
                counter = 0;
            }
            System.out.print(i + " ");
            counter++;
        }
        System.out.println();

        // n = 5
        int n = 5;
        int current = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                current++;
                System.out.print(current + " ");
            }
            System.out.println();
        }

        /*
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
        */

        n = 5;
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                Boolean isSumEven = ((i + j) % 2) == 0;
                System.out.print(isSumEven ? "1 " : "0 ");
            }
            System.out.println();
        }

        /*
                *             *
                * *         * *
                * * *     * * *
                * * * * * * * *
                * * * * * * * *
                * * *     * * *
                * *         * *
                *             *
        */

        n = 4;
        int cols = n * 2;
        // upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= cols; j++) {
                if (j <= i || j > (cols - i)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        // lower half
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= cols; j++) {
                if (j <= i || j > (cols - i)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        // solid rhombus
        /*
                *****
               *****
              *****
             *****
            *****
        */
        n = 5;
        int currentCols;
        for (int i = 1; i <= n; i++) {
            currentCols = (n * 2) -i;
            for (int j = 1; j <= currentCols; j++) {
                if (j > (currentCols - n)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // print the pattern
        /*  
                1
               2 2
              3 3 3
             4 4 4 4 
            5 5 5 5 5
        */
        n = 5;
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int s = 1; s <= (n-i); s++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        // palindromic pyramid
        /*
                    1
                  2 1 2
                3 2 1 2 3
              4 3 2 1 2 3 4
            5 4 3 2 1 2 3 4 5
        */
        n = 5;
        for (int r = 1; r <= n; r++) {
            // spaces
            for (int s = 1; s <= (n - r); s++) {
                System.out.print("  ");
            }
            // numbers --> first half
            for (int k = r; k >= 1; k--) {
                System.out.print(k + " ");
            }
            // numbers --> second half
            for (int j = 2; j <= r; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        // diamond shape 
        n = 4;
        // upper half of diamond
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int s = 1; s <= (n-i); s++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // lower half of diamond
        for (int k = n; k > 0; k--) {
            // spaces
            for (int s = 1; s <= (n-k); s++) {
                System.out.print("  ");
            }
            // stars
            for (int t = 1; t < (2*k); t++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
