package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountingElements {
    public int countElements(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i] + 1)) {
                count++;
            }
        }

        return count;
    }
}
