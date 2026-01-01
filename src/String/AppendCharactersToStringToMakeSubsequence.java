package String;

public class AppendCharactersToStringToMakeSubsequence {
    public int AppendCharacters(String s, String t) {
        int count = 0;
        int i = 0;
        int j = 0;

        while (i < t.length() && j < s.length()) {
            if (t.charAt(i) == s.charAt(j)) {
                count++;
                i++;
            }
            j++;
        }

        return t.length() - count;
    }
}
