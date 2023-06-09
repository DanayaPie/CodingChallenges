package codingChallenges.Java;

public class ReverseStringRecursion {

    // Write a Java program to reverse a string using recursion
    public static void main(String[] args) {

        String s = "Hello";

        String reverse = reverse(s);
        System.out.println(reverse);
    }

    private static String reverse(String s) {

        if (s == null || s.length() <= 1) {
            return s;
        }

//        System.out.println("s.substring(1): " + s.substring(1));
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
