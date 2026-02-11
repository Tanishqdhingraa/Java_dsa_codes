package Basic_sorting;

import java.util.Arrays;
// Bubble sort is comparing sort method
// In every step compare your adjacent value 

// What are we doing ? 
// compare 2 adjacent elemnts whhich one is greater make,
// it to right and move comparision to right also..

// Why we are doinng ? 
// At every iteration/cycle the largest element will come 
// to the end of the array 
//1st pass -> 1st largest come at the end
//2nd pass -> 2nd largest come at the end
//3rd pass -> 3rd largest come at the end

// This is also known as syncing sort and exchanging sort 

// After every cycle we weill not compare the last elements 
// because they are sorted now. 


//Time Complexity and space complexity 
// Space  complexity is O(1) constant beacuse these are inplace
// sorting algorithhums  
// Worst case : O(N*N)
// Best case : O(N)
//Best case: O(1)  No swap is found already sorted 
// N you can say is like a number of elements 

// The bubble sort is Stable sorting becoz original order is maintianed
public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {9,464, 277 , 76, 98, 294 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        // run it for steps n-1 times
        for(int i = 0; i < arr.length; i++){
           // for every step  max item will come at the last
           // respective index  
           for(int j =1; j < arr.length - i; j++){// we left last one because it is already sorted 
            // swap if the item is smaller than previous one 
            if(arr[j]<arr[j-1]){
                //basic swapping 
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1]=temp;
            }
           }
        }
    }
}
