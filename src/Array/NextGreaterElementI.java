package Array;

import java.util.HashMap;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], i);
        }

        int[] result = new int[nums1.length];

        for (int i = nums2.length - 1; i >= 0; i--) {
            if (map.containsKey(nums2[i])) {
                int index = map.get(nums2[i]);
                for (int j = i; j < nums2.length; j++) {
                    if (nums2[i] < nums2[j]) {
                        result[index] = nums2[j];
                        break;
                    } else {
                        result[index] = -1;
                    }
                }
            }
        }

        return result;
    }
}
