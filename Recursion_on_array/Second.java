package Recursion_on_array;
// check index is present in array or not 
public class Second {
    public static void main(String[] args) {
        int[] arr = { 2, 34, 35, 98 };
        int target = 34;
        // function(array,index)
        System.out.print(exists(arr, target,0));
    }

    public static boolean exists(int[] arr,int target,  int indx) {
        //base case 
        if(indx == arr.length) return false;
        // our work 
        if(arr[indx]== target) return true;
        // recursion call 
        return exists(arr, target, indx+1);

    }
}


