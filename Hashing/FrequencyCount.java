package Hashing;

import java.util.HashMap;

public class FrequencyCount {
    public static void main(String[] args) {

        int[] arr = { 1, 1, 2, 2, 2, 3, 4, 4, 5 };

        // HashMap to store number -> frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        // Use normal for loop to traverse array
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i]; // get current element

            // Increase frequency of this number
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Print the frequency map
        System.out.println(map); // {1=2, 2=3, 3=1, 4=2, 5=1}
    }
}
