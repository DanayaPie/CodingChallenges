package codingChallenges.Java;

import java.util.HashMap;

public class TwoSum {

    // Two Sum: Given an array of integers nums and a target value target, find two numbers in the array that add up to the target and return their indices.
    // Assume there is exactly one solution, and you may not use the same element twice.
    public static void main(String[] args) {

        int[] nums = {2, 9, 11, 15};
        int target = 20;

        System.out.println("first index: " + twoSum(nums, target)[0] + ", second index: " + twoSum(nums, target)[1]);
    }

    private static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int diff = target - nums[i];

            if (!numMap.containsKey(diff)) {
                numMap.put(nums[i], i);

            } else {
                return new int[] {numMap.get(diff), i};
            }
        }

        return new int[] {-1, -1};
    }
}
