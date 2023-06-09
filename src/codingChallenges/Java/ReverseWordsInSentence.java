package codingChallenges.Java;

import java.util.Stack;

public class ReverseWordsInSentence {

    // Write a Java program to reverse the order of words in a sentence
    public static void main(String[] args) {
        String s = "I love Me";

        System.out.println(reverseSentence(s));

    }

    private static StringBuilder reverseSentence(String s) {

        String[] sArr = s.split(" " );
        StringBuilder reverseSentence = new StringBuilder();

        for (int i = sArr.length - 1; i >= 0; i--) {
            reverseSentence.append(sArr[i]);

            if (i != 0) {
                reverseSentence.append(" ");
            }
        }

        return reverseSentence;
    }
}
