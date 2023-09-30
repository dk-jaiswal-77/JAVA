public class Array {
  public static void main(String [] args) {
    int[][] arr = new int [4][];
    System.out.println(arr[0]); // null
    // System.out.println(arr[0][0]); // error

    int[][] a = new int [4][];
    a[0] = new int [2];
    a[1] = new int [3];
    System.out.println(a[0].length);
    System.out.println(a[1].length);
  }
}
