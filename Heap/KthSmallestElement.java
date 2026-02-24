package Heap;
//! Keeping only the k smallest elements in a max heap and removing larger ones.  
//! The root of heap becomes the kth smallest.
public class KthSmallestElement {
    public static int kthSmallest(int[] arr, int k) {
        // maxheap
        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>(java.util.Collections.reverseOrder());

        for (int ele : arr) { // n
            pq.add(ele); // logk
            if (pq.size() > k) // logk
                pq.remove();
        }
        return pq.peek();

        // TC = O(n log k)
        // AS = O(k)
    }

    // MAIN FUNCTION
    public static void main(String[] args) {
        int[] arr = { 7, 10, 4, 3, 20, 15 };
        int k = 6;

        int result = kthSmallest(arr, k);
        System.out.println("Kth Smallest Element is: " + result);
    }
}
//!Intution is we are removing all elements which is greater than we have 
//! all the Kth smallest we get 