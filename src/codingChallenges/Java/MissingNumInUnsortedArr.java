package codingChallenges.Java;

import java.util.HashSet;
import java.util.Set;

public class MissingNumInUnsortedArr {

    // Find the Missing Number: Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
    // The array is unsorted, and you are not allowed to use sorting algorithms

    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 4, 6, 0};

        System.out.println(missingNum(arr));
    }

    private static int missingNum(int[] arr) {

        int n = arr.length;
        int expectedSum = (n * (n + 1 )) / 2;
        int actualSum = 0;
        int missingNum;

        for (int i = 0; i < arr.length; i++) {

            actualSum += arr[i];
        }

        missingNum = expectedSum - actualSum;

        return missingNum;
    }
}
