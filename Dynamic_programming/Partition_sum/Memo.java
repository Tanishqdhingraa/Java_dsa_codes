package Dynamic_programming.Partition_sum;

import java.util.Arrays;

public class Memo {

    // Recursive helper with memoization
    private boolean isSubsetSum(int index, int target, int[] arr, int[][] dp) {

        // Base case: target achieved
        if (target == 0)
            return true;

        // Base case: only one element left
        if (index == 0)
            return arr[0] == target;

        // Return cached result
        if (dp[index][target] != -1) {
            return dp[index][target] == 1;
        }

        //  Not pick current element
        boolean notPick = isSubsetSum(index - 1, target, arr, dp);

        //  Pick current element (if possible)
        boolean pick = false;
        if (arr[index] <= target) {
            pick = isSubsetSum(index - 1, target - arr[index], arr, dp);
        }

        // Store result
        dp[index][target] = (pick || notPick) ? 1 : 0;

        return pick || notPick;
    }

    // Main function
    public boolean canPartition(int[] arr) {

        int n = arr.length;

        // Calculate total sum
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        // If sum is odd → cannot partition
        if (totalSum % 2 != 0)
            return false;

        int target = totalSum / 2;

        // DP array initialized with -1
        int[][] dp = new int[n][target + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return isSubsetSum(n - 1, target, arr, dp);
    }
}