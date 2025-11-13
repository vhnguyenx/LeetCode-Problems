package ArrayAndString;

import java.util.HashSet;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        set.remove(0);
        int result = 0;
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return result = i;
            }
        }
        return result;
    }
}