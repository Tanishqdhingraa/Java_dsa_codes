package Recursion_and_backtracking;

public class I{
    public static void main(String[] args) {
        System.out.println(factorialofanumber(3));
    }
    static int factorialofanumber(int n){
        if(n==1) return 1;
        return n* factorialofanumber(n-1);
    }
}
