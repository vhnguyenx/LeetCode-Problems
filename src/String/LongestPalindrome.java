package String;

import java.util.HashMap;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        int count = 0;

        int singleCheck = 0;

        for (Integer freq : hashMap.values()) {
            if (freq > 1 && freq % 2 == 1) {
                singleCheck = 1;
                count += freq - 1;
            } else if (freq == 1) {
                singleCheck = 1;
            } else {
                count += freq;
            }
        }
       
        return count + singleCheck;
    }
}
