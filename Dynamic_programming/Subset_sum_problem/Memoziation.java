package Dynamic_programming.Subset_sum_problem;

import java.util.Arrays;

public class Memoziation {
    // Recursive function to check if a subset
    // with the given sum exists
    static boolean isSubsetSumRec(int[] arr, int n, int sum,
                                  int[][] memo) {

        // If the sum is zero, we found a subset
        if (sum == 0) {
            return true;
        }

        // If no elements are left
        if (n <= 0) {
            return false;
        }

        // If the value is already computed, return it
        if (memo[n][sum] != -1) {
            return memo[n][sum] == 1;
        }

        // If the last element is greater than the sum,
        // ignore it
        if (arr[n - 1] > sum) {
            memo[n][sum] = isSubsetSumRec(arr, n - 1, sum, memo) 
              		 	? 1 : 0;
        }
        else {

            // Include or exclude the last element directly
            memo[n][sum] = (isSubsetSumRec(arr, n - 1, sum, memo)
					|| isSubsetSumRec(arr, n - 1, sum - arr[n - 1], memo))
                      ? 1 : 0;
        }

        return memo[n][sum] == 1;
    }

    // Function to initiate the subset sum check
    static boolean isSubsetSum(int[] arr, int sum) {
        int n = arr.length;
        int[][] memo = new int[n + 1][sum + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return isSubsetSumRec(arr, n, sum, memo);
    }

    public static void main(String[] args) {
      
        int[] arr = { 1, 5, 3, 7, 4 };
        int sum = 12;

        if (isSubsetSum(arr, sum)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
