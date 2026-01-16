package String;

public class RedistributeCharactersToMakeAllStringsEqual {
    public boolean makeEqual(String[] words) {
        int length = words.length;
    
        int[] base = new int[26];

        for (String word : words) {
            for (char c : word.toCharArray()) {
                base[c - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (base[i] % length != 0) {
                return false;
            }
        }

        return true;
    }
}
