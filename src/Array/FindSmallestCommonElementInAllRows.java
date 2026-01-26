package Array;

import java.util.HashMap;

public class FindSmallestCommonElementInAllRows {
    public int smallestCommonElement(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int num = mat[i][j];
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int minCommon = Integer.MAX_VALUE;

        for (int num : map.keySet()) {
            if (map.get(num) == m) {
                minCommon = Math.min(minCommon, num);
            }
        }

        return minCommon == Integer.MAX_VALUE ? -1 : minCommon;
    }
}
