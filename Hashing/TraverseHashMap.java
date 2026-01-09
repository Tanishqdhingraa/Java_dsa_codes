package Hashing;

import java.util.HashMap;

public class TraverseHashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);

        // Traverse using keySet()
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // Traverse using entrySet() (best way)
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
