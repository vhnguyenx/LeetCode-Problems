package String;

public class MinimumNumberOfSwapsToMakeTheStringBalanced {
    public int minSwaps(String s) {
        int imBalance = 0;
        int count = 0;
        for (char bracket : s.toCharArray()) {
            if (bracket == '[') {
                count--;
            } else {
                count++;
                imBalance = Math.max(imBalance, count);
            }
        }

        return (imBalance + 1) / 2;
    }
}
