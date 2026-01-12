package Array;

import java.util.HashMap;

public class FindLuckyIntegerInAnArray {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int result = -1;

        for (Integer num : map.keySet()) {
            int freq = map.get(num);
            if (num == freq) {
                result = Math.max(result, num);
            }

        }
        return result;
    }
}
