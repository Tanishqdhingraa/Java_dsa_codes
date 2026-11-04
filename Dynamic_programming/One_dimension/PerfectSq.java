package Dynamic_programming.One_dimension;
// 🔹 Approach:

import java.util.Arrays;

// This problem is similar to Coin Change (minimum coins).
// We need to find the minimum number of perfect squares that sum to n.
//
// 1. Define dp[i] = minimum number of perfect squares to make sum i
// 2. Base case: dp[0] = 0 (0 requires 0 numbers)
// 3. For every i from 1 to n:
//      Try all perfect squares j*j ≤ i
//      dp[i] = min(dp[i], 1 + dp[i - j*j])
// 4. Return dp[n]
//
// 🔹 Time Complexity: O(n * sqrt(n))
// 🔹 Space Complexity: O(n)

public class PerfectSq {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], 1 + dp[i - j * j]);
            }
        }
        return dp[n];
    }
}
