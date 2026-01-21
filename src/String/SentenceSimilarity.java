package String;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SentenceSimilarity {
    public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        if (sentence1.length != sentence2.length) {
            return false;
        }

        Set<String> set = new HashSet<>();

        for (List<String> pair : similarPairs) {
            String a = pair.get(0);
            String b = pair.get(1);

            set.add(a + "-" + b);
            set.add(b + "-" + a);
        }

        for (int i = 0; i < sentence1.length; i++) {
            String word1 = sentence1[i];
            String word2 = sentence2[i];

            if (word1.equals(word2)) {
                continue;
            }

            if (!set.contains(word1 + "-" + word2)) {
                return false;
            }
        }

        return true;
    }
}