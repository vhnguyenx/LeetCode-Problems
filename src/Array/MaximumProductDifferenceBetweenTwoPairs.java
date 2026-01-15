package Array;

import java.util.Arrays;

public class MaximumProductDifferenceBetweenTwoPairs {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);

        int a = nums[0];
        int b = nums[1];
        int c = nums[nums.length - 1];
        int d = nums[nums.length - 2];
        
        return Math.abs((a * b) - (c * d));
    }
}