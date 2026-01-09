package Hashing;

import java.util.HashMap;

public class FrequencyCount {
    public static void main(String[] args) {

        int[] arr = { 1, 1, 2, 2, 2, 3, 4, 4, 5 };

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map); // {1=2, 2=3, 3=1, 4=2, 5=1}
    }
}
