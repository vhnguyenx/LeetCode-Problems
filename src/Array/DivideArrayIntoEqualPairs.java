package Array;

import java.util.HashMap;

public class DivideArrayIntoEqualPairs {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Integer num : map.values()) {
            if (num % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}
