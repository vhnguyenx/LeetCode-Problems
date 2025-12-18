package Array;

import java.util.HashMap;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int duplicate = 0;
        int missing = 0;
        int[] result = new int[2];

        for (int i = 1; i < nums.length; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2) {
                    duplicate = i;
                }
            } else {
                missing = i;
            }
        }

        result[0] = duplicate;
        result[1] = missing;

        return result;
    }
}
