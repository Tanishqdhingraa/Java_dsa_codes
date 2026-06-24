package Recursion_and_backtracking;
//! Factorial of a number 
public class C {
    public static void main(String[] args) {
        System.out.println(Factorialnumber(4));
    }
    static int Factorialnumber(int n){
        if(n==1) return 1;
        return n*Factorialnumber(n-1);
        
    }
}
 