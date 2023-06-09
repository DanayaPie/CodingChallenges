package codingChallenges.Java;

public class IsPrime {

    // Write a Java program to check if a given number is prime or not
    public static void main(String[] args) {

        int num = 25;
        boolean isPrime = true;

        if (num <= 0) {
            isPrime = false;
        } else {

            for (int i = 2; i <= Math.sqrt(num); i++) {

//                System.out.println("here");
                if (num % i == 0) {
//                    System.out.println("num % i");
                    isPrime = false;
                }
            }
        }

        System.out.println(isPrime);
    }
}
