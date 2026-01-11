package Hashing;

import java.util.HashMap;

public class FirstUnique {
    public static void main(String[] args) {

        String s = "aabbccde";

        // HashMap to store character -> frequency
        HashMap<Character, Integer> map = new HashMap<>();

        // First for loop: count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // get character at index i

            // Increase frequency of character
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Second for loop: find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If frequency is 1, it is the first unique character
            if (map.get(c) == 1) {
                System.out.println(c);
                break; // stop after finding first unique
            }
        } 
    }
}
