package Array;

import java.util.List;

public class MaximumDistanceInArrays {
    public int maxDistance(List<List<Integer>> arrays) {
        int minVal = arrays.get(0).get(0);
        int maxVal = arrays.get(0).get(arrays.get(0).size() - 1);

        int result = 0;
        for (int i = 1; i < arrays.size(); i++) {
            int curMin = arrays.get(i).get(0);
            int curMax = arrays.get(i).get(arrays.get(i).size() - 1);

            result = Math.max(result, Math.abs(curMax - minVal));
            result = Math.max(result, Math.abs(maxVal - curMin));
  
            minVal = Math.min(minVal, curMin);
            maxVal = Math.max(maxVal, curMax);
        }

        return result;
    }
}