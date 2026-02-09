package String;

import java.util.ArrayList;
import java.util.List;

public class WordSubsets {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] words1Freq = new int[26];

        for (String b : words2) {
            int[] cnt = new int[26];
            for (char c : b.toCharArray()) {
                cnt[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                words1Freq[i] = Math.max(words1Freq[i], cnt[i]);
            }
        }
      
        List<String> result = new ArrayList<>();
       
        for (String a : words1) {
            int[] cnt = new int[26];

            for (char c : a.toCharArray()) {
                cnt[c - 'a']++;
            }

            boolean flag = true;

            for (int i = 0; i < 26; i++) {
                if (words1Freq[i] > cnt[i]) {
                    flag = false;
                }
            }

            if (flag) {
                result.add(a);
            }

        }
        return result;
    }
}
