/*
    MIN HEAP IMPLEMENTATION (Array Based)

    A Min Heap is a Complete Binary Tree where:
    -> Every parent node is smaller than or equal to its children.
    -> The smallest element is always at the root (index 0).

    Why Array?
    Because a complete binary tree can be efficiently stored in an array.

    Index Relationships:
    -> Left Child  = 2*i + 1
    -> Right Child = 2*i + 2
    -> Parent      = (i - 1) / 2

    What We Are Doing In This Class:

    1. buildTree()
       Converts a normal array into a valid Min Heap.
       We call heapify from the last non-leaf node up to the root.

    2. heapify(index)
       Maintains the Min Heap property.
       If a node is larger than its children, we swap it with
       the smallest child and continue recursively.

    3. insert(value)
       Add new element at the end.
       Then bubble it up until Min Heap property is restored.

    4. extractMin()
       Removes the root (minimum element).
       Replace root with last element.
       Reduce heap size.
       Call heapify to restore heap property.

    5. decreaseKey(index, newValue)
       Decrease value and move it upward (bubble up).

    6. increaseKey(index, newValue)
       Increase value and move it downward using heapify.

    Time Complexity:
    -> buildHeap : O(n)
    -> insert    : O(log n)
    -> extractMin: O(log n)
    -> heapify   : O(log n)

    Space Complexity:
    -> O(1) extra space (in-place array)
*/
package Heap;

public class MyMinHeap {
    int heapSize;
    int heap[];
    int capacity;

    MyMinHeap(int arr[]) {
        heap = arr;
        heapSize = arr.length;
        capacity = arr.length;
    }

    public void increaseCapacity() {
        capacity *= 2;
        int newHeap[] = new int[capacity];
        for (int i = 0; i < heapSize; i++) {
            newHeap[i] = heap[i];
        }
        heap = newHeap;
    }

    public void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // MIN HEAPIFY
    public void heapify(int index) {
        int smallest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < heapSize && heap[left] < heap[smallest]) {
            smallest = left;
        }

        if (right < heapSize && heap[right] < heap[smallest]) {
            smallest = right;
        }

        if (smallest != index) {
            swap(index, smallest);
            heapify(smallest);
        }
    }

    public void buildTree() {
        for (int i = heapSize / 2 - 1; i >= 0; i--) {
            heapify(i);
        }
    }

    public int extractMin() {
        if (heapSize == 0) {
            System.out.println("Heap is empty");
            return -1;
        }

        int min = heap[0];
        heap[0] = heap[heapSize - 1];
        heapSize--;
        heapify(0);

        return min;
    }

    public void insert(int value) {
        if (heapSize >= capacity) {
            increaseCapacity();
        }

        heap[heapSize] = value;
        heapSize++;

        int index = heapSize - 1;
        int parent = (index - 1) / 2;

        // Bubble up (MIN HEAP condition)
        while (index > 0 && heap[index] < heap[parent]) {
            swap(index, parent);
            index = parent;
            parent = (index - 1) / 2;
        }
    }

    // Decrease key (move upward)
    public void decreaseKey(int index, int newValue) {
        if (index < 0 || index >= heapSize || heap[index] <= newValue) {
            System.out.println("wrong operation");
            return;
        }

        heap[index] = newValue;
        int parent = (index - 1) / 2;

        while (index > 0 && heap[index] < heap[parent]) {
            swap(index, parent);
            index = parent;
            parent = (index - 1) / 2;
        }
    }

    // Increase key (move downward)
    public void increaseKey(int index, int newValue) {
        if (index < 0 || index >= heapSize || heap[index] >= newValue) {
            System.out.println("wrong operation");
            return;
        }

        heap[index] = newValue;
        heapify(index);
    }

    public void printTree() {
        for (int i = 0; i < heapSize; i++) {
            System.out.print(heap[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 10, 5, 20, 6, 11 };
        MyMinHeap heap = new MyMinHeap(arr);

        heap.buildTree();
        heap.printTree();

        System.out.println("Removed Min: " + heap.extractMin());
        heap.printTree();

        heap.insert(2);
        heap.printTree();
    }
}

