package Array;

import java.util.HashMap;

public class NumberOfPairsOfInterchangeableRectangles {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double, Integer> map = new HashMap<>();

        for (int[] r : rectangles) {
            double ratio = (double) r[0] / r[1];
            map.put(ratio, map.getOrDefault(ratio, 0) + 1);
        }

        long count = 0;

        for (int value : map.values()) {
            if (value >= 2) {
                count += (long) value * (value - 1) / 2;
            }
        }

        return count;
    }
}
