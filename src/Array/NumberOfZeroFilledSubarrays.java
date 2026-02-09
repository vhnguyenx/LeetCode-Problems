package Array;

public class NumberOfZeroFilledSubarrays {
    public long zeroFilledSubarray(int[] nums) {
        long countZero = 0;
        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                countZero++;
            } else {
                ans += (countZero * (countZero + 1)) / 2;
                countZero = 0;
            }
        }

        ans += (countZero * (countZero + 1)) / 2;

        return ans;
    }
}
