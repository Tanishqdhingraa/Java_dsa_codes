package Multidimension_ArrayLists;

import java.util.ArrayList;

public class B {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(100);
        a1.add(210);
        a1.add(130);

        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(5);
        a2.add(63);

        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(1000);

        arr.add(a1);
        arr.add(a2);
        arr.add(a1);
        arr.add(a3);

        for (int i = 0; i < arr.size(); i++) {
            for (int index = 0; index < arr.get(i).size(); index++) {
                System.out.print(arr.get(i).get(index)+" ");
            }
            System.out.println();
        }

        
    }
}
