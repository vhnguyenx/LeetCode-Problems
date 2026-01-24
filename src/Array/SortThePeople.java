package Array;

import java.util.HashMap;

public class SortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }

        int index = 0;
        for (int i = 10000; i > 0; i--) {
            if (map.containsKey(i)) {
                names[index++] = map.get(i);
            }
        }

        return names;
    }
}
