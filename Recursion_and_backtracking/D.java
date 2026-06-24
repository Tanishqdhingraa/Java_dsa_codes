package Recursion_and_backtracking;

public class D {
    public static void main(String[] args) {
        System.out.println(A_raise_to_power_b(2, 3));
    }

    public static int A_raise_to_power_b(int a, int b) {
        if (b == 0)
            return 1;

        int half = A_raise_to_power_b(a, b / 2);

        if (b % 2 == 0) {
            return half * half;
        } else {
            return a * half * half;
        }
    }
}