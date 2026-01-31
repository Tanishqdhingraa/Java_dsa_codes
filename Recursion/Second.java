package Recursion;

public class Second {
    public static void main(String[] args) {
        print(10);
    }
    // This is called Tail Recursion style 
    // printing (work happens after recursion).
    // Base case -> call -> our work = Tail recursion 

    public static void print(int n) {
        // base case
        if (n == 0)
            return;


        // Subproblem work will done by recursion
        print(n - 1);//call

        // our work
        System.out.print(n + " ");//work
    }
}
