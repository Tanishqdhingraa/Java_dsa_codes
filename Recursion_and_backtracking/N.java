package Recursion_and_backtracking;

public class N {
    // --------------------------------------------------
    // ! 3. COUNT SUBSEQUENCES WITH SUM = K
    // --------------------------------------------------
    public static int countSubsequenceSumK(int index, int[] arr, int sum, int k) {

        // BASE CASE:
        if (index == arr.length) {
            return (sum == k) ? 1 : 0;
        }

        // PICK
        int left = countSubsequenceSumK(index + 1, arr, sum + arr[index], k);

        // NOT PICK
        int right = countSubsequenceSumK(index + 1, arr, sum, k);

        // TOTAL COUNT
        return left + right;
    }
}
