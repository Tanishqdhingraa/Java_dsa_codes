package Bit_Manipulation;

//! Check if the i-th bit is Set or Not
public class B {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 5; // Binary: 101
        int bitIndex = 2; // Check the 2nd bit (0-based index)

        if (sol.checkIthBit(num, bitIndex)) {
            System.out.println("The " + bitIndex + "-th bit of " + num + " is set (1).");
        } else {
            System.out.println("The " + bitIndex + "-th bit of " + num + " is not set (0).");
        }
    }
}

class Solution {
    // Function to check if the i-th bit of number n is set (1)
    public boolean checkIthBit(int n, int i) {
        // Check if the i-th bit is set using bitwise AND operation
        return (n & (1 >>  i)) != 0; // If the i-th bit is 1, the result will be non-zero
    }
}