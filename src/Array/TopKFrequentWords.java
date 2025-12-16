package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String str : words) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        List<String>[] bucket = new List[words.length + 1];

        for (String key : map.keySet()) {
            int freq = map.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] != null) {
                Collections.sort(bucket[i]);
            }
        }

        ArrayList<String> result = new ArrayList<>();

        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (String str : bucket[i]) {
                    result.add(str);

                    if (result.size() == k) {
                        return result;
                    }
                }
            }

        }

        return result;
    }
}
