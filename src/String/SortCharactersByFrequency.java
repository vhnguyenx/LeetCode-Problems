package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SortCharactersByFrequency {
    // O(n)
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        List<Character>[] bucket = new List[s.length() + 1];

        for (Character key : map.keySet()) {
            int freq = map.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        StringBuilder result = new StringBuilder();

        for (int i = bucket.length - 1; i > 0; i--) {
            if (bucket[i] != null) {
                for (Character chars : bucket[i]) {
                    for (int j = 0; j < i; j++) {
                        result.append(chars);
                    }
                }
            }
        }

        return result.toString();
    }
}
