class Tabulation1 {

    // Helper function using tabulation (bottom-up DP)
    int countPaths(int rows, int cols, int[][] dp) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                // Base case: starting cell
                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                } else {

                    int fromUp = 0;
                    int fromLeft = 0;

                    // If coming from top
                    if (i > 0) {
                        fromUp = dp[i - 1][j];
                    }

                    // If coming from left
                    if (j > 0) {
                        fromLeft = dp[i][j - 1];
                    }

                    // Total ways = sum of both directions
                    dp[i][j] = fromUp + fromLeft;
                }
            }
        }

        return dp[rows - 1][cols - 1];
    }

    // Main function
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        return countPaths(m, n, dp);
    }
}

// Driver class
public class Tabulation {
    public static void main(String[] args) {

        int m = 3;
        int n = 2;

        Tabulation1 solution = new Tabulation1();

        int result = solution.uniquePaths(m, n);

        System.out.println("Number of ways: " + result);
    }
}