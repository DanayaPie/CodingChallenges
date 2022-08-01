package codingChallenges.Java;

public class LargestArray {
    public static void main(String[] args) {
        int[] arr = {154, 654, 2548, 1};

        System.out.println(largestInt(arr));
    }

    public static int largestInt(int[] arr) {

        int largest = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                largest = arr[i - 1];
            } else {
                largest = arr[i];
            }
        }

        return largest;
    }
}
