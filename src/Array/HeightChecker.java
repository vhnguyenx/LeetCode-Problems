package Array;

import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] sortedArr = Arrays.copyOf(heights, heights.length);
        
        Arrays.sort(sortedArr);
        
        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sortedArr[i]) {
                count++;
            }
        }
    
        return count;
    }
}
