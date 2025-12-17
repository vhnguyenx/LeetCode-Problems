package Array;

import java.util.HashMap;

public class CountElementsWithStrictlySmallerAndGreaterElements {
    public int countElements(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        if(map.size() == 1){
            return 0;
        }

        int valueMin = nums[0];
        int valueMax = nums[0];

        for (Integer key : map.keySet()) {
            valueMin = Math.min(valueMin, key);
            valueMax = Math.max(valueMax, key);
        }

        return nums.length - (map.get(valueMin) + map.get(valueMax));
    }
}
