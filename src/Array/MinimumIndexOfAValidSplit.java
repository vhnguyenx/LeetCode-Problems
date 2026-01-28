package Array;

import java.util.HashMap;
import java.util.List;

public class MinimumIndexOfAValidSplit {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = nums.get(i);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int dominant = 0;

        for (int key : map.keySet()) {
            if (map.get(key) > n / 2) {
                dominant = key;
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            int num = nums.get(i);

            if (num == dominant) {
                count++;
            }

            if (count > (i + 1) / 2 && (map.get(dominant) - count) > (n - (i + 1)) / 2) {
                return i;
            }
        }

        return -1;
    }
}
