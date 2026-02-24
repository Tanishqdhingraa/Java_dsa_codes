package Heap;

//  * CHECK IF ARRAY IS K-SORTED USING MIN HEAP
//  * 
//  * A k-sorted array means:
//  * Every element is at most k positions away
//  * from its correct position in the sorted array.
//  * 
//  * Approach:
//  * 
//  * Step 1:
//  * Insert first (k+1) elements into a Min Heap.
//  * 
//  * Step 2:
//  * For each remaining element:
//  * - Remove smallest from heap and store in result.
//  * - Insert current element into heap.
//  * (Heap size always remains k+1)
//  * 
//  * Step 3:
//  * Remove remaining elements from heap.
//  * 
//  * Step 4:
//  * Compare generated sorted array with original.
//  * If same → return "Yes"
//  * Else → return "No"
//  * 
//  * Time Complexity : O(n log k)
//  * Space Complexity : O(k)
 

import java.util.*;

class SortKsortedarray {

    static String isKSortedArray(int arr[], int n, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        List<Integer> result = new ArrayList<>();

        // Step 1: Add first k+1 elements
        for (int i = 0; i < n && i <= k; i++) {
            minHeap.offer(arr[i]);
        }

        // Step 2: Process remaining elements
        for (int i = k + 1; i < n; i++) {
            result.add(minHeap.poll());
            minHeap.offer(arr[i]);
        }

        // Step 3: Remove remaining elements
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll());
        }

        // Step 4: Compare result with original array
        for (int i = 0; i < n; i++) {
            if (arr[i] != result.get(i)) {
                return "No";
            }
        }

        return "Yes";
    }
}