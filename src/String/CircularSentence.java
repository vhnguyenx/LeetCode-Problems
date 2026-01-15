package String;

public class CircularSentence {
    public boolean isCircularSentence(String sentence) {
        if (sentence.charAt(0) != sentence.charAt(sentence.length() - 1)) {
            return false;
        }

        for (int i = 0; i < sentence.length() - 2; i++) {
            if (sentence.charAt(i + 1) == ' ') {
                if (sentence.charAt(i) != sentence.charAt(i + 2)) {
                    return false;
                }
            }
        }

        return true;
    }
}