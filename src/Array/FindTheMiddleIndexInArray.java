package Array;

public class FindTheMiddleIndexInArray {
    public int findMiddleIndex(int[] nums) {
        int totalSum = 0;

        for (Integer num : nums) {
            totalSum += num;
        }

        int totalLeft = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                totalLeft += nums[i - 1];
            }

            if (totalLeft == totalSum - totalLeft - nums[i]) {
                return i;
            }
        }

        return -1;
    }
}
