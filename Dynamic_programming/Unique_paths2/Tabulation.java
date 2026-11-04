package Dynamic_programming.Unique_paths2;

public class Tabulation {
    private int countPaths(int rows, int cols, int[][] grid, int[][] dp) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                // If obstacle → no path
                if (grid[i][j] == 1) {
                    dp[i][j] = 0;
                    continue;
                }

                // Starting cell
                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                    continue;
                }

                int fromUp = 0;
                int fromLeft = 0;

                if (i > 0)
                    fromUp = dp[i - 1][j];
                if (j > 0)
                    fromLeft = dp[i][j - 1];

                dp[i][j] = fromUp + fromLeft;
            }
        }

        return dp[rows - 1][cols - 1];
    }

    public int uniquePathsWithObstacles(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        // 🔥 Edge case fix
        if (grid[0][0] == 1)
            return 0;

        int[][] dp = new int[rows][cols];

        return countPaths(rows, cols, grid, dp);
    }
}
