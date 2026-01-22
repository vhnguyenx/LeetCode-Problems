package String;

public class PerformStringShifts {
    public String stringShift(String s, int[][] shift) {
        
        for (int i = 0; i < shift.length; i++) {
            if (shift[i][0] == 0) {
                s = leftShift(s, shift[i][1]);
            } else {
                s = rightShift(s, shift[i][1]);
            }
        }

        return s;
    }

    public String leftShift(String s, int k) {
        return s.substring(k) + s.substring(0, k);
    }

    public String rightShift(String s, int k) {
        return s.substring(s.length() - k) + s.substring(0, s.length() - k);
    }
}
