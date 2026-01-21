package String;

public class SingleRowKeyboard {
    public int calculateTime(String keyboard, String word) {
        int[] base = new int[26];

        for (int i = 0; i < base.length; i++) {
            base[keyboard.charAt(i) - 'a'] = i;
        }

        int totalTime = 0;
        int previous = 0;

        for (int i = 0; i < word.length(); i++) {
            int current = base[word.charAt(i) - 'a'];

            totalTime += Math.abs(current - previous);

            previous = current;
        }

        return totalTime;
    }
}
