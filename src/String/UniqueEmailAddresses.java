package String;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {

        Set<String> set = new HashSet<>();

        for (String email : emails) {
            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];

            if (local.contains("+")) {
                local = local.substring(0, local.indexOf("+"));
            }

            local = local.replace(".", "");

            set.add(local + "@" + domain);
        }

        return set.size();
    }
}
