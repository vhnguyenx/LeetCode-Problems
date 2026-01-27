package String;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];

        int count = 0;
        int cost = 0;
        for (int i = 0; i < n; i++) {
            ans[i] += cost;
            if (boxes.charAt(i) == '1') {
                count++;
            }
            cost += count;
        }

        count = 0;
        cost = 0;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] += cost;
            if (boxes.charAt(i) == '1') {
                count++;
            }
            cost += count;
        }

        return ans;
    }
}