package String;

public class CountTheNumberOfConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] base = new boolean[26];

        for (int i = 0; i < allowed.length(); i++) {
            base[allowed.charAt(i) - 'a'] = true;
        }

        int count = 0;

        for (String word : words) {
            boolean ok = true;

            for (char c : word.toCharArray()) {
                if (base[c - 'a'] == false) {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                count++;
            }
        }

        return count;
    }
}
