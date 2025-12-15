package Array;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int check : map.keySet()) {
            if (map.get(check) > (nums.length / 2)) {
                return check;
            }
        }

        return -1;
    }
}
