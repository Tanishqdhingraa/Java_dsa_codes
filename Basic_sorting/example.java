package Basic_sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class example {
    public static void main(String[] args) {
        int[] arr = {10 , 20 , 30, 3 , 5,  6 };

        // Bubblesort(arr);
        // System.out.println("Array is sorted now");
        // System.out.println(Arrays.toString(arr));
        Selectionsort(arr);
        System.out.println("Array is sorted now");
        System.out.println(Arrays.toString(arr));

    }
    static void  Bubblesort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 1 ; j < arr.length - i; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]= temp;
                }
            }
        }
    }
    static void Selectionsort(int[] arr){
        for(int i = 0 ; i < arr.length-1; i++){
            int minIndex = i;
            for(int j = i+1; j < arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
