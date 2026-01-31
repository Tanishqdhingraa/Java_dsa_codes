package Recursion;

import java.util.Scanner;

public class Fourth {

    public static void increaseanddecrease(int n) {
        // base case
        if (n == 1){
            System.out.print(1+" ");
            return;
        }
        // Going down in recursion print statement 
        System.out.print(n + " "); // decreasing part
        //Recursion call
        increaseanddecrease(n - 1); // recursive call
        // coming up in recursion print statement
        System.out.print(n + " "); // increasing part
    }

    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();

        System.out.println("Your answer is:");
        increaseanddecrease(n);
    }
}
