package Recursion_on_array;
// linear search by recursion 
public class Third {
    public static void main(String[] args) {
        int[] arr = {10 , 20 ,30 };
        System.out.println(Linearsearch(arr,133, 0));
    }
    static boolean Linearsearch(int[] arr ,int target, int index){{
        if(index == arr.length){
            return false;
        }
        return arr[index] == target ||Linearsearch(arr, target, index+1);
    }}
}
