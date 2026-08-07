package DP_Lis;

import java.util.Arrays;
//! Memoization technique 
public class B {
    static int LIS(int arr[]) {
        int n = arr.length;
        int[][] dp = new int[n][n+1];
        for (int i = 0; i < n; i++) {                                                      
            Arrays.fill(dp[i], -1);
        }
        return helper(0, -1, arr,dp);
    }
    static int helper(int start, int prev, int[] arr , int[][] dp ) {

        if (start == arr.length)
            return 0;
        if(dp[start][prev+1]!=-1) return dp[start][prev+1];
        int skip = helper(start + 1, prev, arr,dp);

        if (prev != -1 && arr[start] <= arr[prev])
            return dp[start][prev+1] = skip;
        int pick = 1 + helper(start + 1, start, arr , dp);
        return dp[start][prev+1] =  Math.max(start, pick);
    }
}
