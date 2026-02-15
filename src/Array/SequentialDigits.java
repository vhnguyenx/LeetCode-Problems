package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();

        String digits = "123456789";

        for (int len = 2; len <= 9; len++) {
            for (int start = 0; len + start <= 9; start++) {
                int num = Integer.parseInt(digits.substring(start, start + len));
                if (num >= low && num <= high) {
                    result.add(num);
                }
            }
        }

        return result;
    }
}
