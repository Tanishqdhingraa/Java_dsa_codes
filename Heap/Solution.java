package Heap;
/*
!Problem Statement:Given an array arr[]and a number k.
!The array is sorted in a way that every element is at max k distance away from it sorted position
!.It means if we completely sort the array,then the index of the element can go from i-k to i+k 
!where i is index in the given array.Our task is to completely sort the array.
*/

import java.util.*;

class Main {
    // Function to sort a k-sorted array using a priority queue
    public List<Integer> sortNearlySortedArray(List<Integer> arr, int k) {
        // Create a min heap using PriorityQueue
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Store the final result
        List<Integer> result = new ArrayList<>();

        // Add first k+1 elements to the heap
        for (int i = 0; i <= k && i < arr.size(); i++) {
            minHeap.add(arr.get(i));
        }

        // Process the rest of the array
        for (int i = k + 1; i < arr.size(); i++) {
            result.add(minHeap.poll()); // remove smallest
            minHeap.add(arr.get(i)); // insert current
        }

        // Remove and add remaining elements in heap
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll());
        }

        return result;
    }
}

// Driver class
public class Solution {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(6, 5, 3, 2, 8, 10, 9);
        int k = 3;

        Main obj = new Main();
        List<Integer> sortedArr = obj.sortNearlySortedArray(arr, k);

        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }
}
