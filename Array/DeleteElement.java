package Array;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        int delete = 30;

        int[] newArr = new int[arr.length - 1];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != delete)
                newArr[j++] = arr[i]; // skip delete
        }

        for (int x : newArr)
            System.out.print(x + " ");
    }
}
