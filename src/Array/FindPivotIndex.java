package Array;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;

        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }

        int totalLeft = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i != 0) {
                totalLeft += nums[i - 1];
            }

            if (totalSum - totalLeft - nums[i] == totalLeft) {
                return i;
            }
        }
        return -1;
    }
}
