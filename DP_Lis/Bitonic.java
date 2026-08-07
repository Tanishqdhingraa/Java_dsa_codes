package DP_Lis;

import java.util.Arrays;

public class Bitonic {
    public static int longestBitonicSequence(int n, int[] nums) {

        // LIS from left to right
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = max + 1;
        }

        // LDS from right to left
        int[] dp2 = new int[n];
        Arrays.fill(dp2, 1);

        for (int i = n - 2; i >= 0; i--) {
            int max = 0;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[i]) {
                    max = Math.max(max, dp2[j]);
                }
            }
            dp2[i] = max + 1;
        }

        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            //! Bitonic sequence must have both increasing and decreasing parts
            if (dp[i] > 1 && dp2[i] > 1) {
                maxLen = Math.max(maxLen, dp[i] + dp2[i] - 1);
            }
        }

        return maxLen;
    }
}
