package DP_Lis;
//! Basic Recursion approach 
public class A {
    static int LIS(int arr[]){
        return helper(0,-1,arr);
    }
    static int helper(int start , int prev , int[] arr){

        if(start == arr.length) return 0;
        //! Skiping the element
        int skip = helper(start+1, prev, arr);
        //!Checking 2 things first indexes and than previous < next one.

        if(prev != -1 && arr[start]<=arr[prev]) return skip;
        //! Picking the element 
        int pick = 1+helper(start+1, start, arr);
        return Math.max(start, pick);
    }
}
