package Sorting_by_recursion;

import java.util.Arrays;

// selectionSort(arr,start,n):
// if start>=n-1:
// return
// minIndex=index of smallest element from start to n-1 
// swap arr[start]and arr[minIndex]

// selectionSort(arr,start+1,n)

public class RecursiveSelectionSort {

    static void selectionSort(int[] arr, int start, int n) {
        // Base case: If only one element left, array is sorted
        if (start >= n - 1)
            return;

        // Find index of minimum element in remaining array
        int minIndex = start;
        for (int i = start + 1; i < n; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        // Swap the found minimum element with first element
        int temp = arr[minIndex];
        arr[minIndex] = arr[start];
        arr[start] = temp;

        // Recursively sort the remaining array
        selectionSort(arr, start + 1, n);
    }

    public static void main(String[] args) {
        int[] arr = { 29, 10, 14, 37, 13 };

        

        selectionSort(arr, 0, arr.length);
        
        System.out.println(Arrays.toString(arr));

    }
}
