package Recursion_and_backtracking;

import java.util.Scanner;

public class E {
    static String name;
    public static void Printname(int i , int n){
        if(i>n) return;
        System.out.println("Your name is "+name);
        Printname(i+1,n);
        n++;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell me your name");
        name = sc.nextLine();
        Printname(0, 4);
    }
}
 