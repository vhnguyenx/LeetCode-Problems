package Array;

import java.util.HashMap;

public class KthDistinctStringInAnArray {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> freqMap = new HashMap<>();

        for (String str : arr) {
            freqMap.put(str, freqMap.getOrDefault(str, 0) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if (freqMap.get(arr[i]) == 1) {
                k--;
                if (k == 0) {
                    return arr[i];
                }
            }
        }

        return "";
    }
}
