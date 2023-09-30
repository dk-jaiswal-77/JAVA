import java.util.*;

public class Practice {
    public static int[][] findSubarrays(int[] arr) {
        int len = arr.length;
        int resLen = len * (len + 1) / 2;
        // [1, 2, 3, 4]
        int [][] res = new int [resLen][];
        int resCurrentIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            int[] tempArr = new int[1];
            for(int j = i; j < arr.length; j++) {
                if (j == i) {
                    tempArr[0] = arr[j];
                    res[resCurrentIndex] = tempArr;
                } else {
                    int[] newTempArr = Arrays.copyOf(tempArr, tempArr.length + 1);
                    newTempArr[newTempArr.length - 1] = arr[j];
                    res[resCurrentIndex] = newTempArr;
                    tempArr = newTempArr;
                }
                resCurrentIndex++;
            }
        }
        return res;
    }

    public static void printTwoDArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            // print nested array
            System.out.println("-----------------------");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    public static void printArrayList(List<Integer> list) {
        for (Integer item: list) {
            System.out.println(item);
        }
    }

    public static List<Integer> intersectionOfTwoArrays(int[] arr1, int[] arr2) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> mappings = new HashMap<>();
        // mapping of arr1 element as `key` & its frequency as corresponding value
        for (int i = 0; i < arr1.length; i++) {
            int key = arr1[i];
            if (mappings.containsKey(key)) {
                mappings.put(key, mappings.get(key) + 1);
            } else {
                mappings.put(key, 1);
            }
        }

        for (int j = 0; j < arr2.length; j++) {
            int key = arr2[j];
            if (mappings.containsKey(key)) {
                int freq = mappings.get(key);
                if (freq > 0) {
                    res.add(key);
                    mappings.put(key, freq - 1);
                }
            }
        }
        return res;
    }

    public static void printCol(int col, int[][] arr) {
        int rows = arr.length;
        if (col % 2 == 0) {
            for (int row = 0; row < rows; row++) {
                System.out.print(arr[row][col] + " ");
            }
        } else {
            for (int row = rows - 1; row >= 0; row--) {
                System.out.print(arr[row][col] + " ");
            }
        }
        System.out.println();
    }
    public static void print2DArrayInWaveForm(int [][] arr) {
        // iterating to each col
        int cols = arr[0].length;
        for(int col = 0; col < cols; col++) {
            printCol(col, arr);
        }
    }

    public static int calculateForPosition(int row, int col, int[][] arr1, int[][] arr2) {
        int sum = 0;
        for(int i = 0; i < arr1[row].length; i++) {
            sum += (arr1[row][i] * arr2[col][i]);
        }
        return sum;
    }

    public static int[][] matrixMultiplication(int [][]arr1, int [][]arr2) {
        int row1 = arr1.length;
        int col1 = arr1[0].length;
        int row2 = arr2.length;
        int col2 = arr2[0].length;

        if (col1 != row2) {
            System.out.println("invalid input...");
            return null;
        }

        int rows = row1;
        int cols = col2;

        int [][] res = new int [rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                res[row][col] = calculateForPosition(row, col, arr1, arr2);
            }
        }

        return res;
    }
    public static void main(String [] args) {
        // non-empty subarrays of an array ----------------------------------->
        int[] arr1 = {1, 2, 3, 4};
        int[][] res1 = findSubarrays(arr1);
//        printTwoDArray(res1);

        // intersection of arrays ----------------------------------->
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        int[] arr3 = {10, 1, 2, 11, 2, 4, 4, 5, 9};
        List<Integer> intersectionOfTwoArrays1 = intersectionOfTwoArrays(arr2, arr3);
//        printArrayList(intersectionOfTwoArrays1);

        // print 2D array in wave form ------------------------------->
        int[][] twoDArr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
//        print2DArrayInWaveForm(twoDArr);

        // matrix multiplication ------------------------------------>
        int[][] towDArr2 = {
                {1, 2, 3},
                {1, 2, 3}
        };
        int[][] towDArr3 = {
                {1, 2, 3},
                {4, 5, 6},
                {1, 2, 3}
        };
        int [][] matrixMultiplicationRes1 = matrixMultiplication(towDArr2, towDArr3);
        printTwoDArray(matrixMultiplicationRes1);
    }
}
