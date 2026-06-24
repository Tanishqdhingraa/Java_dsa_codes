package Recursion_and_backtracking;
//! ParameterizedRecursion → “I carry the answer with me”
public class G {
    public static void main(String[] args) {
        int n = 5;
        sum(n, 0);
    }

    public static void sum(int n, int currentSum) {
        if (n == 0) {
            System.out.println(currentSum);
            return;
        }
        sum(n - 1, currentSum + n);
    }
}
