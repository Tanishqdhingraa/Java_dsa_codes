package Recursion;

public class Fith {

    public static void main(String[] args) {
        System.out.println(factorial(5)); // print result
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1; // base case
        }

        return n * factorial(n - 1); // recursive relation
    }
}

/*
 * 2ND WAY
 * public static int factorial(int n) {
 * if (n == 0) {
 * return 1; // base case
 * }
 * 
 * 
 * //recursivework
 * int ans = factorial(n - 1);
 * 
 * 
 * // our work
 * ans = n *ans; 
 * 
 * 
 * //return ans
 * return ans;
 * }
 */
