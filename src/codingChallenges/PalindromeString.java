package codingChallenges;

public class PalindromeString {

    public static void main(String[] args) {
        String s = "level";

        System.out.println(palindrome(s));
    }

    private static boolean palindrome(String s) {

        Boolean palindrome = false;
        StringBuilder reverse = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse.append(s.charAt(i));
        }

        if (s.equals(reverse.toString())) {
            palindrome = true;
        }

        return palindrome;
    }


}
