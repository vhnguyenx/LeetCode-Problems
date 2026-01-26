package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDif = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            minDif = Math.min(minDif, arr[i] - arr[i - 1]);
        }
       
        List<List<Integer>> result = new ArrayList<>();
       
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == minDif) {
                result.add(List.of(arr[i - 1], arr[i]));
            }
        }

        return result;
    }
}