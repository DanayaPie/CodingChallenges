package codingChallenges.Java;

import java.util.HashMap;

public class AnagramString {

    // Write a Java program to check if two strings are anagrams of each other
    public static void main(String[] args) {

        String a = "bird";
        String b = "drib";

        Boolean isAnagram = true;
        HashMap<Character, Integer> charMap = new HashMap<>();

        if (a.length() != b.length()) {
            isAnagram = false;
        }

        for (int i = 0; i < a.length(); i++) {

            char currentChar1 = a.charAt(i);

            if (!charMap.containsKey(currentChar1)) {
                charMap.put(currentChar1, 1);
//                System.out.println("put: " + currentChar1 +" - "+ charMap.get(currentChar1));
            } else {
                charMap.put(currentChar1, (charMap.get(currentChar1) + 1));
//                System.out.println("added val: " + currentChar1 +" - "+ charMap.get(currentChar1));
            }
        }

        for (int i = 0; i < b.length(); i++) {

            char currentChar2 = b.charAt(i);

            if (!charMap.containsKey(currentChar2)) {
//                System.out.println("not anagram");
                isAnagram = false;
            } else {
                int currentCharVal = charMap.get(currentChar2);

                if (currentCharVal > 0) {
                    if (currentCharVal - 1 == 0) {
                        charMap.remove(currentChar2);
//                        System.out.println("remove key: " + currentChar2);
                    } else {
                        charMap.put(currentChar2, currentCharVal - 1);
//                        System.out.println("subtracted val: " + currentChar2 +" - "+ charMap.get(currentChar2));
                    }
                }
            }
        }

        System.out.println(isAnagram);
    }
}
