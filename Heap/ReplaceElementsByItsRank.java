package Heap;
/*
    REPLACE ELEMENTS BY ITS RANK USING MIN HEAP

    Idea:
    1. Insert all elements into a Min Heap.
    2. Extract elements in sorted order.
    3. Assign ranks while handling duplicates.
    4. Replace original array using rank map.

    Time Complexity  : O(n log n)
    Space Complexity : O(n)
*/

import java.util.*;

public class ReplaceElementsByItsRank {

    public static void replaceWithRank(int[] arr) {

        int n = arr.length;

        // Step 1: Create Min Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.offer(num);
        }

        // Step 2: Assign ranks
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        while (!minHeap.isEmpty()) {
            int value = minHeap.poll();

            // Avoid duplicate rank increment
            if (!rankMap.containsKey(value)) {
                rankMap.put(value, rank++);
            }
        }

        // Step 3: Replace original array values with rank
        for (int i = 0; i < n; i++) {
            arr[i] = rankMap.get(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = { 20, 15, 26, 2, 98, 6 };

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        replaceWithRank(arr);

        System.out.println("Array After Replacing With Rank:");
        System.out.println(Arrays.toString(arr));
    }
}