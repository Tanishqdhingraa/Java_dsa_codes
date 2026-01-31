package Recursion;

import java.util.Scanner;

public class Third {
        //Global variable 
       static int n;
       public static void main(String[] args) {
        System.out.println("Enter you number ");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        System.out.println("Your answer is  ");
        print(1);
       }
       public static void print(int x){
        //base condition
        if( x > n) return; 
        //our work 
        System.out.print(x+" ");
        //done by recursion
        print(x+1);
       }
}
