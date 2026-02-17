package Strings;

public class CompareToStringMethod {
    public static int compareTo(String a, String b) {

        return -1;
    }

    public static void main(String[] args) {
        String a = "gitanjali  ";
        String b = "priya";

        //! Below both function give same results
        // a = a.concat(b);
        // a = a + b;
        // System.out.println(a);


        // ! THis will give -1 if not identical 
        System.out.println(compareTo(a,b));
    }
}
