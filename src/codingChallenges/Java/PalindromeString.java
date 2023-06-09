package codingChallenges.Java;

public class PalindromeString {

    // Write a Java program to check if a given string is a palindrome
    public static void main(String[] args) {
        String s = "level";

        System.out.println(palindrome(s));
    }

    private static boolean palindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

//    private static boolean palindrome(String s) {
//
//        boolean isPalindrome = false;
//        StringBuilder reverseS = new StringBuilder();
//
//        for (int i = s.length() - 1; i >= 0; i--) {
//            reverseS.append(s.charAt(i));
//        }
//
//        if (reverseS.toString().equals(s)) {
//            isPalindrome = true;
//        }
//
//        return isPalindrome;
//    }
}
