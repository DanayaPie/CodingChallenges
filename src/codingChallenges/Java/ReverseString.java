package codingChallenges.Java;

public class ReverseString {

    public static void main(String[] args) {
        String s = "InfoSys";

        System.out.println(reverseString(s));
    }

    public static StringBuilder reverseString(String s) {

        StringBuilder reverse = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse.append(s.charAt(i));
        }

        return reverse;
    }
}
