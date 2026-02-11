package Basic_sorting;

import java.util.Arrays;

// This means selecing a element and lacing them at right index
// find the largest element and place it at the last 
// Or vice versa for minimum 

// Complexity 
// Best case =>O(N)
// worst case =>O(N*N)
// Stability case =>Not stable 
// Best for small list 


//How it works ??
// Think of it like arranging cards in your hand:
// Find the smallest card
// Put it in the first position
// Then find the next smallest and put it in the second position
// Repeat until sorted

//O(1) (No extra array used — sorting in place)
public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Outer loop for each position in array
        for (int i = 0; i < n - 1; i++) {

            // Assume current index has the minimum element
            int minIndex = i;

            // Inner loop to find the smallest element in remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update minIndex if smaller element found
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };

        

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}
