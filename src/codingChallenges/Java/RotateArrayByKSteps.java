package codingChallenges.Java;

public class RotateArrayByKSteps {

    // Given an integer array nums, rotate the array to the right by k steps, where k is non-negative
    // For example, given the array [1, 2, 3, 4, 5] and K = 2, the resulting array would be [4, 5, 1, 2, 3].
    /*
        Input: nums = [1,2,3,4,5,6,7], k = 3
        Output: [5,6,7,1,2,3,4]
        Explanation:
            rotate 1 steps to the right: [7,1,2,3,4,5,6]
            rotate 2 steps to the right: [6,7,1,2,3,4,5]
            rotate 3 steps to the right: [5,6,7,1,2,3,4]
     */
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        arr = rotateRight(arr, k);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int[] rotateRight(int[] arr, int k) {

        // calculate the effective number of rotations
        // rotate the array by its length is equivalent to the original array --> reduce the num of rotations by taking the modulus
        k = k % arr.length;

        reverse(arr, 0, arr.length - 1); // reverse the whole list
        reverse(arr, 0, k - 1); // reverse k element
        reverse(arr, k, arr.length-1); // reverse remaining elements

        return arr;
    }

    private static void reverse(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
