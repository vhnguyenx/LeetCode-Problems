package Array;

public class TrionicArrayI {
    public boolean isTrionic(int[] nums) {
        int p = 0;
        int q = 0;

        if (nums[0] >= nums[1]) {
            return false;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                p = i;
                break;
            }
        }

        if (nums[p] <= nums[p + 1]) {
            return false;
        }

        for (int i = p + 1; i < nums.length - 1; i++) {
            if (nums[i] <= nums[i + 1]) {
                q = i;
                break;
            }
        }

        if (nums[q] >= nums[q + 1]) {
            return false;
        }

        for (int i = q + 1; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1] && i != nums.length - 1) {
                return false;
            }
        }

        return true;
    }
}
