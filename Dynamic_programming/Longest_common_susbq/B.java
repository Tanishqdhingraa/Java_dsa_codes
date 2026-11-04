public class B {
  
    public int lcs(String s1, String s2, int i, int j, int[][] dp) {
        // Base case
        if (i == 0 || j == 0)
            return 0;

        // If already computed
        if (dp[i][j] != -1)
            return dp[i][j];

        // Match case
        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
            return dp[i][j] = 1 + lcs(s1, s2, i - 1, j - 1, dp);
        }
        // Not match
        else {
            return dp[i][j] = Math.max(
                    lcs(s1, s2, i - 1, j, dp),
                    lcs(s1, s2, i, j - 1, dp));
        }
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n + 1][m + 1];

        // initialize with -1
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = -1;
            }
        }

        return lcs(text1, text2, n, m, dp);
    }  
}
