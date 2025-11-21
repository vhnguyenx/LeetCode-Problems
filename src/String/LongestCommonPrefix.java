package String;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int y = 1; y < strs.length; y++) {
                if (strs[y].length() == i || strs[y].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
