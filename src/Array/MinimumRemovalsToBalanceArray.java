package Array;

import java.util.Arrays;

public class MinimumRemovalsToBalanceArray {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int maxLen = 0;
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            if (nums[r] > (long) nums[l] * k) {
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
        }

        return n - maxLen;
    }
}
