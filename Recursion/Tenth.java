package Recursion;

// import java.util.Scanner;

public class Tenth {

    public static int fibonacci(int n) {
        // Base cases: The first two numbers in the sequence are 0 and 1.
        if (n <= 1) {
            return n;
        }
        // Recursive case: The current number is the sum of the two preceding ones.
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10; // The number of terms to print
        System.out.println("Fibonacci series up to " + n + " terms:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}