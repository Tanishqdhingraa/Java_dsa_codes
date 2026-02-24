package Heap;

import java.util.PriorityQueue;

public class KthLagestelement {

    //! Function to return kth largest element from an array.
    public static int KthLargest(int arr[], int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // Min Heap

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
        int k = 3;

        int result = KthLargest(arr, k);

        System.out.println("Kth Largest Element is: " + result);
    }
}
