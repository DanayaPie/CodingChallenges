package codingChallenges.Java;

public class ReverseThirtyTwoBitSignedInteger {

    // Reverse Integer: Given a 32-bit signed integer, reverse its digits.
    // If the reversed integer overflows, return 0. For example, if the input is 123, the output should be 321
    public static void main(String args[]) {

        int num = 9351;

        System.out.println(reverseInteger(num));
    }

    private static int reverseInteger(int num) {

        int reversed = 0;

        while (num != 0) {

            // extract the digis using modulus operator
            int digit = num % 10;

            // store the digit in correct digit in reverse
            reversed = reversed * 10 + digit;

            // remove last digit from num
            num /= 10;
        }

        return reversed;
    }
}
