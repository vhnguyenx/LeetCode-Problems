package Array;

public class NumberOfSubArraysWithOddSum {
    public int numOfSubarrays(int[] arr) {
        final int MOD = 1_000_000_000 + 7;

        int eventCount = 1, oddCount = 0;
        int ans = 0, prefix = 0;

        for (int num : arr) {
            prefix += num;
            if (prefix % 2 == 0) {
                ans = (ans + oddCount) % MOD;
                eventCount++;
            } else {
                ans = (ans + eventCount) % MOD;
                oddCount++;
            }
        }

        return ans;
    }
}