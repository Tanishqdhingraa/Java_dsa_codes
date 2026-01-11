package ArrayandArraylist;

/*
ARRAY vs ARRAYLIST

Array:
- Fixed size
- Can store only same data type
- Faster
- Uses [] syntax

ArrayList:
- Dynamic size
- Stores objects
- Slower than array
- Uses methods like add(), remove()
*/

import java.util.ArrayList;

public class ArrayVsArrayList {
    public static void main(String[] args) {

        // Array example
        int[] arr = new int[3];     // fixed size
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        // ArrayList example
        ArrayList<Integer> list = new ArrayList<>(); // dynamic size
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40); // can grow

        // Print array
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        // Print ArrayList
        System.out.print("ArrayList: ");
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
    }
}
