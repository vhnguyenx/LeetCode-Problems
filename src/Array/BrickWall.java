package Array;

import java.util.HashMap;
import java.util.List;

public class BrickWall {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (List<Integer> row : wall) {
            int pos = 0;
            for (int i = 0; i < row.size() - 1; i++) {
                pos += row.get(i);
                map.put(pos, map.getOrDefault(pos, 0) + 1);
            }
        }

        int maxGap = 0;

        for (int gap : map.keySet()) {
            maxGap = Math.max(maxGap, map.get(gap));
        }

        return wall.size() - maxGap;
    }
}
