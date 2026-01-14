package String;

import java.util.HashMap;

public class FindWordsThatCanBeFormedByCharacters {
    public int countCharacters(String[] words, String chars) {
        int count = 0;
      
        for (String str : words) {

            HashMap<Character, Integer> freqMap = new HashMap<>();

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }

            for (int i = 0; i < chars.length(); i++) {
                if (freqMap.containsKey(chars.charAt(i))) {
                    freqMap.put(chars.charAt(i), freqMap.getOrDefault(chars.charAt(i), 0) - 1);
                }
            }

            boolean canForm = true;
       
            for (Integer freq : freqMap.values()) {
                if (freq > 0) {
                    canForm = false;
                    break;
                }

            }

            if (canForm) {
                count += str.length();
            }
        }

        return count;
    }
}