package DP_Lis;

import java.util.Arrays;
//! Lis in Tabulation Method 

public class C {
    static int lis(int arr[]) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int maxLen = 1;
        for(int i=1;i<n;i++){
            int max = 0;
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){ // arr[i] % arr[j] == 0
                    max = Math.max(max,dp[j]);
                }
            }
            dp[i] += max;
            maxLen = Math.max(maxLen,dp[i]);
        }
        // return dp[n-1]; // 2 3 4 5 6 1
        return maxLen;
    }
}
