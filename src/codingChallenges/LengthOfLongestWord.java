package codingChallenges;

public class LengthOfLongestWord {
    public static void main(String[] args) {
        String s = " traveling to Thailand was fun   ";

        System.out.println(lengthOfLongestWord(s));
    }

    private static int lengthOfLongestWord(String s) {

        int length = 0;
        int currLength = 0;

        s = s.trim();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                currLength++;
            } else {
                length = (length > currLength) ? length : currLength;
                currLength = 0;
            }
        }
        return length;
    }
}
