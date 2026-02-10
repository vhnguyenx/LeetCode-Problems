package Array;

import java.util.HashSet;

public class LongestBalancedSubarrayI {
    public int longestBalanced(int[] nums) {
        int length = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            HashSet<Integer> evenSet = new HashSet<>();
            HashSet<Integer> oddSet = new HashSet<>();

            for (int j = i; j < n; j++) {
                if (nums[j] % 2 == 0) {
                    evenSet.add(nums[j]);
                } else {
                    oddSet.add(nums[j]);
                }

                if (evenSet.size() == oddSet.size()) {
                    length = Math.max(length, j - i + 1);
                }
            }
        }

        return length;
    }
}
