package Recursion_and_backtracking;

//!Print number in increasing order 

public class A {
    public static void main(String[] args) {
        Print_increasing_number(1);
    }
    public static void Print_increasing_number(int n)
    {
        if(n==11) return;
        System.out.print(n+" ");
        Print_increasing_number(n+1);
    }
}
