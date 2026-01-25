package Array;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestAndLowestOfKScores {
    public int minimumDifference(int[] nums, int k) {
        if (k == 1) {
            return 0;
        }

        Arrays.sort(nums);

        int i = 0;
        int j = k - 1;
        int score = Integer.MAX_VALUE;

        while (j < nums.length) {
            score = Math.min(nums[j++] - nums[i++], score);
        }

        return score;
    }
}
