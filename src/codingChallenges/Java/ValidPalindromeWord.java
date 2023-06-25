package codingChallenges.Java;

import java.util.Locale;

public class ValidPalindromeWord {

    public static void main(String[] args) {

        String str = "banana";

        System.out.println(isValidPalindromeWord(str));
    }

    private static boolean isValidPalindromeWord(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.toLowerCase().charAt(left) != str.toLowerCase().charAt(right)) {

                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
