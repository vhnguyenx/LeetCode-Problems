package Array;

public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        if (nums.length == 1) {
            return true;
        }

        int j = 0;
        int k = 1;

        while (nums[j] == nums[k] && j < nums.length - 1 && k < nums.length - 1) {
            j++;
            k++;
        }

        if (nums[j] > nums[k]) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > nums[i - 1]) {
                    return false;
                }
            }
        } else if (nums[j] < nums[k]) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i - 1]) {
                    return false;
                }
            }
        }

        return true;
    }
}
