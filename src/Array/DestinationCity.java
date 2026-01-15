package Array;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity {
    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();

        for (int i = 0; i < paths.size(); i++) {
            set.add(paths.get(i).get(0));
        }

        for (int i = 0; i < paths.size(); i++) {
            String destination = paths.get(i).get(1);
            if (!set.contains(destination)) {
                return destination;
            }
        }

        return "";
    }
}