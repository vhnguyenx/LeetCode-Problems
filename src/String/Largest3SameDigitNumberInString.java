package String;

public class Largest3SameDigitNumberInString {
    public String largestGoodInteger(String num) {
        String ans = "";

        for (int i = 1; i < num.length() - 1; i++) {
            char a = num.charAt(i - 1);
            char b = num.charAt(i);
            char c = num.charAt(i + 1);

            if (a == b && b == c) {
                String temp = num.substring(i - 1, i + 2);
                if (ans.compareTo(temp) < 0) {
                    ans = temp;
                }
            }
        }

        return ans;
    }
}
