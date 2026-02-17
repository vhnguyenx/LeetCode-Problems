package String;

public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        int i = 0;
        int j = 0;

        while (j < s.length()) {
            while (s.charAt(j) != ' ' && j < s.length() - 1) {
                j++;
            }
            String str = "";

            if (j < s.length() - 1) {
                str = reverse(s.substring(i, j));
            } else {
                str = reverse(s.substring(i, j + 1));
            }

            if (j < s.length() - 1) {
                sb.append(str + " ");
            } else {
                sb.append(str);
            }

            i = j + 1;
            j++;
        }

        return sb.toString();
    }

    private String reverse(String s) {
        int l = 0;
        int r = s.length() - 1;
        char[] str = s.toCharArray();

        while (l < r) {
            char temp = str[l];
            str[l] = str[r];
            str[r] = temp;
            l++;
            r--;
        }

        return new String(str);
    }
}
