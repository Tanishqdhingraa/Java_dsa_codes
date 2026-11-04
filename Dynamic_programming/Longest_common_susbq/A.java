class A {

    public static int lcs(String s1, String s2, int i, int j) {
        // Base case: if any string is finished
        if (i == 0 || j == 0) return 0;

        // If last characters match
        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
            return 1 + lcs(s1, s2, i - 1, j - 1);
        } 
        // If not match
        else {
            return Math.max(
                lcs(s1, s2, i - 1, j),   // skip from s1
                lcs(s1, s2, i, j - 1)    // skip from s2
            );
        }
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";

        int n = s1.length();
        int m = s2.length();

        System.out.println(lcs(s1, s2, n, m));
    }
}