package Heap;

import java.util.PriorityQueue;

public class NearlySortedArray {

    /**
     * !Sorts a k-sorted (nearly sorted) array.
     * !A k-sorted array means every element is at most k positions away
     * !from its correct sorted position.
     *
     * !Time Complexity: O(n log k)
     * ! Space Complexity: O(k)
     */
    public void sortNearlySortedArray(int[] arr, int k) {

        if (arr == null || arr.length == 0)
            return;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int insertIndex = 0;

        //! Step 1: Traverse array
        for (int element : arr) {

            //! Add element to min heap
            minHeap.offer(element);

            //! If heap size exceeds k, remove smallest and place in array
            if (minHeap.size() > k) {
                arr[insertIndex] = minHeap.poll();
                insertIndex++;
            }
        }

        //! Step 2: Empty remaining elements from heap
        while (!minHeap.isEmpty()) {
            arr[insertIndex] = minHeap.poll();
            insertIndex++;
        }
    }
}
