package String;

import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {

        if (magazine.length() < ransomNote.length()) {
            return false;
        }

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            hashMap.put(ransomNote.charAt(i), hashMap.getOrDefault(ransomNote.charAt(i), 0) + 1);

        }

        for (int i = 0; i < magazine.length(); i++) {
            hashMap.put(magazine.charAt(i), hashMap.getOrDefault(magazine.charAt(i), 0) - 1);
        }

        for (Integer check : hashMap.values()) {
            if (check > 0) {
                return false;
            }
        }

        return true;
    }
}