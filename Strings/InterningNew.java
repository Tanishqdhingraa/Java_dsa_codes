package Strings;

//! .equals()checks value→TRUE
//! ==checks reference→FALSE
public class InterningNew {
    public static boolean equals(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        //-------------- == --------------------------
        String s1 = "Raghav";
        String s2 = "Raghav";
        System.out.println(s1==s2); // true
        System.out.println(s1.equals(s2)); // True

        // -------------- equals --------------------------

        String s4= new String("Raghav");
        String s3 = new String("Raghav");
        System.out.println(s3.equals(s4)); // True 
        System.out.println(s3==s4); // false   
        //! Because they are two different objects in memory.

    }
}