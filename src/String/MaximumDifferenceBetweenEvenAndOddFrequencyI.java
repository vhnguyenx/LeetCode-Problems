package String;

import java.util.HashMap;

public class MaximumDifferenceBetweenEvenAndOddFrequencyI {
    public int maxDifference(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        for (Integer value : map.values()) {
            if (value % 2 == 1) {
                maxOdd = Math.max(maxOdd, value);

            } else {
                minEven = Math.min(minEven, value);
            }
        }

        return maxOdd - minEven;
    }
}