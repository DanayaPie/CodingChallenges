package codingChallenges;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class DuplicateCharInString {

    public static void main(String[] args) {
        String s = "ButterflySwords";

        duplicateChar(s);
    }

    public static void duplicateChar(String s) {

        s = s.toLowerCase();

        HashMap<Character, Integer> charMap = new HashMap();

        for (int i = 0; i < s.length(); i++) {
            if (charMap.containsKey(s.charAt(i))) {
                charMap.put(s.charAt(i), charMap.get(s.charAt(i)) + 1);
            } else {
                charMap.put(s.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> charEntry : charMap.entrySet()) {
            System.out.println(charEntry.getKey() + ": " + charEntry.getValue());
        }
    }
}
