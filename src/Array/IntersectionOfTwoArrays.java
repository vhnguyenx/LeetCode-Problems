package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            if (hashMap.get(nums1[i]) == null) {
                hashMap.put(nums1[i], 0);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (hashMap.containsKey(nums2[i])) {
                hashMap.put(nums2[i], hashMap.getOrDefault(nums2[i], 0) + 1);
            }
        }

        List<Integer> list = new ArrayList<>();

        for (Integer value : hashMap.keySet()) {
            if (hashMap.get(value) >= 1) {
                list.add(value);
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
