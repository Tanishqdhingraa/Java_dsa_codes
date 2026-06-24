package Recursion_and_backtracking;

// SUBSEQUENCE (PICK / NOT PICK) - FULL TEMPLATE WITH NOTES

import java.util.*;

public class L {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };

        System.out.println("All Subsequences:");
        subsequence(0, arr, new ArrayList<>());

      
    }

    // --------------------------------------------------
    //! 1. PRINT ALL SUBSEQUENCES
    // --------------------------------------------------
    public static void subsequence(int index, int[] arr, List<Integer> current) {

        // BASE CASE:
        // When we reach end of array, print current subsequence
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // -------------------------
        // PICK ELEMENT
        // -------------------------
        current.add(arr[index]);

        // Move to next index
        subsequence(index + 1, arr, current);

        // BACKTRACK (UNDO PICK)
        current.remove(current.size() - 1);

        // -------------------------
        // NOT PICK ELEMENT
        // -------------------------
        subsequence(index + 1, arr, current);
    }

    
    
        
    
}

/*
 * ==================================================
 * NOTES (IMPORTANT FOR INTERVIEWS)
 * ==================================================
 * 
 * 1. CORE IDEA:
 * - At each index, we have 2 choices:
 * → PICK the element
 * → NOT PICK the element
 * 
 * 2. RECURSION TREE:
 * - Binary tree (2 branches at each level)
 * - Total subsequences = 2^n
 * 
 * 3. BACKTRACKING:
 * - Required ONLY after PICK
 * - Why? Because we modify the list (state)
 * - NOT PICK does not change state → no undo needed
 * 
 * 4. BASE CASE:
 * - index == arr.length
 * - This means we formed one subsequence
 * 
 * 5. TIME COMPLEXITY:
 * - O(2^n) → every element has 2 choices
 * 
 * 6. SPACE COMPLEXITY:
 * - O(n) → recursion stack depth
 * 
 * 7. VARIATIONS:
 * - Print all subsequences
 * - Print subsequences with sum = K
 * - Count subsequences with sum = K
 * - Print any one subsequence (early return optimization)
 * 
 * 8. IMPORTANT INTERVIEW TIP:
 * - Always think in terms of:
 * → Choices (Pick / Not Pick)
 * → Base case
 * → Backtracking (undo)
 * 
 * ==================================================
 */
