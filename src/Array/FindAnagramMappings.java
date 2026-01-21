package Array;

import java.util.HashMap;

public class FindAnagramMappings {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] result = new int[nums2.length];

        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }
    
        int index = 0;
     
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                  result[index++] = map.get(nums1[i]);
            }
        }

        return result;
    }
}
