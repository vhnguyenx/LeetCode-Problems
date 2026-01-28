package Array;

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int i = 0;
        int j = 1;

        while (j < prices.length) {
            int currentDay = prices[i];
            int nextDay = prices[j];

            if (currentDay > nextDay) {
                i++;
                j++;
            } else {
                profit += nextDay - currentDay;
                i++;
                j++;
            }
        }

        return profit;
    }
}
