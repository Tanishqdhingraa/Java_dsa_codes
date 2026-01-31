package Recursion;

import java.util.Scanner;

// pow(2,4) = 2 * pow(2,3)
// pow(2,3) = 2 * pow(2,2)
// pow(2,2) = 2 * pow(2,1)
// pow(2,1) = 2 * pow(2,0)
// pow(2,0) = 1

// a raised to the power b
public class Sixth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (a): ");
        int a = sc.nextInt();

        System.out.print("Enter power (b): ");
        int b = sc.nextInt();

        int result = pow(a, b);
        System.out.println("Answer is: " + result);

        sc.close();
    }

    public static int pow(int a, int b) {
        if (b == 0)
            return 1; // base case
        //recurreence expression 
        int ans = pow(a, b - 1); // recursive call
        return a * ans; // multiply while returning
    }
}
