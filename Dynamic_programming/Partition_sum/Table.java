package Dynamic_programming.Partition_sum;

public class Table {

    public boolean canPartition(int[] arr) {

        int n = arr.length;

        // Step 1: Calculate total sum
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        // Step 2: If total sum is odd → cannot partition
        if (totalSum % 2 != 0)
            return false;

        int target = totalSum / 2;

        // Step 3: DP table
        boolean[][] dp = new boolean[n][target + 1];

        // Step 4: Base case → target 0 is always possible
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }

        // Step 5: First element initialization
        if (arr[0] <= target) {
            dp[0][arr[0]] = true;
        }

        // Step 6: Fill DP table (pick / not pick)
        for (int i = 1; i < n; i++) {
            for (int t = 1; t <= target; t++) {

                // Not pick
                boolean notPick = dp[i - 1][t];

                // Pick
                boolean pick = false;
                if (arr[i] <= t) {
                    pick = dp[i - 1][t - arr[i]];
                }

                dp[i][t] = pick || notPick;
            }
        }

        // Step 7: Final answer
        return dp[n - 1][target];
    }
}