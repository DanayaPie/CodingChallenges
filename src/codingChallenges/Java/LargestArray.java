package codingChallenges.Java;

public class LargestArray {

    // Write a Java program to find the largest number in an array of integers
    public static void main(String[] args) {
        int[] arr = {154, 654, 2548, 1};

        System.out.println(largestInt(arr));
    }

    public static int largestInt(int[] arr) {

        int maxInt = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > maxInt){
                maxInt = arr[i];
            }
        }

        return maxInt;
    }
}