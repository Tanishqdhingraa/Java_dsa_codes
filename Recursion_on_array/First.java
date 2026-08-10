package Recursion_on_array;
// printing all the elements of array 
public class First {
    public static void main(String[] args) {
        int[] arr = { 2, 34, 35, 98};
        // function(array,index)
        print(arr,0);
    }
    public static void print(int[] arr, int index){
        int n = arr.length;
        // base case
        if(index == n) return;
        //our work 
        System.out.print(arr[index]+" ");
        //Recursion work
        print(arr, index+1);
    }
}
  