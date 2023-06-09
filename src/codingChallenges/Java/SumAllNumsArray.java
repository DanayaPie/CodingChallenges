package codingChallenges.Java;

public class SumAllNumsArray {

    // Write a Java program to find the sum of all even numbers in an array of integers
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 6, 1};
        int sum = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
