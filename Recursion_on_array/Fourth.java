
package Recursion_on_array;

// Check whether the array is sorted using recursion
public class Fourth {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        boolean result = isSorted(arr, 0);

        if (result) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is NOT sorted");
        }
    }

    static boolean isSorted(int[] arr, int index) {

        // Base case: reached last element → sorted
        if (index == arr.length - 1) {
            return true;
        }

        // If current element is greater than next → not sorted
        if (arr[index] > arr[index + 1]) {
            return false;
        }

        // Recursive call for next index
        return isSorted(arr, index + 1);
    }
}
