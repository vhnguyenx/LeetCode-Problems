package Array;

public class ChampagneTower {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] dp = new double[101][101];
        dp[0][0] = poured;
        for (int r = 0; r <= query_row; r++) {
            for (int g = 0; g <= r; g++) {
                if (dp[r][g] > 1) {
                    double overflow = (dp[r][g] - 1) / 2.0;
                    dp[r + 1][g] += overflow;
                    dp[r + 1][g + 1] += overflow;
                    dp[r][g] = 1;
                }
            }
        }

        return dp[query_row][query_glass];
    }
}
