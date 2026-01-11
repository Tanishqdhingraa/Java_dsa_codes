package Array;

public class InsertEnd {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30 };
        int newVal = 40;

        int[] newArr = new int[arr.length + 1]; // new array

        for (int i = 0; i < arr.length; i++)
            newArr[i] = arr[i]; // copy

        newArr[arr.length] = newVal; // insert at end

        for (int x : newArr)
            System.out.print(x + " ");
    }
}
