package Dynamic_programming.Printing_longest_increasing_sub;

class Tabulation {

    /*
     * ============================================
     * APPROACH (Tabulation - Bottom Up DP)
     * ============================================
     * 
     * We convert the recursion:
     * solve(i, prev)
     * into a DP table:
     * dp[i][prev+1]
     * 
     * where:
     * - i = current index
     * - prev = index of last picked element (-1 means none)
     * 
     * Why prev+1?
     * → To handle prev = -1 (shift indexing)
     * 
     * Transition:
     * 
     * NOT PICK:
     * dp[i][prev+1] = dp[i+1][prev+1]
     * 
     * PICK (if valid):
     * dp[i][prev+1] = 1 + dp[i+1][i+1]
     * 
     * Finally take max of both.
     * 
     * Base Case:
     * dp[n][*] = 0
     * 
     * Time: O(n^2)
     * Space: O(n^2)
     */

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;

        int[][] dp = new int[n + 1][n + 1];

        // Fill table from bottom (i = n-1 → 0)
        for (int i = n - 1; i >= 0; i--) {

            for (int prev = i - 1; prev >= -1; prev--) {

                // ❌ NOT PICK
                int notPick = dp[i + 1][prev + 1];

                // ✅ PICK
                int pick = 0;
                if (prev == -1 || nums[i] > nums[prev]) {
                    pick = 1 + dp[i + 1][i + 1];
                }

                dp[i][prev + 1] = Math.max(pick, notPick);
            }
        }

        return dp[0][0]; // starting from index 0 with 
        // no previous element
    }
}