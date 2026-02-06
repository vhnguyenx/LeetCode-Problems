package String;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        char[] words = s.toCharArray();

        int n = cleanUpWord(words);
        reverseWord(words, 0, n - 1);

        int start = 0;
        for (int end = 0; end <= n; end++) {
            if (end == n || words[end] == ' ') {
                reverseWord(words, start, end - 1);
                start = end + 1;
            }
        }

        return new String(words, 0, n);
    }

    private int cleanUpWord(char[] words) {
        int i = 0;
        int j = 0;
        int n = words.length;

        while (j < n) {
            while (j < n && words[j] == ' ') {
                j++;
            }

            while (j < n && words[j] != ' ') {
                words[i] = words[j];
                i++;
                j++;
            }

            while (j < n && words[j] == ' ') {
                j++;
            }

            if (j < n) {
                words[i] = ' ';
                i++;
            }
        }

        return i;
    }

    private void reverseWord(char[] arr, int i, int j) {
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
