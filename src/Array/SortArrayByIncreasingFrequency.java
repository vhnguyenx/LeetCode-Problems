package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SortArrayByIncreasingFrequency {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        for (int key : freqMap.keySet()) {
            int freq = freqMap.get(key);
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freqMap.get(key)].add(key);
        }

        int index = 0;

        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i] != null) {
                Collections.sort(buckets[i], Collections.reverseOrder());
                for (int val : buckets[i]) {
                    for (int j = 0; j < i; j++) {
                        nums[index++] = val;
                    }
                }
            }
        }

        return nums;
    }
}
