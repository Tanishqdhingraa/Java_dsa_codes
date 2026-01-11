package Array;

public class CountOccurrence {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 4, 2 };
        int key = 2, count = 0;

        for (int x : arr)
            if (x == key)
                count++; // count

        System.out.println("Count = " + count);
    }
}
