package codingChallenges.Java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringNoRepeat {

    // Find the Longest Substring Without Repeating Characters: Given a string, find the length of the longest substring without repeating characters.
    // For example, given the input "abcabcbb", the output should be 3 (which is "abc").
    public static void main(String[] args) {

        String s = "pwwkeaw";

        System.out.println(longestNoRepeatStr(s));
    }

    private static int longestNoRepeatStr(String s) {

        HashMap<Character, Integer> charMap = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        int right = 0;

        while (right < s.length()) {

            Character currentChar = s.charAt(right);

            if (charMap.containsKey(currentChar)) {

                left = Math.max(left, charMap.get(currentChar) + 1);
            }

            charMap.put(currentChar, right);
            maxLength = (right - left) + 1;
            right++;

            System.out.println("maxLength: " + maxLength);
        }

        return maxLength;
    }
}
