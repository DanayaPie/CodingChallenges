package codingChallenges.Java;

public class SecLargestArray {

    // Write a Java program to find the second largest number in an array of integers
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 7, 6, 1};

        int max = arr[0];
        int secMax = arr[0];

        for (int i = 1; i < arr.length-1; i++) {

            System.out.println("arr[i]: " + arr[i]);

            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax && arr[i] < max) {
                secMax = arr[i];
            }
        }

        System.out.println(secMax);
    }
}
