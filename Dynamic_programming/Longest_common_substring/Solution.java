package Dynamic_programming.Longest_common_substring;

class Solution {
    public int longCommSubstr(String s1, String s2) {
        // code here
        int m = s1.length();
        int n = s2.length();

        // Create a table to store lengths of longest
        // common suffixes of substrings
        int[][] dp = new int[m + 1][n + 1];
        int res = 0;
 
        // Build dp[m+1][n+1] in bottom up fashion.
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    res = Math.max(res, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return res;
    }
}
