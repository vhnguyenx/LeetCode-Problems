package String;

public class AddingSpacesToAString {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int spacingIndex = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (spacingIndex < spaces.length && i == spaces[spacingIndex]) {
                sb.append(" ");
                spacingIndex++;
            }

            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}
