package Linear_Search;

public class First {

    public static void main(String[] args) {
        int[] array1 = { 10, 20, 30, 40 };
        int target = 30;
        int answer = searching(array1, target);
        System.out.println("The index is " + answer);
    }

    static int searching(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int no;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                no = i;
                return no;
            }
        }
        return -1;
    }

}
