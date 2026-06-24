package Recursion_and_backtracking;

public class F {
    public static void main(String[] args) {
        Printnumber(5);
    }
    static void Printnumber(int n){
        if (n==0) {
            return;
        }
        Printnumber(n - 1);
        System.out.println(n);
        
    }
}
