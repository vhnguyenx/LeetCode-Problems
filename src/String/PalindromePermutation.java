package String;

public class PalindromePermutation {
    public boolean canPermutePalindrome(String s) {
        int[] base = new int[26];

        for (Character c : s.toCharArray()) {
            base[c - 'a']++;
        }

        int odd = 0;

        for (int i = 0; i < base.length; i++) {
            if (base[i] % 2 == 1) {
                odd++;
            }

            if (odd > 1) {
                return false;
            }
        }

        return true;
    }
}
