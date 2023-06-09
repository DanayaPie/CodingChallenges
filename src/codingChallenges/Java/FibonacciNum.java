package codingChallenges.Java;

public class FibonacciNum {

    // Write a Java program to find the Fibonacci series up to a given number
    public static void main(String[] args) {

        int num = 10;

        int first = 0;
        int sec = 1;
        int counter = 2;
        int sum = 0;

        if (num == 1) {
            sum = 1;
        }

        while (counter <= num) {

            sum = first + sec;
            first = sec;
            sec = sum;

            counter++;
        }

        System.out.println(sum);
    }
}
