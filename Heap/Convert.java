package Heap;
import java.util.*;

public class Convert {
    public static void main(String[] args) {

        // 🔹 Max Heap using reverse order comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Add elements
        maxHeap.add(10);
        maxHeap.add(5);
        maxHeap.add(20);
        maxHeap.add(1);

        // Remove elements (largest first)
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }
    }
}
// PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);