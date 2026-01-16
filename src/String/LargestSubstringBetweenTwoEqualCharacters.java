package String;

import java.util.HashMap;

public class LargestSubstringBetweenTwoEqualCharacters {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int length = Integer.MIN_VALUE;
        int maxLength = -1;

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                length = i - map.get(s.charAt(i)) - 1;
            } else {
                map.put(s.charAt(i), i);
            }

            maxLength = Math.max(maxLength, length);
        }

        return maxLength != -1 ? maxLength : -1;
    }
}