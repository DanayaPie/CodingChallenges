package codingChallenges.Java;

import java.util.Locale;

public class ValidPalindromeSentence {

    // Validate Palindrome: Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases
    public static void main(String[] args) {

        String str = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {

        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(Locale.ROOT);

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
