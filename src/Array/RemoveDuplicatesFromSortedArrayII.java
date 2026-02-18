package Array;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        int write = 0;

        while (j < nums.length) {
            int count = 0;
            int val = nums[j];
            while (j < nums.length && nums[i] == nums[j]) {
                count++;
                j++;
            }
            i = j;
            int times = Math.min(2, count);
            for (int t = 0; t < times; t++) {
                nums[write++] = val;
            }
        }

        return write;
    }
}
