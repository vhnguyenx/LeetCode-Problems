package Array;

import java.util.*;

public class FindMissingAndRepeatedValues {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> set = new HashSet<>();

        int repeating = 0;
        int missing = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int num = grid[i][j];
                if (set.contains(num)) {
                    repeating = num;
                }
                set.add(num);
            }
        }
      
        int n = grid.length * grid.length;
     
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                missing = i;
                break;
            }
        }
    
        return new int[] { repeating, missing };
    }
}
