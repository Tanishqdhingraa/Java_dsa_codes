package Bit_Manipulation;
//!  Check if a Number is Odd or Not
public class Three {


    public static boolean isOdd(int n) {
        return (n & 1) == 1; // Bitwise AND check
    }

    public static void main(String[] args) {
        int num = 8;

        if (isOdd(num)) {
            System.out.println(num + " is odd");
        } else {
            System.out.println(num + " is even");
        }
    }
}
