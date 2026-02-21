package Array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
      public List<List<Integer>> generate(int numRows) {
        int[][] arr2D = new int[numRows][];

        for (int i = 0; i < numRows; i++) {
            arr2D[i] = new int[i + 1];
        }

        arr2D[0][0] = 1;

        for (int i = 1; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if (j == 0 || j == i) {
                    arr2D[i][j] = 1;
                } else {
                    arr2D[i][j] = arr2D[i - 1][j - 1] + arr2D[i - 1][j];
                }
            }
        }
        
        List<List<Integer>> result = new ArrayList<>();
        for (int[] num : arr2D) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < num.length; i++) {
                list.add(num[i]);
            }
            result.add(list);
        }

        return result;
    }
}
