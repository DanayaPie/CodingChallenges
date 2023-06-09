package codingChallenges.Java;

public class MaxSum {

    // Write a Java program to find the maximum sum of a contiguous subarray within an array of integers
    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSum(nums));
    }

    private static int maxSum(int[] nums) {

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (currentSum + nums[i] > nums[i]) {
                currentSum += nums[i];
            } else {
                currentSum = nums[i];
            }

            if (maxSum < currentSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

//    private static int maxSum(int[] nums) {
//
//        int maxSum = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            int currentSum = 0;
//
//            for (int j = i; j < nums.length; j++) {
//
//                currentSum += nums[j];
//
//                if (maxSum < currentSum) {
//                    maxSum = currentSum;
//                }
//            }
//        }
//
//        return maxSum;
//    }
}
