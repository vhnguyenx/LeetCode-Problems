package String;

public class MaximumNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        int[] charCounts = new int[26];

        for (int i = 0; i < text.length(); i++) {
            charCounts[text.charAt(i) - 'a']++;
        }

        int min = charCounts[1];
        min = Math.min(min, charCounts[0]);
        min = Math.min(min, charCounts[11] / 2);
        min = Math.min(min, charCounts[14] / 2);
        min = Math.min(min, charCounts[13]);
      
        return min;
    }

}
