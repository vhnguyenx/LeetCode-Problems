package Array;

public class FindFirstPalindromicStringInTheArray {
    public String firstPalindrome(String[] words) {
        for (String str : words) {
            if (isValid(str)) {
                return str;
            }
        }

        return "";
    }

    private boolean isValid(String word) {
        int l = 0;
        int r = word.length() - 1;

        while (l <= r) {
            if (word.charAt(l) != word.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}
