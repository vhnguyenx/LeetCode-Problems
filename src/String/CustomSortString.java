package String;

public class CustomSortString {
    public String customSortString(String order, String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            int index = c - 'a';
            while (freq[index]-- > 0) {
                result.append(c);
            }
        }

        for (int i = 0; i < freq.length; i++) {
            while (freq[i]-- > 0) {
                result.append((char) ('a' + i));
            }
        }

        return result.toString();
    }
}