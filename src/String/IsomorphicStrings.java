package String;

import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if (mapS.containsKey(cs)) {
                if (mapS.get(cs) != ct) {
                    return false;
                }
            } else {
                mapS.put(cs, ct);
            }

            if (mapT.containsKey(ct)) {
                if (mapT.get(ct) != cs) {
                    return false;
                }
            } else {
                mapT.put(ct, cs);
            }
        }

        return true;
    }
}