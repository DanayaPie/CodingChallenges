package codingChallenges.Java;

public class LongestIncreasingIntSubarray {

    // Write a Java program to find the length of the longest increasing subarray within an array of integers
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 5, 6, 7};

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > arr[currentLength]) {
                currentLength += 1;
            } else {
                currentLength = 1;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        System.out.println(maxLength);
    }
}
