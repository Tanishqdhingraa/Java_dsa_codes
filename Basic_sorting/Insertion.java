package Basic_sorting;

import java.util.Arrays;

//!Insertition sort 

public class Insertion {

    
    static void InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            // shift elements greater than current to right
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            // place current at correct position
            arr[j + 1] = current;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 3, 5, 6 };

        InsertionSort(arr);
        System.out.println("Array is sorted now");
        System.out.println(Arrays.toString(arr));
    }
}
