package codingChallenges.Java;

public class RemainderCalculator {

    // Given two positive integers numerator and denominator, calculate the remainder when numerator is divided by denominator,
    // without using the modulus operator (%)

    public static void main(String[] args) {

        int numerator = 9351;
        int denominator = 300;

        System.out.println(calculateRemainder(numerator, denominator));
    }

    private static int calculateRemainder(int numerator, int denominator) {

        while (numerator >= denominator) {

            numerator -= denominator;
        }

        return numerator;
    }
}
