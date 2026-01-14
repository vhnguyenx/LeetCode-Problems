package Array;

import java.util.HashMap;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
      
        HashMap<Integer, Integer> map = new HashMap<>();
      
        for (Integer num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Integer num : map.values()) {
            count += num * (num - 1) / 2;
        }

        return count;
    }
}
