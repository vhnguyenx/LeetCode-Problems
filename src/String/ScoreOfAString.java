package String;

public class ScoreOfAString {
    public int scoreOfString(String s) {
        int sum = 0;

        for (int i = 0; i + 1 < s.length(); i++) {
            int temp = 0;
            temp = Math.abs(s.charAt(i) - s.charAt(i + 1));
            sum += temp;
        }

        return sum;
    }
}
