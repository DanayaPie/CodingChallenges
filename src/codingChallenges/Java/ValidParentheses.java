package codingChallenges.Java;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        String s = "(){[]}";

        System.out.println(isValidParentheses(s));

    }

    private static boolean isValidParentheses(String s) {

        Stack<Character> stackParentheses = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                stackParentheses.push(')');
            } else if (s.charAt(i) == '[') {
                stackParentheses.push(']');
            } else if (s.charAt(i) == '{') {
                stackParentheses.push('}');
            } else if (s.charAt(i) == '<') {
                stackParentheses.push('>');
            } else if (s == null || s.charAt(i) != stackParentheses.pop()) {
                return false;
            }
        }

        return true;
    }
}
