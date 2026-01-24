package Array;

import java.util.Arrays;

public class SpecialArrayWithXElementsGreaterThanOrEqualX {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);  
        int n = nums.length;
      
        if (nums[0] >= n) {
            return n;
        }
       
        for (int i = 1; i <= n; i++) {
            int candidate = n - i;
            if (nums[candidate] >= i && nums[candidate - 1] < i) {
                return i;
            }
        }

        return -1;
    }
}
