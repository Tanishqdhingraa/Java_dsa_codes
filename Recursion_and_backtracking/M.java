package Recursion_and_backtracking;

import java.util.List;

public class M {
    // --------------------------------------------------
    //! 2. PRINT SUBSEQUENCES WITH SUM = K
    // --------------------------------------------------
    public static void  subsequenceSumK(int index, int[] arr,
         List<Integer> current, int sum, int k) {

        // BASE CASE:
        if (index == arr.length) {
            if (sum == k) {
                System.out.println(current);
            }
            return;
        }

        // PICK
        current.add(arr[index]);
        subsequenceSumK(index + 1, arr, current, sum + arr[index], k);

        // BACKTRACK
        current.remove(current.size() - 1);

        // NOT PICK
        subsequenceSumK(index + 1, arr, current, sum, k);
    }
}
