package codingChallenges.Java;

import java.util.HashMap;

public class TwoSum {

    // Two Sum: Given an array of integers nums and a target value target, find two numbers in the array that add up to the target and return their indices.
    // Assume there is exactly one solution, and you may not use the same element twice.
    public static void main(String[] args) {

        int[] nums = {2, 11, 15, 9};
        int target = 20;

        int[] arr = twoSum(nums, target);

        System.out.println(arr[0] + ", " + arr[1]);
    }

    // hashMap
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int diff = target - nums[i];

            if (numsMap.containsKey(diff)) {

                return new int[]{numsMap.get(diff), i};
            }

            numsMap.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}
