package String;

public class ConfusingNumber {
    public boolean confusingNumber(int n) {
        String num = String.valueOf(n);
        StringBuilder rotated = new StringBuilder();

        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);

            if (c == '9') {
                rotated.append('6');
            } else if (c == '8') {
                rotated.append('8');
            } else if (c == '6') {
                rotated.append('9');
            } else if (c == '1') {
                rotated.append('1');
            } else if (c == '0') {
                rotated.append('0');
            } else {
                return false;
            }
        }
      
        if (Integer.parseInt(rotated.toString()) == n) {
            return false;
        }

        return true;
    }
}