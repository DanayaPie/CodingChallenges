package codingChallenges.Java;

public class SwapNumNoTrdVar {

    //Write a Java program to swap two numbers without using a third variable
    public static void main(String[] args) {

        int a = 3;
        int b = 9;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
