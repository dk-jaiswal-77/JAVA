import java.util.*;

class Solution {
    public static List<List<Integer>> generate(int numRows) {
        // int [][]res = new int[numRows][];
        List<List<Integer>> res = new ArrayList<>(numRows);
        for (int i = 1; i <= numRows; i++) {
            // int []arr = new int[i];
            List<Integer> arr = new ArrayList<>(i);
            // arr[0] = 1;
            arr.add(1);
            // arr[i-1] = 1;
            if (i > 1) {
                arr.add(i-1, 1);
            }
            if (i < 3) {
                // res[i-1] = arr;
                res.add(i-1, arr);
                continue;
            }

            for (int j = 1; j < i; j++) {
                // arr[j] = res[i - 2][j] + res[i - 2][j - 1];
                List<Integer> li = res.get(i-1);
                Integer ele = li.get(j) + li.get(j-1);
                arr.add(j, ele);
            }
            // res[i-1] = arr;
            res.add(i-1, arr);
        }
        return res;
    }
}

public class Practice {
  public static void main(String [] args) {
    List<List<Integer>> li = Solution.generate(5);
    System.out.println(li);
  }
}
