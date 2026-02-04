package String;

import java.util.HashSet;

public class CheckIfAStringContainsAllBinaryCodesOfSizeK {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> set = new HashSet<>();

        int numCode = 1 << k;

        int i = 0;
        int j = k;

        while (j <= s.length()) {
            set.add(s.substring(i, j));
            i++;
            j++;
            if (set.size() == numCode) {
                return true;
            }
        }

        if (set.size() < numCode) {
            return false;
        }

        return true;
    }
}
