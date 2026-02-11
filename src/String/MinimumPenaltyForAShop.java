package String;

public class MinimumPenaltyForAShop {
    public int bestClosingTime(String customers) {
        int totalY = 0;
        for (char arrive : customers.toCharArray()) {
            if (arrive == 'Y') {
                totalY++;
            }
        }

        int ans = 0;
        int totalN = 0;
        int minPen = totalY;
        for (int i = 0; i < customers.length(); i++) {
            if (customers.charAt(i) == 'Y') {
                totalY--;
            } else {
                totalN++;
            }

            int penalty = totalY + totalN;

            if (minPen > penalty) {
                ans = i + 1;
            }

            minPen = Math.min(minPen, penalty);
        }

        return ans;
    }
}
