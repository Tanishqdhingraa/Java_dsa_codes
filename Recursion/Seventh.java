package Recursion;


public class Seventh {

    public static void main(String[] args) {
        int n = 1234;
        System.out.println(reverse(n, 0));
    }

    // Recursive function
    public static int reverse(int n, int rev) {
        if (n == 0)
            return rev; // base case

        int digit = n % 10; // get last digit
        rev = rev * 10 + digit; // add digit to reversed number

        return reverse(n / 10, rev); // recursive call
    }
}
