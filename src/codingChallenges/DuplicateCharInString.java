package syntax;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharInString {

    public static void main(String[] args) {
        String s = "ButterflySwords";

        duplicateChar(s);
    }

    public static void duplicateChar(String s) {

        String s1 = s.toLowerCase();

        HashMap<Character, Integer> charMap = new HashMap();

        for (int i = 0; i < s1.length(); i++) {
            if (charMap.containsKey(s1.charAt(i))) {
                charMap.put(s1.charAt(i), charMap.get(s1.charAt(i)) + 1);
            } else {
                charMap.put(s1.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> charEntry : charMap.entrySet()) {
            System.out.println(charEntry.getKey() + ": " + charEntry.getValue());
        }
    }
}
