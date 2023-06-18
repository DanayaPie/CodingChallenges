package codingChallenges.Java;

import java.util.*;

public class ValidParentheses {

    public static void main(String[] args) {

        String str = "{([)]}";

        System.out.println(isValidParentheses(str));
    }

    private static boolean isValidParentheses(String str) {

        if (str.length() % 2 != 0 || str == null) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        Map<Character, Character> parenthesesMap = new HashMap<>();
        parenthesesMap.put('{', '}');
        parenthesesMap.put('[', ']');
        parenthesesMap.put('(', ')');

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (parenthesesMap.containsKey(c)) {
                stack.push(parenthesesMap.get(c));

            } else if (stack.isEmpty() || c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}