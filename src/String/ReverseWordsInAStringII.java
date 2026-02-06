package String;

public class ReverseWordsInAStringII {
    public void reverseWords(char[] s) {
        int n = s.length;

        reverse(s, 0, n - 1);

        int start = 0;
        for (int end = 0; end <= n; end++) {
            if (end == n || s[end] == ' ') {
                reverse(s, start, end - 1);
                start = end + 1;
            }
        }

    }

    private void reverse(char[] s, int i, int j) {
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
