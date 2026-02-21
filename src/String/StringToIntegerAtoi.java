package String;

public class StringToIntegerAtoi {
     public int myAtoi(String s) {
        int sign = 1;
        int index = 0;

        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }

        while (index < s.length() && (s.charAt(index) == '-' || s.charAt(index) == '+')) {
            sign = s.charAt(index) == '-' ? -1 : 1;
            index++;
            break;
        }

        long result = 0;

        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            result = result * 10 + (s.charAt(index) - '0');

            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            index++;
        }

        return (int) result * sign;
    }
}
