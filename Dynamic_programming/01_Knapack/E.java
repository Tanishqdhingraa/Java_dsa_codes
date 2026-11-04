// !01 knapsack

//! Top down code 
public class E {
      static int knapsack(int W, int[] val, int[] wt) {
        int n = wt.length;
        int[][] dp = new int[n + 1][W + 1];

        // Build table dp[][] in bottom-up manner
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {

                // If there is no item or the knapsack's capacity is 0
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else {
                    int pick = 0;

                    // Pick ith item if it does not exceed the capacity of knapsack
                    if (wt[i - 1] <= j)
                        pick = val[i - 1] + dp[i - 1][j - wt[i - 1]];

                    // Don't pick the ith item
                    int notPick = dp[i - 1][j];

                    dp[i][j] = Math.max(pick, notPick);
                }
            }
        }
        return dp[n][W];
    }  
}
