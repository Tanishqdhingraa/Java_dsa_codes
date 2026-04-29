package Sorting_by_recursion;
//O(n) due to recursive call stack

import java.util.Arrays;

// ever case have time complexity of 0(N*N)
public class Bubble {

    // Function to perform one full pass (move largest to end)
    static void bubblePass(int[] arr, int n, int i) {
        // Base case: one pass finished
        if (i == n - 1)
            return;

        // Swap if elements are in wrong order
        if (arr[i] > arr[i + 1]) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        // Recursive call for next pair
        bubblePass(arr, n, i + 1);
    }
    // Recursive Bubble Sort
    static void bubbleSort(int[] arr, int n) {
        // Base case: array of size 1 is already sorted
        if (n == 1)
            return;
        // Perform one full pass
        bubblePass(arr, n, 0);

        // Recursive call for remaining unsorted array
        bubbleSort(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 2, 8 };
        bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
        
    }
}

