package Basic_sorting;

public class RecInsertion {
    // Recursive Insertion Sort
    public static void insertionSort(int[] arr, int n) {
        // Base Case: If array has only one element
        if (n <= 1) {
            return;
        }

        // Sort first n-1 elements
        insertionSort(arr, n - 1);

        // Insert last element at correct position
        int last = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = last;
    }

    // Main function
    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 1, 2 };

        insertionSort(arr, arr.length);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
