package String;

import java.util.Arrays;

public class UniqueLengthThreePalindromicSubsequences {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();

        int[] first = new int[26];
        int[] last = new int[26];

        Arrays.fill(first, -1);
        Arrays.fill(last, -1);

        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'a';
            if (first[c] == -1) {
                first[c] = i;
            }
            last[c] = i;
        }

        int ans = 0;

        for (int i = 0; i < 26; i++) {
            int L = first[i], R = last[i];

            if (L == -1 || L >= R) {
                continue;
            }

            boolean[] seenMid = new boolean[26];

            for (int j = L + 1; j <= R - 1; j++) {
                seenMid[s.charAt(j) - 'a'] = true;
            }

            for (int j = 0; j < 26; j++) {
                if (seenMid[j]) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
