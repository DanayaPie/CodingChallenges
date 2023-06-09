package codingChallenges.Java;

public class BinarySearch {

    // Write a Java program to implement binary search on an array of integers
    public static void main(String[] args) {

        int[] arr = {2, 5, 7, 10, 13, 15};
        int num = 13;

        System.out.println("index: " + binarySearch(arr, num));
    }

    private static int binarySearch(int[] arr, int num) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

//            System.out.println("left: " + left);
            int mid = left + (right - left) / 2;

            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] <= num) {
                left = mid;
            } else {
                right = mid;
            }
        }

        return -1;
    }
}
