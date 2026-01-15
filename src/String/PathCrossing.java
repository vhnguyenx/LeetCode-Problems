package String;

import java.util.HashSet;
import java.util.Set;

public class PathCrossing {
    public boolean isPathCrossing(String path) {
        Set<String> set = new HashSet<>();

        int x = 0;
        int y = 0;

        set.add(x + "," + y);

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N') {
                x++;
            }

            if (path.charAt(i) == 'S') {
                x--;
            }

            if (path.charAt(i) == 'W') {
                y--;
            }

            if (path.charAt(i) == 'E') {
                y++;
            }

            String coordinate = x + "," + y;

            if (set.contains(coordinate)) {
                return true;
            }

            set.add(coordinate);
        }

        return false;
    }
}