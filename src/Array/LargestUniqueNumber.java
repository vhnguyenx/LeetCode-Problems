package Array;

import java.util.HashMap;

public class LargestUniqueNumber {
    public int largestUniqueNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(Integer num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int uniqueNum = 0;
        int largestUniqueNum = 0;

        for(Integer key : map.keySet()){
            if(map.get(key) == 1){
                uniqueNum = key;
                largestUniqueNum = Math.max(largestUniqueNum, uniqueNum);
            }
        }

        return largestUniqueNum == 0 ? -1 : largestUniqueNum;
    }
}
