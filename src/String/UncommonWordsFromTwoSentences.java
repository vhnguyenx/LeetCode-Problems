package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UncommonWordsFromTwoSentences {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String s : arr1) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : arr2) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        List<String> result = new ArrayList<>();

        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                result.add(key);
            }
        }

        return result.toArray(new String[0]);
    }
}
