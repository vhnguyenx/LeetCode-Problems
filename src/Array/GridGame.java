package Array;

public class GridGame {
    public long gridGame(int[][] grid) {
        int n = grid[0].length;

        long topRemain = 0;

        for (int i = 0; i < n; i++) {
            topRemain += grid[0][i];
        }

        long bottomGain = 0;
        long ans = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            topRemain -= grid[0][i];
            long robot2 = Math.max(topRemain, bottomGain);
            ans = Math.min(ans, robot2);
            bottomGain += grid[1][i];
        }

        return ans;
    }
}
