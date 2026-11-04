package Dynamic_programming.Subset_sum_problem;

/*
! APPROACH (PICK / NOT PICK - TABULATION):

1. dp[i][j] = true → using first i elements, we can form sum j

2. Base Case:
   - dp[i][0] = true (sum 0 always possible)
   - dp[0][j] = false (no elements → can't form positive sum)

3. Transition:
   - NOT PICK → dp[i-1][j]
   - PICK → dp[i-1][j - arr[i-1]] (if arr[i-1] <= j)

   dp[i][j] = pick OR notPick

4. Answer → dp[n][sum]
*/

public class Tabulation {

    static boolean isSubsetSum(int[] arr, int sum) {

        int n = arr.length;

        boolean[][] dp = new boolean[n + 1][sum + 1];

        //! Base case: sum = 0
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // Fill DP table
        for (int i = 1; i <= n; i++) {

            int current = arr[i - 1];

            for (int j = 1; j <= sum; j++) {
                
                //! NOT PICK
                boolean notPick = dp[i - 1][j];

                //! PICK
                boolean pick = false;
                if (current <= j) {
                    pick = dp[i - 1][j - current];
                }

                // Final decision
                dp[i][j] = pick || notPick;
            }
        }

        return dp[n][sum];
    }

    public static void main(String[] args) {

        int[] arr = { 3, 34, 4, 12, 5, 2 };
        int sum = 9;

        System.out.println(isSubsetSum(arr, sum) ? "True" : "False");
    }
}