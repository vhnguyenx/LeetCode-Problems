package Array;

public class SumOfAbsoluteDifferencesInASortedArray {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        int[] res = new int[n];
        int prefix = 0;
        for (int i = 0; i < n; i++) {
            int left = (nums[i] * i) - prefix;
            int right = (sum - prefix - nums[i]) - (nums[i] * (n - i - 1));
            res[i] = left + right;
            prefix += nums[i];
        }

        return res;
    }
}
