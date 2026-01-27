package Array;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int maxCount = 1;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int cur = num;
                int count = 1;

                while (set.contains(cur + 1)) {
                    count++;
                    cur++;
                }

                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount;
    }
}
