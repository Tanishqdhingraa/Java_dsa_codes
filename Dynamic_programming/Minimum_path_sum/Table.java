package Dynamic_programming.Minimum_path_sum;

public class Table {
    // Function to calculate minimum path sum
    public int minPathSum(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        int[][] dp = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                // Base case: starting cell
                if (i == 0 && j == 0) {
                    dp[i][j] = grid[i][j];
                } else {

                    int fromUp = Integer.MAX_VALUE;
                    int fromLeft = Integer.MAX_VALUE;

                    // Coming from top
                    if (i > 0) {
                        fromUp = dp[i - 1][j];
                    }

                    // Coming from left
                    if (j > 0) {
                        fromLeft = dp[i][j - 1];
                    }

                    // Add current cell value
                    dp[i][j] = grid[i][j] + Math.min(fromUp, fromLeft);
                }
            }
        }

        return dp[rows - 1][cols - 1];
    }
}
