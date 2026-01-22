package String;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
       
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }

    public int firstUniqCharV2(String s) {
        int[] base = new int[26];

        for (char c : s.toCharArray()) {
            base[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (base[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
