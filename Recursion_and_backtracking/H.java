package Recursion_and_backtracking;
//! Functional Recursion ->“I’ll compute and return the answer”
public class H {
        public static void main(String[] args) {
        int n = 5;
        int result = sum(n);
        System.out.println(result);
    }

    public static int sum(int n) {
        if (n == 0)
            return 0;
        return n + sum(n - 1);
    }
}
