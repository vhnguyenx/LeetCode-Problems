package Array;

public class CountVowelStringsInRanges {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] pre = new int[n + 1];

        for (int i = 0; i < n; i++) {
            char startC = words[i].charAt(0);
            char endC = words[i].charAt(words[i].length() - 1);
            pre[i + 1] = pre[i] + ((isVowel(startC) && isVowel(endC)) ? 1 : 0);
        }

        int ans[] = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            ans[i] = pre[r + 1] - pre[l];
        }

        return ans;
    }

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
