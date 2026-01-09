package Hashing;

import java.util.HashMap;

// Check if two arrays contain the same elements with same frequency
public class SameArray {

    static boolean isSame(int[] a, int[] b) {

        // If lengths are different, arrays cannot be same
        if (a.length != b.length)
            return false;

        // HashMap to store element -> frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        // First for loop: count elements of array 'a'
        for (int i = 0; i < a.length; i++) {
            int element = a[i];

            // Increase frequency of current element
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        // Second for loop: reduce counts using array 'b'
        for (int i = 0; i < b.length; i++) {
            int element = b[i];

            // If element does not exist in map, arrays are different
            if (!map.containsKey(element))
                return false;

            // Decrease frequency
            map.put(element, map.get(element) - 1);

            // If frequency becomes 0, remove from map
            if (map.get(element) == 0)
                map.remove(element);
        }

        // If map is empty, arrays are same
        return map.isEmpty();
    }

    // Main function to test the code
    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 2, 1 };
        int[] arr2 = { 2, 1, 1, 2, 3 };

        // Call the function
        boolean result = isSame(arr1, arr2);

        // Print the result
        if (result)
            System.out.println("Both arrays are the same");
        else
            System.out.println("Arrays are NOT the same");
    }
}
