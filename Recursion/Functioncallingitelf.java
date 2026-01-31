package Recursion;

public class Functioncallingitelf {
    public static void main(String[] args) {
        print(5);
    }
    /*
     * This is called Head Recursion
     * ➡ Work first
     * ➡ Then recursive call
     */
    public static void print(int n){
        //base case 
        if(n==0) return;
        //our work 
        System.out.print(n+" ");
        // remaining work will done by recursion
        //Subproblem
        print(n-1);
    }
}

