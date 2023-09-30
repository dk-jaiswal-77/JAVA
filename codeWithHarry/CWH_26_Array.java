public class CWH_26_Array {
    public static void main(String []args) {
        // int[] marks = {50, 60, 70, 80, 90};
        float[] marks = {50, 60, 70, 80, 90};
        System.out.println(marks.length);
        System.out.println(marks[1]); // 60.0
        String[] students = {"Dhirendra", "Kumar", "Jaiswal"};
        System.out.println(students);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        for (float mark: marks) {
            System.out.println(mark);
        }

        // for each loop
        for (String student: students) {
            System.out.println(student);
        }

        // multi-dimensional array
        int[][] arr = new int[2][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

        // practice set ---------------------------------------------->
        // 1 ---> create an array of 5 elements and calc sum.
        float[] floatArr = {1.5f, 2.5f, 3.5f, 4.5f, 5.5f};
        float sum = 0.0f;
        for (float num: floatArr) {
            sum += num;
        }
        System.out.println(sum);

        // 2 ---> find whether a given int is present in array or not
        int[] nums = {1, 3, 4, 5, 6};
        int matchNum = 7;
        boolean isPresent = false;
        for (int num: nums) {
            if (num == matchNum) {
                isPresent = true;
                break;
            }
        }
        System.out.println(isPresent ? "present..." : "not present!");

        // 3 ---> calc avg marks from array containing marks of all students in a class using for each loop
        int[] marks2 = {1, 2, 3, 4, 5, 6};
        int sum2 = 0;
        for (int mark: marks2) {
            sum2 += mark;
        }
        float avg2 = sum2 / ((float)(marks2.length));
        System.out.println(avg2);

        // 4 ---> Add two matrices of size 2X3
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix2 = {{7, 8, 9}, {1, 2, 3}};
        int matrixSum = 0;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrixSum = matrixSum + matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println(matrixSum);

        // 5 ---> Reverse an array
        int[] arr3 = {1, 2, 8, 4, 5};
        int[] resultArr = new int[5];
        int currentIndex = 0;
        for (int i = arr3.length - 1; i >= 0; i--) {
            resultArr[currentIndex] = arr3[i];
            currentIndex++;
        }
        // printing elements of reversed array
        for (int i = 0; i < resultArr.length; i++) {
            System.out.println(resultArr[i]);
        }

        // 6 ---> find max element in an array
        int maxElement = arr3[0];
        for (int i = 1; i < arr3.length; i++) {
            if (arr3[i] > maxElement) maxElement = arr3[i];
        }
        System.out.println(maxElement);

        // 8 ---> find whether an array is sorted or not
        int[] arr4 = {2, 2, 4, 5, 6};
        boolean isSorted = true;
        for (int i = 1; i < arr4.length; i++) {
            if (arr4[i] < arr4[i-1]) {
                isSorted = false;
                break;
            }
        }
        System.out.printf("Is array sorted? ---> %b", isSorted);
    }
}
