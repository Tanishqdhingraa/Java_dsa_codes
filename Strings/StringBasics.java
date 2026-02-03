package Strings;

public class StringBasics {
    public static void main(String[] args) {

        // ===== STRING OPERATIONS =====
        String s = "Hello World";

        System.out.println("Length: " + s.length()); // length
        System.out.println("Char at 1: " + s.charAt(1)); // get character
        System.out.println("Substring (0,5): " + s.substring(0, 5)); // substring
        System.out.println("Contains 'World': " + s.contains("World")); // check word
        System.out.println("Index of 'o': " + s.indexOf('o')); // first occurrence
        System.out.println("To Upper: " + s.toUpperCase()); // uppercase
        System.out.println("To Lower: " + s.toLowerCase()); // lowercase
        System.out.println("Replace: " + s.replace("World", "Java")); // replace
        System.out.println("Trim: " + "  hi  ".trim()); // remove spaces
        System.out.println("Equals: " + s.equals("Hello World")); // compare

        // Convert to char array
        char[] arr = s.toCharArray();
        System.out.println("Char array length: " + arr.length);

        // ===== STRINGBUILDER OPERATIONS =====
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" Java"); // add text
        sb.insert(5, " Beautiful"); // insert at index
        sb.delete(5, 15); // delete range
        sb.replace(6, 10, "World"); // replace range
        sb.reverse(); // reverse string

        System.out.println("StringBuilder result: " + sb);

        // // Convert back to String
        String finalStr = sb.toString();
        System.out.println("Final String: " + finalStr);
    }
}
