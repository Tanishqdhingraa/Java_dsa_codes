package Recursion;

public class Ninth {
    // Gcd of 2 numbers
    static int gcd(int a, int b) {
        // Find Minimum of a and b
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }

        // Return gcd of a and b
        return result;
    }

    public static void main(String[] args) {
        int a = 20, b = 28;
        System.out.print(gcd(a, b));
    }
}
//by recursion 
// static int gcd(int a, int b) {
//     if (b == 0) return a;     // base case
//     return gcd(b, a % b);     // recursive call
// }
