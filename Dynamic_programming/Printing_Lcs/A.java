package Dynamic_programming.Printing_Lcs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class A {
    public List<String> allLCS(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        // Step 1: Build DP table
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Step 2: Backtrack to get all LCS
        Set<String> result = new HashSet<>();
        backtrack(s1, s2, n, m, dp, "", result);

        // Convert to list and sort
        List<String> ans = new ArrayList<>(result);
        Collections.sort(ans);
        return ans;
    }

    private void backtrack(String s1, String s2, int i, int j,
                           int[][] dp, String curr, Set<String> result) {

        // Base case
        if (i == 0 || j == 0) {
            result.add(new StringBuilder(curr).reverse().toString());
            return;
        }

        // If characters match
        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
            backtrack(s1, s2, i - 1, j - 1, dp,
                      curr + s1.charAt(i - 1), result);
        } else {
            // Move in direction of max
            if (dp[i - 1][j] == dp[i][j]) {
                backtrack(s1, s2, i - 1, j, dp, curr, result);
            }
            if (dp[i][j - 1] == dp[i][j]) {
                backtrack(s1, s2, i, j - 1, dp, curr, result);
            }
        }
    }
}
