package codingChallenges.Java;

public class FactorialOfNum {

    // Write a Java program to calculate the factorial of a given number
    public static void main(String[] args) {

        int num = 5;

        System.out.println(factorial(num));
    }

    public static int factorial(int num) {

        int res = num;
        int counter = num;

        if (num > 1) {
            counter = counter - 1;
        } else {
            return num;
        }

        while (counter > 0) {
//            System.out.println("counter: " + counter);
            res = res * counter;
            counter--;
        }

        return res;
    }
}
