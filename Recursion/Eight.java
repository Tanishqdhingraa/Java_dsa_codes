package Recursion;

public class Eight {
    public static int findsum(int n){
        if(n ==1) return 1;
        return n + findsum(n-1);
    }
    public static void main(String[] args) {
        int ans = findsum(4);
        System.out.println(ans);
    }
}
