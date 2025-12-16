package String;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            if (map.containsKey(s.charAt(right))) {
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            }

            map.put(s.charAt(right), right);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
