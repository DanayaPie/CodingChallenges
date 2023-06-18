package codingChallenges.Java;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {

        int[] nums = {4, 5, 2, 25, 10};

        int[] result = nextGreaterElement(nums);
        System.out.println(Arrays.toString(result));
    }

    /**
     * Monotonic Stack
     */
    // O(n) TC
    private static int[] nextGreaterElement(int[] nums) {

        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums.length; i++) {

            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {

                int index = stack.pop();
                res[index] = nums[i];
            }

            stack.push(i);

            if (res[i] == 0) {
                res[i] = -1;
            }
        }

        return res;
    }

    // O(n^2) TC
//    private static int[] nextGreaterElement(int[] nums) {
//
//        int[] res = new int[nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//
//            for (int j = i +1; j < nums.length; j++) {
//
//                if (nums[j] > nums[i]) {
//                    res[i] = nums[j];
//
//                    break;
//                }
//            }
//
//            if (res[i] == 0) {
//                res[i] = -1;
//            }
//        }
//
//        return res;
//    }
}
