package Array;

public class CountDominantIndices {
    public int dominantIndices(int[] nums) {
        int[] prefix = new int[nums.length];

        int sum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            prefix[i] = sum;
        }

        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > (sum - prefix[i]) / (nums.length - i - 1)) {
                count++;
            }
        }

        return count;
    }
}
