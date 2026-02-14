package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConvertAnArrayIntoA2DArrayWithConditions {
       public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
        }
 
        List<List<Integer>> result = new ArrayList<>();
       
        while (map.size() > 0) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(i)) {
                    if (!list.contains(nums[i])) {
                        list.add(nums[i]);
                        map.remove(i);
                    }
                }
            }
            result.add(list);
        }

        return result;
    }
}
