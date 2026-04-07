package Basic_sorting;

public class Bubble {
    // Recursive Bubble Sort
    public static void bubbleSort(int[] arr, int n) {

        // Base case: if array size is 1, it's already sorted
        if (n == 1)
            return;

        // One pass of bubble sort
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // swap
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Recursive call for remaining array
        bubbleSort(arr, n - 1);
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 4, 2 };

        bubbleSort(arr, arr.length);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
