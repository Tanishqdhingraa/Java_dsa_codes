package Bit_Manipulation;

public class Four {


    // Function to set the rightmost unset bit
    static int setBit(int n) {
        return n | (n + 1);
    }

    public static void main(String[] args) {
        int n = 10;

        int result = setBit(n);

        System.out.println("Original number: " + n);
        System.out.println("After setting rightmost unset bit: " + result);
    }
}
