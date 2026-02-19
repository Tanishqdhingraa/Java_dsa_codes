package Basic_sorting;

public class Linear {

    // Linear Search Function
    public static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            // If element found
            if (arr[i] == target) {
                return i; // return index
            }
        }

        return -1; // Not found
    }

    // Main method to test
    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50 };
        int target = 30;

        int result = linearSearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
