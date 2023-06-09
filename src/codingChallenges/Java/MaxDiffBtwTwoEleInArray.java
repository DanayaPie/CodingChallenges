package codingChallenges.Java;

public class MaxDiffBtwTwoEleInArray {

    // Write a Java program to find the maximum difference between two elements in an array where the larger element appears after the smaller element
    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 7, 3, 9, 5};

        System.out.println(maxDiff(arr));
    }

    private static int maxDiff(int[] arr) {

        int maxDiff = arr[1] - arr[0];
        int minElement = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] - minElement > maxDiff) {
                maxDiff = arr[i] - minElement;
            }

            if (arr[i] < minElement) {
                minElement = arr[i];
            }
        }

        return maxDiff;
    }
}
