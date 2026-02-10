package String;

import java.util.HashSet;

public class OptimalPartitionOfString {
    public int partitionString(String s) {
        HashSet<Character> set = new HashSet<>();
        int ans = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                ans++;
                set.clear();
            }
            set.add(c);
        }

        return ans;
    }
}
