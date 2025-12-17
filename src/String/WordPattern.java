package String;

import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");

        if (arr.length != pattern.length()) {
            return false;
        }

        HashMap<Object, Integer> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = arr[i];

            if (!map.containsKey(c)) {
                map.put(c, i);
            }

            if (!map.containsKey(word)) {
                map.put(word, i);
            }

            if(map.get(word) != map.get(c)){
                return false;
            }

        }

        return true;
    }
}
