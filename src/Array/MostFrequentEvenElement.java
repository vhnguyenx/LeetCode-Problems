package Array;

import java.util.HashMap;

public class MostFrequentEvenElement {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }

        int result = -1;
        int maxFreq = 0;
     
        for (Integer key : map.keySet()) {
            int freq = map.get(key);
            
            if(freq > maxFreq || (freq == maxFreq && key < result)){
                maxFreq = freq;
                result = key;
            }

        }

        return result;
    }
}
