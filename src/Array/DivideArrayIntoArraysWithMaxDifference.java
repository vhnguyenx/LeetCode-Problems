package Array;

import java.util.Arrays;

public class DivideArrayIntoArraysWithMaxDifference {
       public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);

        int[][] result = new int[nums.length / 3][3];

        int m = result.length;
        int n = result[0].length;
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = nums[index];
                index++;
            }
        }

        for (int i = 0; i < m; i++) {
            int a = result[i][0];
            int b = result[i][1];
            int c = result[i][2];
            if (Math.abs(a - c) > k || Math.abs(a - b) > k) {
                return new int[][] {};
            }
        }

        return result;
    }
}
