package Hashing;

import java.util.HashMap;

public class HashMapBasics {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple"); // insert
        map.put(2, "Banana");
        map.put(3, "Mango");

        System.out.println(map.get(2)); // Banana (get value)

        map.remove(1); // delete key 1

        System.out.println(map.containsKey(3)); // true
        System.out.println(map.size()); // number of elements
    }
}
