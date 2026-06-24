package Recursion_and_backtracking;

//!Print number in decreasing order 
public class B {
    public static void main(String[] args) {
        Print_decreasing_number(10);
    }

    public static void Print_decreasing_number(int n) {
        if (n == 0) return;
        Print_decreasing_number(n - 1);
        System.out.print(n + " ");
        
    }
}
