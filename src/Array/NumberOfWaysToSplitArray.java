package Array;

public class NumberOfWaysToSplitArray {
    public int waysToSplitArray(int[] nums) {
        long prefix = 0;

        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];
        }

        int count = 0;
        long sum = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            sum += nums[i];

            if (sum >= (prefix - sum)) {
                count++;
            }
        }

        return count;
    }
}
