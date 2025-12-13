package Array;

import java.util.HashMap;

public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        int ans = 0;

        for(Integer check : map.keySet()){
            if(map.get(check) >= 1){
              ans = check;
            }
        }
        
        return ans;
    }
}
